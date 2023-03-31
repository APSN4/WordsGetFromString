import java.util.*;


class Main {
    public static String anyText = "Hello, Moscow this text is test";
    public static void main(String[] args)   {
        System.out.println(wordsFunc(anyText));
    }

    public static ArrayList<String> wordsFunc(String anyText) {
        String local = "";
        ArrayList<String> anyWordsList = new ArrayList<String>();
        char whitespace = ' ';
        char comma = ',';
        for(int i = 0; i < anyText.length(); i++ ) {
            if (anyText.charAt(i) != whitespace)  {
                if(anyText.charAt(i) == comma) {continue;}
                local += anyText.charAt(i);
                if (i == anyText.length() - 1) {
                    anyWordsList.add(local);
                    local = "";
                }
            } else {
                anyWordsList.add(local);
                local = "";
            }
        }
        return anyWordsList;
    }
}