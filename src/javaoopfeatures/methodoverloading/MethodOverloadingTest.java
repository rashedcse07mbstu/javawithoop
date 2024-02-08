package javaoopfeatures.methodoverloading;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading= new MethodOverloading();
        methodOverloading.doSum();
        methodOverloading.doSum(10, 290);
        methodOverloading.doSum(10, 10.40f);
        methodOverloading.doSum(10, 10.30f, 10);
        methodOverloading.doSum(10, 10, 10);
        methodOverloading.doSum(10.5f, 10.5f);
    }
}
