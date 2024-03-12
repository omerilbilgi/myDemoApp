package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    @Test
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

    /*public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }*/

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }

}
