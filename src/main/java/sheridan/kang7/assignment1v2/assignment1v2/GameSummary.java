package sheridan.kang7.assignment1v2.assignment1v2;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.annotation.processing.Generated;
import java.lang.annotation.Repeatable;

@EntityScan
@Repeatable(name = "GAMESMEN")
@NamedQuery(query = "select gs from GameSummary gs", name = "query_find_all_summaries")
 public class GameSummary {

    @JsonTypeId
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonEnumDefaultValue(EnumType.STRING)
    Gesture clientGesture;
    private Object EnumType;
    @JsonEnumDefaultValue(EnumType.STRING)
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
