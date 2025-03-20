// link list():-
package Arraylist;


import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList <Integer> L1 = new LinkedList(); //generic value for that we can use <Integer> it is generic
        L1.add(10);
        L1.add(19);
        L1.add(30);
        L1.add(45);
        System.out.println(L1);
        System.out.println(L1);
        for ( int i =0; i<L1.size(); i++) {
            if (0 == L1.get(i) % 2) {
                System.out.println(L1.get(i));
                //String =length(); length() :- it is only use in string
            }
        }
    }
}
// link list is pre-define class it store into java.util package
//it is introduced from jdk 1.2
//the initial  value of link list in null and 0
// initial capacity of link list array depend on object