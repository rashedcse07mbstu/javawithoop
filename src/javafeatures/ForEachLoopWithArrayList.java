package javafeatures;

import java.util.ArrayList;

public class ForEachLoopWithArrayList {
    public static void main(String args[]) {
        //Creating a list of String elements
        ArrayList<String> listOfString = new ArrayList<String>();

        //Add to list
        listOfString.add("Rashed");
        listOfString.add("Abrar");
        listOfString.add("Ayman");

        //Show list
        System.out.println("List of Data: " + listOfString);

        //Remove from List
        listOfString.remove(1);

        for (Object stringData : listOfString) {
            System.out.println(stringData);
        }

        //Creating a list of Integer elements
        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();

        //Add to list
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);

        //Show list
        System.out.println("List of Data: " + listOfInteger);

        //Remove from List
        listOfInteger.remove(1);

        for (Object intData : listOfInteger) {
            System.out.println(intData);
        }

        //Creating a list of Object elements
        ArrayList<Object> listOfObject = new ArrayList<Object>();

        //Add to list
        listOfObject.add("Rashed");
        listOfObject.add("Abrar");
        listOfObject.add("Ayman");

        //Show list
        System.out.println("List of ObjectData: " + listOfObject);

        //Remove from List
        listOfObject.remove(1);

        for (Object objectData : listOfObject) {
            System.out.println(objectData);
        }
    }

}