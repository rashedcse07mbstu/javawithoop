package javaoopfeatures.methodoverriding;

public class SonaliBank extends BangladeshBank{
    // child class
    @Override
    int getRateOfInterest(){
        return 5;
    }
}
