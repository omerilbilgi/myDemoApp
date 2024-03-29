package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static com.mycompany.app.App.concatenateString;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void testConcatenateStringWithEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
       // Integer[] number1 = {10,5};
        Integer[] number1 = new Integer[2];
        number1[0] = 10;
        number1[1] = 5;
        Integer number2 = 20;
        String text = "Hello World";
        String expectedResult = "10 5 20 Hello World";
        String actualResult = App.concatenateString(list, number1, number2, text);
        assertEquals(expectedResult, actualResult);
    }


    public void testConcatenateStringWithNonEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] number1 = new Integer[2];
        number1[0] = 10;
        number1[1] = 5;
        Integer number2 = 20;
        String text = "Hello World";
        String expectedResult = "1 2 3 10 5 20 Hello World";
        String actualResult = App.concatenateString(list, number1, number2, text);
        assertEquals(expectedResult, actualResult);
    }


    public void testConcatenateStringWithNullText() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Integer[] number1 = new Integer[2];
        number1[0] = 10;
        number1[1] = 5;
        Integer number2 = 20;
        String text = null;
        String expectedResult = "1 10 5 20 ";
        String actualResult = App.concatenateString(list, number1, number2, text);
        assertEquals(expectedResult, actualResult);
    }


    public void testConcatenateStringWithEmptyText() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Integer[] number1 = new Integer[2];
        number1[0] = 10;
        number1[1] = 5;
        Integer number2 = 20;
        String text = "";
        String expectedResult = "1 10 5 20 ";
        String actualResult = App.concatenateString(list, number1, number2, text);
        assertEquals(expectedResult, actualResult);
    }


    public void testConcatenateStringWithEmptyListAndText() {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] number1 = new Integer[2];
        number1[0] = 10;
        number1[1] = 5;
        Integer number2 = 20;
        String text = "";
        String expectedResult = "10 5 20 ";
        String actualResult = App.concatenateString(list, number1, number2, text);
        assertEquals(expectedResult, actualResult);
    }
/*
    public void testWithMultipleOccurrencesOfSameNumber() {
        String text = "1,1,2,3,3,3,4,4,4,4";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        additionalNumbers.add(3);
        additionalNumbers.add(4);
        int expectedResult = 4;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, actualResult);
    }


    public void testWithSingleNumber() {
        String text = "2,2,2,2,2";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        additionalNumbers.add(3);
        int expectedResult = 2;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, expectedResult);
    }


    public void testWithNullAdditionalNumbers() {
        String text = "1,2,3,4,5";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = null;
        int expectedResult = 1;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, expectedResult);
    }


    public void testWithEmptyText() {
        String text = "";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        additionalNumbers.add(1);
        int expectedResult = 0;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, expectedResult);
    }


    public void testWithNoAdditionalNumbers() {
        String text = "1,2,3,4,5";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        int expectedResult = 1;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, expectedResult);
    }*/
}


  /*  @Test
    public void testSingleRepeatedNumber() {
      int[] numbers = {1, 2, 3, 4, 5, 1};
      int expected = 1;
      int actual = findMostFrequentNumber(numbers);
      assertEquals(expected, actual);
    }
    
    @Test
public void testMultipleRepeatedNumber() {
  int[] numbers = {1, 2, 3, 4, 5, 1, 1};
  int expected = 1;
  int actual = findMostFrequentNumber(numbers);
  assertEquals(expected, actual);
}


@Test
public void testAllNumbersDifferent() {
  int[] numbers = {1, 2, 3, 4, 5};
  int expected = -1; // Hiç tekrarlanan sayı yok
  int actual = findMostFrequentNumber(numbers);
  assertEquals(expected, actual);
}

@Test
public void testEmptyArray() {
  int[] numbers = {};
  int expected = -1; // Hiç tekrarlanan sayı yok
  int actual = findMostFrequentNumber(numbers);
  assertEquals(expected, actual);
}

@Test
public void testNullArray() {
  int[] numbers = null;
  int expected = -1; // Hiç tekrarlanan sayı yok
  int actual = findMostFrequentNumber(numbers);
  assertEquals(expected, actual);
}







    public void testApp()
    {
        assertTrue( true );
    }

     public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }
*/
    /*public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }*/

   /* public void testNull() {
      assertFalse(new App().search(null, 1));
    }

}
*/