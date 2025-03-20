package Practice;

import java.util.ArrayList;

public class Que8 {
    public static void main(String[] args) {
        ArrayList <String> A1 =new ArrayList<>();
        A1.add("One");
        A1.add("Two");
        A1.add("Four");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Three");
        list2.add("Four");

        System.out.println("Comparing both ArrayLists : " + A1.equals(list2));
    }
}
