package test3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task3.Task3;

import java.util.Arrays;

public class Task3Test {
    private static Task3 task3;
    private String[] nameExpected;
    private String[] lastNameExpected;
    private String[] nameActual;
    private String[] lastNameActual;
    @BeforeAll
    public static void init(){
        task3 = new Task3();
    }
    {
        nameExpected = new String[]{"Artiom","Egor","Egor","Igor","Ivan","Kirill","Vlad"};
        lastNameExpected = new String[]{"Abikenov","Anufriev","Kalinchuk","Loginov","Minin","Fomichev","Ilyin"};
        nameActual =new String[]{"Egor","Artiom","Egor","Vlad","Igor","Ivan","Kirill"};
        lastNameActual = new String[]{"Anufriev","Abikenov","Kalinchuk","Ilyin","Loginov","Minin","Fomichev"};

    }
    @Test
    public void checkSortTask(){

        Assertions.assertEquals(Arrays.toString(nameExpected),Arrays.toString(task3.sort(nameActual,lastNameActual)));

    }
    @AfterAll
    public static void after(){
        task3 = null;
    }

}
