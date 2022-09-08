public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public void changeName(String name){
        this.name = name;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String relayMessage(String message){
        System.out.println(message);
        return message;
    }
}
