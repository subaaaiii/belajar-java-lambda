package belajar.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    static void main() {
        List <String> list = new ArrayList<>();
        list.addAll(List.of("Subairi", "Eko", "Eka"));

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });

        list.removeIf(value -> value.length() > 5);

        list.forEach(System.out::println);
        System.out.println(list);
    }
}
