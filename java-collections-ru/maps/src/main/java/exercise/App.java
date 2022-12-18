package exercise;

import java.util.*;

// BEGIN
class App {
//    public static void main(String[] args) {
//        String sss = "the java is the best programming language java";
//        Map dict = getWordCount(sss);
//        System.out.println(toString(dict));
//
//        System.out.println(getWordCount("the java is the best programming language java"));
//
//    }
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsMap = new HashMap<>();
        if (sentence.length() == 0) {
            return wordsMap;
        }
            String[] words = sentence.split(" ");
            for (var word : words) {
                wordsMap.put(word, 0);
            }
            for (var word : words) {

                wordsMap.put(word, wordsMap.get(word) + 1);
            }
            return wordsMap;
    }

    public static String toString(Map dictionary) {
        if (dictionary.size() == 0) {
            return "{}";
        }
        String result = "{";
        for (var s: dictionary.keySet()) {
            result = result + "\n  " + s + ": " + dictionary.get(s);
        }
        result = result + "\n}";
        return result;
    }
}
//END
