package TreeSet;

import java.util.TreeSet;

public class Fruit {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("10");
        ts.add("20");
        ts.add("Apple");
        ts.add("40");
        ts.add("Sam");
        ts.add("8000000");
        ts.add("70");

        System.out.println(ts);
    }
}
