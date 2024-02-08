package javaoopfeatures.constructor;

public class DefaultConstructor {
    int number;
    String name;

    // this will be invoked while an object of that class is created.
    DefaultConstructor() {
        System.out.println("Default Constructor called");
    }
}
