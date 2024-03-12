package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static com.mycompany.app.App.findMostFrequentNumber;

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
        assertEquals(expectedResult, actualResult);
    }


    public void testWithNullAdditionalNumbers() {
        String text = "1,2,3,4,5";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = null;
        int expectedResult = 1;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, actualResult);
    }


    public void testWithEmptyText() {
        String text = "";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        additionalNumbers.add(1);
        int expectedResult = 1;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, actualResult);
    }


    public void testWithNoAdditionalNumbers() {
        String text = "1,2,3,4,5";
        Integer number1 = 1;
        Integer number2 = 2;
        ArrayList<Integer> additionalNumbers = new ArrayList<>();
        int expectedResult = 1;
        int actualResult = App.findMostFrequentNumber(text, number1, number2, additionalNumbers);
        assertEquals(expectedResult, actualResult);
    }
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