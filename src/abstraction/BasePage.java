package abstraction;

public abstract class BasePage {
    // Abstract method
    public abstract void getCompanyName();

    //non abstract method
    public void getCompanyDetails() {
        System.out.println("XYZ Ltd");
    }
}
