package belajar.java.lambda;

public class SimpleActionApp {
    static void main() {
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Subairi";
//            }
//        };
//        System.out.println(simpleAction1.action());
//
//        SimpleAction simpleAction2 = () ->{
//            return "pakai lambda";
//        };
//        System.out.println(simpleAction2.action());
//
//
        SimpleAction simpleAction = (String value)->{
          return "Hello "+value;
        };

        SimpleAction simpleAction2 = (value)->{
          return "Hello "+value;
        };
        SimpleAction simpleAction3 = (String value)-> "Hello "+value;
        SimpleAction simpleAction4 = (value)-> "Hello "+value;
        SimpleAction simpleAction5 = value-> "Hello "+value;

        System.out.println(simpleAction.action("subairi1"));
        System.out.println(simpleAction2.action("subairi2"));
        System.out.println(simpleAction3.action("subairi3"));
        System.out.println(simpleAction4.action("subairi4"));
        System.out.println(simpleAction5.action("subairi5"));



    }
}
