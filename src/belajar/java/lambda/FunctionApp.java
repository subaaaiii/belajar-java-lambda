package belajar.java.lambda;

import java.util.function.Function;

public class FunctionApp {
    static void main() {
        Function <String, Integer> functionLength = value -> value.length();
        System.out.println(functionLength.apply("subairi"));
    }
}
