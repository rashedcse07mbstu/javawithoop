package javaoopfeatures.methodoverloading;

public class MethodOverloading {
    //Write a program for Method Overloading oop feature

    //Method not take parameter & not return any value
    public void doSum() {
        System.out.println("SQA Learning Academy");
    }

    //Method take parameter & not return any value
    public void doSum(int x, int y) {
        System.out.println(x + y);
    }

    //Method take parameter &  return ny value
    public void doSum(int x, float y) {
        System.out.println(x + y);
    }

    //Method not take parameter & not return ny value
    public void doSum(int x, float y, int z) {
        System.out.println(x + y + z);
    }

    //Method take parameter & return value
    public int doSum(int num1, int num2, int num3) {
        int resultOfSum = num1 + num2; //resultOfSum is a Local variable
        return resultOfSum;
    }

    //Method take parameter & return value
    public float doSum(float num1, float num2) {
        float resultOfSum = num1 + num2;
        return resultOfSum;
    }

}
