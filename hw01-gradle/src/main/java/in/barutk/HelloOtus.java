package in.barutk;

import com.google.common.base.Predicates;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloOtus {
    public static void main(String... args) {
        List<String> list = Stream.of("One", "Two", null, "Four", "Five", null)
                .collect(Collectors.toList());
        System.out.println("list before = " + list.toString());
        list.removeIf(Predicates.isNull());
        System.out.println("list after = " + list.toString());

    }
}
