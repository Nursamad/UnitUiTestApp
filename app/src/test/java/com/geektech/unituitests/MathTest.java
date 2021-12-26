package com.geektech.unituitests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void simpleAddCase() {
        assertEquals("6", math.add("3", "3"));
        System.out.println("simpleAddCase");
    }

    @Test
    public void simpleNegativeAddCase() {
        assertEquals("-6", math.add("-3", "-3"));
        System.out.println("simpleNegativeAddCase");
    }


    @Test
    public void emptyOneFieldAddCase() {
        assertEquals("3", math.add("", "3"));
        System.out.println("emptyOneFieldAddCase");
    }

    @Test
    public void emptyTwoFieldAddCase() {
        assertEquals("3", math.add("", ""));
        System.out.println("emptyTwoFieldAddCase");
    }

    @Test
    public void charFieldAddCase() {
        assertEquals("No correct", math.add("a", "rwrw"));
        System.out.println("charFieldAddCase");
    }


    @Test
    public void withSpaceAddCase() {
        assertEquals("6", math.add(" 3", "     3   "));
        System.out.println("withSpaceAddCase");
    }

    @Test
    public void twoWordsReverseCase() {
        assertEquals("World Hello", math.reverseWords("Hello World"));
        System.out.println("twoWordsReverseCase");
    }

    @Test
    public void divByZero() {
        assertEquals("0", math.div("4", "0"));
        System.out.println("divByZero");
    }

    //homework

    @Test
    public void multyByZero() {
        assertEquals("0", math.multiply("3", "0"));
        System.out.println("multyByZero");
    }

    @Test
    public void negativeMultyNegative() {
        assertEquals("4", math.multiply("-2", "-2"));
        System.out.println("negativeMultyNegative");
    }

    @Test
    public void positiveMultyNegative() {
        assertEquals("-6", math.multiply("3", "-2"));
        System.out.println("positiveMultyNegative");
    }

    @Test
    public void simpleMultyCase() {
        assertEquals("8", math.multiply("4", "2"));
        System.out.println("simpleMultyCase");
    }

    @Test
    public void divSameDigits() {
        assertEquals("1", math.div("2", "2"));
    }

    @Test
    public void numMultyByOne() {
        assertEquals("4", math.multiply("4", "1"));
    }

    @Test
    public void minusByMinus() {
        assertEquals("6", math.sub("-3", "-3"));
    }

    @Test
    public void zeroSubZero() {
        assertEquals("0", math.sub("0", "0"));
    }
//
//@Test
//public void negativePlusPut(){
//        assertEquals("-6", math.sub("-8" ,"2" ));
//}
    @Test
    public void threeAndMoreWords() {
        assertEquals("Four Three Two One", math.reverseWords("One Two Three Four "));
        System.out.println("threeAndMoreWords");
    }


    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }
}
