package com.codecool;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    public void shouldConvertTo1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.convert(1));

    }

    @Test
    public void shouldConvertTo3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void shouldConvert5ToBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

}