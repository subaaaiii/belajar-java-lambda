package belajar.java.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEach {
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("First name", "Subairi");
        map.put("Middle name", "Habibi");
        map.put("Last name", "Hamud");

        for (var e: map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+":"+s2);
            }
        });
        map.forEach((key,value)-> System.out.println(key+":"+value));
    }
}
