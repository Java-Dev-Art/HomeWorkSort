package task2;

import java.util.Optional;

public class InsertionSortString {
    public String[] sort(String[] actual) {
        if (checkSize(actual)){
            for (int left = 0; left < actual.length; left++) {
                String value = actual[left];

                int i = left - 1;
                while (i >= 0) {
                    if (value.compareTo(actual[i]) < 0) {
                        actual[i + 1] = actual[i];
                        i--;
                    } else {
                        break;
                    }
                }
                actual[i + 1] = value;
            }
            return actual;
        }
        return null;
    }

    public boolean checkSize(String[] actual) {
        if (Optional.ofNullable(actual).isPresent()){
            return true;
        }
        return false;
    }
}
