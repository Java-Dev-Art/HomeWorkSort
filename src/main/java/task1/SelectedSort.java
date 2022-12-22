package task1;

public class SelectedSort {
    public char[] sort(char[] chars){
        char temp;
        int pos;
        if (checkSize(chars)){
            for (int i = 0; i < chars.length; i++){
                pos = i;
                for (int j = i + 1; j < chars.length; j++){
                    if (chars[j] < chars[pos]){
                        pos = j;
                    }
                }
                temp = chars[pos];
                chars[pos] = chars[i];
                chars[i] = temp;
                if (chars[i]=='-' || chars[i] == '+'){
                    chars[i] = '0';
                }
            }

            return chars;
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
