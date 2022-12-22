package test2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task2.BubbleSortString;

import java.util.Arrays;

public class BubbleSortStringTest {
    private static BubbleSortString sort;
    private  static String [] expected;
    private  static String[] actual;

    @BeforeAll
    static void init(){
        sort = new BubbleSortString();
    }
    {
        expected = new String[]{"Artem", "Egor", "Egor", "Igor", "Ivan", "Vlad"};
        //"Anufriev","Abikenov","Kalinchuk", "Ilyin","Loginov","Minin",
        actual = new String[]{"Egor","Artem","Egor","Vlad","Igor","Ivan"};
    }
    @Test
    public void checkSelectionSort(){

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(sort.sort( actual)),"Some arrays must be equels ");
    }
    @Test
    public void checkSizeOfArray(){
        boolean isActual = sort.checkSize( actual);
        Assertions.assertTrue(isActual,"arrays can't be empty");
    }

    @AfterAll
    public static void testClassAssignNull(){
        sort = null;
        expected = null;
        actual = null;
    }
}
