public class Passenger {

    private String name;
    private Integer numberOfBags;

    public Passenger(String name, Integer numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName(){
        return this.name;
    }

    public void changeName(String new_name){
        this.name = new_name;
    }

    public Integer getNumberOfBags(){
        return this.numberOfBags;
    }

}
