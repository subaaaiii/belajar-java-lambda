package belajar.java.lambda;

import java.util.function.Consumer;

public class ConsumerApp {
    static void main() {
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("subairi");
    }
}
