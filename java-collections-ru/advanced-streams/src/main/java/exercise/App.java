package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        String result = Arrays.stream(content.split("\n"))
                .filter(str -> str.startsWith("environment"))
                .map(str -> str.replaceAll("environment=", ""))
                .map(str -> str.replaceAll("\"", ""))
                .flatMap(str -> Stream.of(str.split(",")))
                .filter(str -> str.startsWith("X_FORWARDED_"))
                .map(str -> str.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));

        return result;
    }
}
//END
