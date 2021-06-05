package sheridan.kang7.assignment1v2.assignment1v2;

@Entity
@Table(name = "score", schema="wasadmin")
@NamedQuery(query = "select s from Score s", name = "query_find_all_scores")
public class Score {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    private int wins, losses, ties;

    public void increaseWins(){
        System.out.println("Increasing wins in the bean");;
        wins++;
    }
    public void increaseLosses(){
        losses++;
    }
    public void increaseTies(){
        ties++;
    }

    public String toString(){
        String output = "Wins: " + wins + " Ties: " + ties + " Losses: " + losses;
        return output;
    }

    public int getWins()   {return wins;}
    public int getLosses() {return losses;}
    public int getTies()   {return ties;}

}
