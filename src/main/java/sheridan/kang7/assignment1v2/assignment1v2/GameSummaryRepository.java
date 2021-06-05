package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

@Repository
@QuartzTransactionManager

public class GameSummaryRepository<EntityManager> {
    @PersistenceContext
    private EntityManager entityManager;

    public GameSummary find(long id) {
        return entityManager.find(GameSummary.class, id);
    }

    public List<GameSummary> findAll() {
        Query query = entityManager.createNamedQuery("query_find_all_summaries", GameSummary.class);
        return query.getResultList();
    }

    public long insert(GameSummary gs) {
        entityManager.persist(gs);
        ;
        return gs.getId();
    }
}
