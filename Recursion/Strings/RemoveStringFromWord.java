class RemoveStringFromWord {
  static String removeStringFromWord(String p, String up, String str, String word) {

        if(up.isEmpty()) {
            return p;
        }
        if(up.startsWith(word) && up.startsWith(str)) {
            return removeStringFromWord(p, up.substring(str.length()), str, word);
        }
        else {
            char ch = up.charAt(0);
            return removeStringFromWord(p + ch, up.substring(1), str, word);
        }
    }
}
