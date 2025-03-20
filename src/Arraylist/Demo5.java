package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10); //0
        a1.add(20);//1
        a1.add(50);//2
        a1.add(40);//3
        a1.add(60);//4
        a1.add(30);//5
        System.out.println(a1);
        for ( int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));

        }
        Collections.sort(a1);
        System.out.println("____________________");

        for (int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));
        }
    }
}
