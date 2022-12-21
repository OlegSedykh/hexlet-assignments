 package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>();
        numbers1 = App.take(numbers1, 2);
        assertThat(numbers1).isEmpty();

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        numbers2 = App.take(numbers2, 2);
        int last = numbers2.get(numbers2.size() - 1);
        assertThat(last).isEqualTo(2);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        numbers3 = App.take(numbers3, 8);
        int last1 = numbers3.get(numbers3.size() - 1);
        assertThat(last1).isEqualTo(4);

        // END
    }
}
