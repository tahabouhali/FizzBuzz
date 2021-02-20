package com.fizzbuzz;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class fizzbuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }
   @Test
   public void shoudReturn1ifNumberIs1(){
       assertEquals("1",fizzBuzz.generate(1,1));
   }
    @Test
    public void shoudReturn2ifNumberIs2(){
        assertEquals("2",fizzBuzz.generate(2,2));
    }
    @Test
    public void shoudReturnFizzIfNumberIs3(){
        assertEquals("Fizz",fizzBuzz.generate(3,3));
    }
    @Test
    public void shoudReturnFizzIfNumberIs6(){
        assertEquals("Fizz",fizzBuzz.generate(6,6));
    }
    @Test
    public void shoudReturnBuzzIfNumberIs5(){
        assertEquals("Buzz",fizzBuzz.generate(5,5));
    }
    @Test
    public void shoudReturnBuzzIfNumberIs10(){
        assertEquals("Buzz",fizzBuzz.generate(10,10));
    }
    @Test
    public void shoudReturnFizzBuzzIfNumberIs15(){
        assertEquals("FizzBuzz",fizzBuzz.generate(15,15));
    }
    @Test
    public void shoudReturnFizzBuzzIfNumberIs30(){
        assertEquals("FizzBuzz",fizzBuzz.generate(30,30));
    }
    @Test
    public void shoudReturn12IfNumberIs1and2(){
        assertEquals("12",fizzBuzz.generate(1,2));
    }
    @Test
    public void shoudReturn12FizzIfNumberIs1To2(){
        assertEquals("12Fizz",fizzBuzz.generate(1,3));
    }
    @Test
    public void shoudReturn12Fizz4BuzzIfNumberIs1To5(){
        assertEquals("12Fizz4Buzz",fizzBuzz.generate(1,5));
    }
    @Test
    public void shoudReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzIfNumberIs1To15(){
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz",fizzBuzz.generate(1,15));
    }

}