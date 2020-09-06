package com.codecool;

public class FizzBuzz {

    public String convert(int i) {
        if ( i% 5==0){
            return "Buzz";
        }
        if (i % 3 == 0){
            return "Fizz";
        }
        else {
            return Integer.toString(i);
        }
    }
}
