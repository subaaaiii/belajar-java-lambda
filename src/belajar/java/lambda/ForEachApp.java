package belajar.java.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    static void main() {
        List<String> list = List.of("Subai", "Joko", "hei");

        for (var value:list){
            System.out.println(value);
        }

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(value -> System.out.println(value));

        list.forEach(System.out::println);
    }

}
