package sheridan.kang7.assignment1v2.assignment1v2;

@Repository
@Transactional

public class GameSummaryRepository {
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
