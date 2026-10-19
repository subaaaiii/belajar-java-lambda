package belajar.java.lambda;

import java.util.function.Supplier;

public class LazyApp {
    static void main() {
        testScore(75, ()->getName());
    }
    public static void testScore(int score, Supplier<String> name){
        if (score >80){
            System.out.println("SELAMAT "+ name.get()+ ", ANDA LULUS");
        }else {
            System.out.println("COBA LAGI TAHUN DEPAN");
        }
    }
    public static String getName(){
        System.out.println("getname dipanggil");
        return "Subairi";
    }

}
