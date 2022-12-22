package org.example;

import org.example.Task1.InsertionSort;
import org.example.Task1.SelectedSort;
import org.example.Task3.Task3;

public class Main {
    public static void main(String[] args) {
//        SelectedSort selectedSort = new SelectedSort();
//        InsertionSort insertionSort = new InsertionSort();
//        char[] chars = {'1','4','8','2','0','5','7','8','9'};
//        display(chars);
////        selectedSort.sort(chars);
//        insertionSort.sort(chars);
//        display(chars);
        Task3 task3 = new Task3();
        String[] nameActual =new String[]{"Egor","Artiom","Egor","Vlad","Igor","Ivan","Kirill"};
        String[] lastNameActual = new String[]{"Anufriev","Abikenov","Kalinchuk","Ilyin","Loginov","Minin","Fomichev"};

        task3.sort(nameActual,lastNameActual);
        displayStr(nameActual);
        displayStr(lastNameActual);



    }
    public static void display(char[] chars){
        for(char c: chars){
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void displayStr(String[] strings){
        for(String s: strings){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}