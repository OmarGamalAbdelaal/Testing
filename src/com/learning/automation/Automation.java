package com.learning.automation;

public class Automation {
    public static void main(String[] args) {
         // int number = 10;
        int [] array1 = new int [10] ;
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;
        array1[5] = 60;
        array1[6] = 70;
        array1[7] = 80;
        array1[8] = 90;
        array1[9] = 100;

        String myName = new String();
        myName = "Omar";
        System.out.println(myName);

        // System.out.println(number);
        // for (int i = 0; i < array1.length; i++) {
        // System.out.println(array1[i]);
        // }
        int i = 0;
        while (i< array1.length) {
            System.out.println(array1[i]);
            i++;
        }
        // System.out.println(i);
        // do{
        //     System.out.println(array1[i]);
        //     i++;
        // }while(i<array1.length);
        
    }
}

