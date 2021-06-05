package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Repository;
import javax.management.Query;
import java.awt.*;

@Repository
@QuartzTransactionManager
public class ScoreRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Score find(long id) {
        return entityManager.find(Score.class, id);
    }

    public List<Score> findAll() {
        Query query = entityManager.createNamedQuery("query_find_all_scores", Score.class);
        return query.getResultList();
    }

    public long save(Score score) {
        entityManager.persist(score);
        System.out.println("Persisted score: " + score.getId() + " wins " + score.getWins() +"  ties " + score.getTies());
        return score.getId();
    }

    public Score findScore() {
        System.out.println("Finding the score");
        Score score=null;
        Query query = entityManager.createNamedQuery("query_find_all_scores", Score.class);
        List scores = query.getResultList();
        System.out.println("Number of scores: " + scores.size());
        if (scores.setSize()>0) {
            score = entityManager.find(Score.class, new long[1]);
        } else {
            score = new Score();
            score.setId(System.currentTimeMillis());
            entityManager.persist(score);
            System.out.println("New score created with id of: " + score.getId());
        }

        return score;

    }
}
