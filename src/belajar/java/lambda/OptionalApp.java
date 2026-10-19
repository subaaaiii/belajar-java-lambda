package belajar.java.lambda;

import java.util.Locale;
import java.util.Optional;

public class OptionalApp {
    static void main() {
        sayHello("Subairi");
        sayHello(null);
    }
    public static void sayHello(String name){
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper =  optionalName.map(value -> value.toUpperCase());

        optionalNameUpper.ifPresent(value-> System.out.println("Hello, "+value));

//        Bentuk paling simple
        Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);

        Optional.ofNullable(name).map(String::toUpperCase).ifPresentOrElse(
                value-> System.out.println("Hello, "+value),
                ()-> System.out.println("Hello")
        );
        String gantiTeman = Optional.ofNullable(name).map(String::toUpperCase).orElse("TEMAN");
        System.out.println("Hello "+gantiTeman);
    }
}
