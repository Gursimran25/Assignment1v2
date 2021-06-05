package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.lang.annotation.Repeatable;

@EntityScan
@Repeatable(name = "GAMESUMMARY")
@NamedQuery(query = "select gs from GameSummary gs", name = "query_find_all_summaries")
public class GameSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    Gesture clientGesture;
    @Enumerated(EnumType.STRING)
    Gesture serverGesture;
    String result;
    java.util.Date date = new java.util.Date();

    public GameSummary() {
    }

    public GameSummary(Gesture clientGesture, Gesture serverGesture) {
        super();
        this.clientGesture = clientGesture;
        this.serverGesture = serverGesture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gesture getClientGesture() {
        return clientGesture;
    }

    public void setClientGesture(Gesture clientGesture) {
        this.clientGesture = clientGesture;
    }

    public Gesture getServerGesture() {
        return serverGesture;
    }

    public void setServerGesture(Gesture serverGesture) {
        this.serverGesture = serverGesture;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }
}
