package exercise;

import java.util.*;

// BEGIN
public class App {
//    public static void main(String[] args) {
//        Map<String, Object> data1 = new HashMap<>(
//                Map.of("one", "eon", "two", "two", "four", true)
//        );
//        System.out.println(data1);
//
//        Map<String, Object> data2 = new HashMap<>(
//                Map.of("two", "own", "zero", 4, "four", true)
//        );
//        System.out.println(data2);
//        System.out.println(genDiff(data1, data2));
//    }

    public static LinkedHashMap genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        TreeSet<String> listKey = new TreeSet();
        for (Map.Entry<String, Object> dat: data1.entrySet()) {
            listKey.add(dat.getKey());
        }
        for (Map.Entry<String, Object> dat: data2.entrySet()) {
            listKey.add(dat.getKey());
        }
        for (String key : listKey) {
            String diffValue = getValue(key, data1, data2);
            result.put(key, diffValue);
        }
        return result;
    }

        public static String getValue(String key, Map<String, Object> data1, Map<String, Object> data2) {
            if (data1.containsKey(key) && data2.containsKey(key)) {
                if (data1.get(key).equals(data2.get(key))) {
                    return "unchanged";
                }
                    return "changed";
            } else if (data1.containsKey(key)) {
                return "deleted";
            }
            return "added";
        }
}
