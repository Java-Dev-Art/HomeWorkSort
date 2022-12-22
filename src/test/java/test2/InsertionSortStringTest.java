package test2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task2.InsertionSortString;

import java.util.Arrays;

public class InsertionSortStringTest {
    private static InsertionSortString sort;
    private  static String [] expected;
    private  static String[] actual;

    @BeforeAll
    static void init(){
        sort = new InsertionSortString();
    }
    {
        expected = new String[]{"Art","Bart","Bonk","Dest"};
        actual = new String[]{"Art","Dest","Bart","Bonk"};
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
