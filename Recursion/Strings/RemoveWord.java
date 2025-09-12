import java.util.*;
class RemoveWord {

    public static void main(String[] args) {

        var str = "Hello Paavan, My name is Kylie";

        System.out.println(removeWord("", str, " "));
    }
    static String removeWord(String p, String up, String word) {

        if(up.isEmpty()) {
            return p;
        }
        if(up.startsWith(word)) {
            return removeWord(p, up.substring(word.length()), word);
        }
        else {
            char ch = up.charAt(0);
            return removeWord(p + ch, up.substring(1), word);
        }

    }
}
