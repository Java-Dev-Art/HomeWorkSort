package task2;

import java.util.Optional;

public class BubbleSortString {
    public String[] sort(String[] actual) {
        if (checkSize(actual)){
            boolean isSort = false;
            String tmp;
            while (!isSort){
                isSort = true;
                for (int i = 0; i< actual.length -1; i++){
                    if (actual[i].compareTo(actual[i +1 ]) > 0){
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

    public boolean checkSize(String[] actual) {
        if (Optional.ofNullable(actual).isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
