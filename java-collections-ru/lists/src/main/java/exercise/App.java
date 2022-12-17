package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
        public static boolean scrabble(String alfa, String word) {
        List<Character> list = new ArrayList<>();
        word = word.toLowerCase();
        for (int i = 0; i < alfa.length(); i++) {
            var x = alfa.charAt(i);
            list.add(x);
        }

        if (alfa.length() < word.length()) {
            return false;
        }

        for (int y = 0; y < word.length(); y++) {
            var xxx = word.charAt(y);
            if (list.contains(xxx)) {
                var out = list.indexOf(xxx);
                list.remove(out);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
