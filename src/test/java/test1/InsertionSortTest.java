package test1;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task1.InsertionSort;

import java.util.Arrays;

public class InsertionSortTest {
    private static InsertionSort sort;
    private  static char [] expected;
    private  static char[] actual;
    @BeforeAll
    static void init(){
        sort = new InsertionSort();
    }
    {
        expected = new char[]{'1','2','3','4'};
        actual = new char[]{'1','3','4','2'};
    }
    @Test
    public void checkSelectionSortWithNaturalDigitWillIncrece(){
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(sort.sort(actual)),"Some arrays must be equls ");
    }
    @Test
    public void checkSizeOfArray(){
        boolean isActual = sort.checkSize(actual);
        Assertions.assertTrue(isActual,"Size of chars array must be < than we have");
    }

    @AfterAll
    public static void testClassAssignNull(){
        sort = null;
        expected = null;
        actual = null;
    }
}
