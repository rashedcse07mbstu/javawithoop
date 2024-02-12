package javaoopfeatures.methodoverriding;

public class PubaliBank extends BangladeshBank{
    //child class
    @Override
    int getRateOfInterest(){
        return 9;
    }
}
