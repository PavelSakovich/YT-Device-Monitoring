import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = List.of("555", "sad", "1", "2", "11", "21", "24", "54", "asda", "34", "23", "12");

        int sum = list.stream()
                .filter(x -> {
                    try {
                        Integer.parseInt(x);
                    } catch (NumberFormatException e) {
                        return false;
                    } catch (NullPointerException e) {
                        return false;
                    }
                    return true;
                })
                .mapToInt(Integer::valueOf)
                .filter(x -> x < 30)
                .sum();

        System.out.println(sum);
    }
}