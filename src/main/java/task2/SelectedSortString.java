package task2;

import java.util.Optional;

public class SelectedSortString {
    public String[] sort(String[] actual) {
        int pos;
        String tmp;
        if (checkSize(actual)){
            for (int i = 0; i < actual.length; i++){
                pos = i;
                for (int j = i + 1; j < actual.length; j++){
                    if (actual[j].compareTo(actual[pos]) < 0){
                        pos = j;
                    }
                }
                tmp = actual[pos];
                actual[pos] = actual[i];
                actual[i] = tmp;

            }
        }
        return actual;
    }

    public boolean checkSize(String[] actual) {
        if (Optional.ofNullable(actual).isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
