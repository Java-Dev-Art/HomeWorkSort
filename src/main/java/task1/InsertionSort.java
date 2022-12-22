package org.example.Task1;

public class InsertionSort {
    public char[] sort(char[] actual) {

        if (checkSize(actual)){
            for (int left = 0; left < actual.length; left++) {
                char value = actual[left];

                int i = left - 1;
                while (i >= 0) {
                    if (value < actual[i]) {
                        actual[i + 1] = actual[i];
                        i--;
                    } else {
                        break;
                    }
                }
                actual[i + 1] = value;
            }
            return actual;
        }else {
            return null;
        }
    }

    public boolean checkSize(char[] chars) {
        if (chars.length < Character.MAX_VALUE){
            return true;
        }else {
            return false;
        }
    }
}
