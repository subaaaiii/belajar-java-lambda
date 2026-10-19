package belajar.java.lambda;

import belajar.java.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    static void main() {
//        Predicate<String>  predicateIsLowerCase = value-> StringUtil.isLowerCase(value);
        Predicate<String>  predicateIsLowerCase = StringUtil::isLowerCase;
        System.out.println(predicateIsLowerCase.test("Subairi"));
        System.out.println(predicateIsLowerCase.test("subairi"));

        Function<String, String> functionUpper1 = value -> value.toUpperCase();
        Function<String, String> functionUpper2 =  String::toUpperCase;

        System.out.println(functionUpper1.apply("eko"));
        System.out.println(functionUpper2.apply("eka"));

        MethodReferenceApp app = new MethodReferenceApp();

        System.out.println("RUN");
        app.run();
        System.out.println("RUN 2");
        app.run2();

    }

    public void run(){
        Predicate<String> predicateIsLoweCase = this::isLowerCase;
        System.out.println(predicateIsLoweCase.test("Subairi"));
        System.out.println(predicateIsLoweCase.test("subairi"));
    }

    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLoweCase = app::isLowerCase;
        System.out.println(predicateIsLoweCase.test("Subairi"));
        System.out.println(predicateIsLoweCase.test("subairi"));
    }

    public boolean isLowerCase(String value){
        for(var c:value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    };
}
