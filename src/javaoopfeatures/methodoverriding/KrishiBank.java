package javaoopfeatures.methodoverriding;

public class KrishiBank extends BangladeshBank {
    //Child Class
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
