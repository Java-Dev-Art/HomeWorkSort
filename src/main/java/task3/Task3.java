package task3;

import java.util.Optional;

public class Task3 {
    public String [] sort(String[] names, String[] lastNames ) {
        int pos;
        String name;
        if (checkSize(names)){
            for (int i = 0; i < names.length; i++){
                pos = i;
                for (int j = i + 1; j < names.length; j++){
                    if (names[j].compareTo(names[pos]) < 0){
                        pos = j;
                    }
                }
                name = names[pos];
                names[pos] = names[i];
                names[i] = name;
                swap(lastNames,i,pos);
            }
            return names;
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
    public String[] swap(String [] lastNames,int indexFirst, int indexSecond){
        String tmp = lastNames[indexFirst];
        lastNames[indexFirst] = lastNames[indexSecond];
        lastNames[indexSecond] = tmp;
        return lastNames;
    }
}
