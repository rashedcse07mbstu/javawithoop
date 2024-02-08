package javaoopfeatures.constructor;

public class ParameterizedConstructorTest {
    public static void main(String[] args)
    {
        // will call the parameterized constructor.
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("SQA", 1);
        System.out.println("Name is :" + " " + parameterizedConstructor.getName()  + "\n" +
                " and Id is :" + " " + parameterizedConstructor.getId());
    }
}
