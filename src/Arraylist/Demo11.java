package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo11 {
    public static void main(String[] args) {
        ArrayList<Integer> A1= new ArrayList<>();
        A1.add(20);
        A1.add(30);
        A1.add(23);
        A1.add(23);
        HashSet H1 = new HashSet(A1);
        A1.clear();
        A1.addAll(H1);
        System.out.println(H1);
        System.out.println(A1);
    }
}
