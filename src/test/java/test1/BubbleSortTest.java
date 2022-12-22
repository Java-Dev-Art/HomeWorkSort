package test1;

import org.example.Task1.BubbleSort;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    private static BubbleSort sort;
    private  static char [] expected;
    private  static char[] actual;
    @BeforeAll
    static void init(){
        sort = new BubbleSort();
    }
    {
        expected = new char[]{'1', '2', '3', '4'};
        actual = new char[]{'1','3','2','4'};
    }
    @Test
    public void checkSelectionSortWithNaturalDigitWillIncrece(){
        Assertions.assertArrayEquals(expected,sort.sort(actual),"Some arrays must be equels ");
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
