package belajar.java.lambda;

import java.util.function.Predicate;

public class PredicateApp {
    static void main() {
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(" "));
        System.out.println(predicateCheckBlank.test("subairi"));
    }
}
