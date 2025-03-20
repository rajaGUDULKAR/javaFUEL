package Arraylist;
import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
        ArrayList A1 = new ArrayList();
        A1.add(10);
        A1.add(20);
        A1.add("sam");
        A1.add(null);
        A1.add(10.5);
        A1.add(20);
        System.out.println(A1);
        System.out.println("_______________");
        // size of array list
        System.out.println(A1.size());
        System.out.println("_______________");
        System.out.println(A1.get(2));
        System.out.println("_______________");
        System.out.println(A1.get(2));
        System.out.println("_______________");
        System.out.println(A1.get(2));
//contains or find data from data
        System.out.println("_______________");
        System.out.println(A1.contains(null));// if data are present in thne it well show true
        System.out.println("_______________");
        System.out.println(A1.contains("raj"));// if data are not present in thne it well show flase

        // for remove or delet the data it will use remove
        System.out.println(A1);
        A1.remove(3);



       A1.isEmpty();
        System.out.println(A1);
// indexOf  to finde index num

        System.out.println(A1.indexOf("sam"));


    }
}
// Array :-
//ADD():- is use to add an object into the collection

// size():- is to return the length of coll
// get():-  is use to return an object beased on the index position
// the contains():-
//is use to check if the object is present in the coll or not
// remove():-
// is use to remove an object base on the index position
//is empty():-
//is to check if the coll is empty or not
//clear():-
//will remove all the object frome colle
// index ():-
//is used to find the                        an object and occarence in the case of duplication