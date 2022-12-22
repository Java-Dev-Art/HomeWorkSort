package org.example.Task1;

public class BubbleSort {
    public char[] sort(char[] actual) {
        if (checkSize(actual)){
            boolean isSort = false;
            char tmp;
            while (!isSort){
                isSort = true;
                for (int i = 0; i< actual.length -1; i++){
                    if (actual[i] > actual[i +1 ]){
                        isSort = false;
                        tmp = actual[i];
                        actual[i] = actual[i + 1];
                        actual[i + 1] = tmp;
                    }
                }
            }
            return actual;
        }
       return null;
    }

    public boolean checkSize(char[] chars) {
        if (chars.length < Character.MAX_VALUE){
            return true;
        }else {
            return false;
        }
    }
}
