package belajar.java.lambda;

import java.util.function.Supplier;

public class SupplierApp {
    static void main() {
        Supplier<String> supplier = ()-> "Subairi";
        System.out.println(supplier.get());
    }
}
