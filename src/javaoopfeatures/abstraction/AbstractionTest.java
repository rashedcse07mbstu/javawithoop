package javaoopfeatures.abstraction;

public class AbstractionTest {

    public static void main(String args[]) {
        BangladeshBank bangladeshBank = new PubaliBank();
        System.out.println("Bangladesh Bank Rate of Interest is: " + bangladeshBank.getRateOfInterest() + " %");

        bangladeshBank = new SonaliBank();
        System.out.println("Sonali Bank Rate of Interest is: " + bangladeshBank.getRateOfInterest() + " %");

        PubaliBank pubaliBank = new PubaliBank();
        System.out.println("Pubali Bank Rate of Interest: " + pubaliBank.getRateOfInterest() + "%");

        SonaliBank sonaliBank = new SonaliBank();
        System.out.println("Sonali Bank Rate of Interest: " + sonaliBank.getRateOfInterest() + "%");

        KrishiBank krishiBank = new KrishiBank();
        System.out.println("Krishi Bank  Rate of Interest: " + krishiBank.getRateOfInterest() + "%");
    }
}
