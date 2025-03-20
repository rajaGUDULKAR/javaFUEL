package Arraylist;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList l2 =new ArrayList();
        l2.add(12);
        l2.add(192);
        l2.add(162);
        l2.add(172);
        System.out.println(l2);
        System.out.println("____________________");

        l2.add(1,15);
        System.out.println(l2);
        l2.add(3,45);
        System.out.println(l2);
        // TO add():-  a  add object or element using index number based on the
        System.out.println("______________________");
        l2.set(1,35);
        System.out.println(l2);
        // Set ():- add an obj based on the index position and already to exist
        // to change the value of element using index number

    }
}
