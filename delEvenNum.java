import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class delEvenNum {
    public static void main(String[] args) {
        System.out.println(get(Arrays.asList(8, 16, 3, 1, 29, 11)));
    }

    static List<Integer> get(List<Integer> integers) {
        Map<Boolean, List<Integer>> map = integers.stream()
                .collect(partitioningBy(x -> x % 2 == 0, toList()));
        return map.get(map.get(false).size() % 2 != 0);
    }
}