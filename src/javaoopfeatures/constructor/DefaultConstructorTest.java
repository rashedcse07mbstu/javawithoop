package javaoopfeatures.constructor;

public class DefaultConstructorTest {
    public static void main(String[] args) {
        // default constructor
        DefaultConstructor defaultConstructor = new DefaultConstructor(); //will call to default constructor

        // For default DefaultConstructor 0 will be for number, null for string
        System.out.println(defaultConstructor.number);
        System.out.println(defaultConstructor.name);
    }
}
