package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

@Repository
@QuartzTransactionManager

public class GameSummaryRepository<EntityManager> {
    
    private EntityManager entityManager;

    public GameSummary find(long id) {
        return entityManager.find(GameSummary.class, id);
    }

    public long insert(GameSummary gs) {
        entityManager.persist(gs);
        ;
        return gs.getId();
    }
}
