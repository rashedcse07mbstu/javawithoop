package javaoopfeatures.encapsulation;

public class Encapsulation {
    // private variables those are only accessible by getter & Setter method
    private String name;  //encapsulated name variable by private access modifier
    private String id;
    private int age;

    //Set name by setName method
    public void setName(String name) {
        this.name = name;
    }

    //Get  Name by getName method
    public String getName() {
        return name;
    }

    //Set Age by setAge method
    public void setAge(int Age) {
        age = Age;
    }

    //Get  Age by getAge method
    public int getAge() {
        return age;
    }

    //Set id by setId method
    public void setId(String Id) {
        id = Id;
    }

    //Get Id by getId method
    public String getId() {
        return id;
    }

}
