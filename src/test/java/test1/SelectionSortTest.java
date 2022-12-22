package test1;

import org.example.Task1.SelectedSort;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionSortTest {
    private static SelectedSort sort;
    private  static char [] expected;
    private  static char[] actual;

    @BeforeAll
    static void init(){
        sort = new SelectedSort();
    }
    {
        expected = new char[]{'1', '2', '3', '4'};
        actual = new char[]{'1','3','2','4'};
    }
    @Test
    public void checkSelectionSortWithNaturalDigitWillIncrice(){

        Assertions.assertArrayEquals(expected,sort.sort(actual),"Some arrays must be equels ");
    }
    @Test
    public void checkSizeOfArray(){
        boolean isActual = sort.checkSize(actual);
        Assertions.assertTrue(isActual,"Size of chars array must be < than we have");
    }
    {
        expected = new char[]{'0', '0', '3', '4'};
        actual = new char[]{'-','-','4','3'};
    }
    @Test
    public void checkSelectionSortWithoutSymbolsDeter(){
        Assertions.assertEquals(Arrays.toString(expected),
                Arrays.toString(sort.sort(actual)),
                "Some arrays must be equels ");
    }
    @AfterAll
    public static void testClassAssignNull(){
        sort = null;
    }
}
