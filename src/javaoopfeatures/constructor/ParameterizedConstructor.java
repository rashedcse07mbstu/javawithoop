package javaoopfeatures.constructor;

public class ParameterizedConstructor {
    String name;
    int id;

    // Parameterized Constructor
    ParameterizedConstructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
