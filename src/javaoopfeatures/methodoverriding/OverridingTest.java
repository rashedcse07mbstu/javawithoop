package javaoopfeatures.methodoverriding;

public class OverridingTest {
   /*Java Program to demonstrate the Java Method Overriding example
   where three classes are overriding the method of a parent class
   */

    public static void main(String args[]) {
        PubaliBank s = new PubaliBank();
        System.out.println("Pubali Bank Rate of Interest: " + s.getRateOfInterest());

        SonaliBank i = new SonaliBank();
        System.out.println("Sonali Bank Rate of Interest: " + i.getRateOfInterest());

        KrishiBank a = new KrishiBank();
        System.out.println("Krishi Bank  Rate of Interest: " + a.getRateOfInterest());
    }
}
