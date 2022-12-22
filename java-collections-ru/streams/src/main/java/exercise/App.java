package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static Integer getCountOfFreeEmails(List<String> emailsList) {
        int countEmails = (int) emailsList.stream()
                .filter(email -> email.endsWith("gmail.com")
                        || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();
        return countEmails;
    }
}
// END
