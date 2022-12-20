package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
    class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map book: books) {
            boolean suits = true;
            for (Map.Entry<String, String> keyWhere: where.entrySet()) {
                if (!keyWhere.getValue().equals(book.get(keyWhere.getKey()))) {
                    suits = false;
                }
            }
            if (suits) {
                result.add(book);
            }
        }
        return result;

    }
}

//END
