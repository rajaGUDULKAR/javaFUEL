package Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add(12);
        a1.add(13);
        a1.add(103);
        a1.add("sam");
        a1.add(null);

        LinkedList l1=new LinkedList();

        l1.add(a1);
        System.out.println(a1);
        System.out.println(l1);
        // add one array to anyother array it is use AddAll method
        System.out.println("_______________");
        System.out.println(a1.size());
        System.out.println(l1.size());

        System.out.println("_______________");
        System.out.println(a1.contains(1));
        a1.remove(2);
        System.out.println(a1.containsAll(l1));

        System.out.println("_______________");
        System.out.println(a1);
        System.out.println(l1);


    }
}
