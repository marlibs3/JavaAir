public class Pilot {

    private String name;
    private Rank rank;
    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber){
        this.name = name;
        this.rank = rank;
        this.licenseNumber = licenseNumber;
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

    public void flyPlane(){
        System.out.println("Buckle up buddy");
    }
}
