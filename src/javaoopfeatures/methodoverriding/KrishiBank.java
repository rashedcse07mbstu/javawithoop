package javaoopfeatures.methodoverriding;

public class KrishiBank extends BangladeshBank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
