package Arraylist.Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo7 {
    public static void main(String[] args) {

        //ArrayList A1 = new ArrayList();//10
      /*  ArrayList A2= new ArrayList(30);
        ArrayList A3= new ArrayList();
        ArrayList A4= new ArrayList();

        LinkedList L1 =new LinkedList(); //0
        LinkedList L2 =new LinkedList();

        Vector V1 =new Vector(); //10
        Vector V2 =new Vector(100);
        Vector V3 =new Vector(50,10);
        Vector V4 =new Vector(A1);
        System.out.println(V2);
    }*/

// collection of copy data between the two array's
        ArrayList A1 =new ArrayList(); //10
        A1.add(10);

        LinkedList L1 =new LinkedList(A1);
        L1.add(20);

        Vector V1 =new Vector(L1);//2
    }
}


//Array List is not thread same.                                  Vector is thread same.
//Array list three constructors.                                  Vector have 4 constructor
//Incremental Capacity of Array List is
//``Incremental Capacity = { (Current Capacity / 2) * 3 } + 1``   Incremental Capacity of vector is ``CurrentCapacity * 2``.
//It is introduced from `jdk 1.2`                               It is introduced from `jdk 1.0`