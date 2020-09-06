package com.codecool;

public class FizzBuzz {

    public static String convert(int i) {
        if (i % 5 == 0 && i % 3 == 0){
            return "FizzBuzz";
        }
        if ( i % 5==0){
            return "Buzz";
        }
        if (i % 3 == 0){
            return "Fizz";
        }
        else {
            return Integer.toString(i);
        }
    }

    public static void printList(){
        for (int i = 1; i<=100; i++){
            System.out.println(convert(i));
        }
    }

    public static void main(String[] args) {
        printList();
    }
}
