public class note {
    //Array List is not thread same.                                  Vector is thread same.
    //Array list three constructors.                                  Vector have 4 constructor
    //Incremental Capacity of Array List is
    //``Incremental Capacity = { (Current Capacity / 2) * 3 } + 1``   Incremental Capacity of vector is ``CurrentCapacity * 2``.
    //It is introduced from `jdk 1.2`                               It is introduced from `jdk 1.0`
    //stored into ``java.util`` package.
    //3. It is introduced from ``jdk 1.2``.
    //
    //### **Specification of Array List**
    //1. The initial capacity of array list is 10.
    //2. Incremental Capacity of Array List is
    //   `Incremental Capacity = { (Current Capacity / 2) * 3 } + 1`
    //3. Array List is `re-sizable array` or `growable array`.
    //
    //Example
    //Java
    //
    //
    //package ArrayList;
    //
    //import java.util.ArrayList;
    //
    //public class Demo {
    //    public static void main(String[] args) {
    //        ArrayList al = new ArrayList();
    //        al.add(10);
    //        al.add(20);
    //        al.add("SAM");
    //        al.add(20.5);
    //        al.add(null);
    //        al.add(20);
    //        System.out.println("Array List : " + al);
    //    }
    //}
    //
    //
    //Date:18/03/2025
    //### 1.2 Linked List
    //1. Linked List is a predefined class.
    //2. It is stored into `java.util` package.
    //3. It is introduced from `JDK 1.2`.
    //
    //!LinkedList.png
    //
    //### Specification of Linked List
    //1. The initial capacity of Linked List is zero or null.
    //2. The Incremental capacity of Linked List is 1 or depends upon object.
    //
    //Linked List Example
    //
    //1. Add() is used to Appending elements randomly inside array list using index value and element value by changing position of other elements.
    //2. set() is used to add an object based on the index position and already existing object get override.
    //
    //Java
    //
    //
    //public class Demo1 {
    //    public static void main(String[] args) {
    //        ArrayList al = new ArrayList();
    //        al.add(10);
    //        al.add(20);
    //        al.add(30);
    //        al.add(40);
    //
    //        System.out.println(al);
    //
    //        al.add(1,70);
    //        System.out.println(al);
    //
    //        al.set(1, 50);
    //        System.out.println(al);
    //    }
    //}
    //
    //### For Each Loop
    //Example:
    //Java
    //
    //
    //        for (int i : Arr){
    //            if (i%2==0){
    //                System.out.println(in);
    //            }
    //
    //## Vector
    //1. It is a pre-defined class which is stored into `java.util` package.
    //2. It is introduced from
    //copy
    //
    //
    //jdk 1.2
    //.
    //3. Initial Capacity of vector is `10`.
    //4. Incremental Capacity of vector is `CurrentCapacity * 2`.
    //5. It is also called as a `Thread-Safe` (synchronized).
    //
    //
    //Array List is not thread same.                                  Vector is thread same.
    //Array list three constructors.                                  Vector have 4 constructor
    //Incremental Capacity of Array List is
    //`Incremental Capacity = { (Current Capacity / 2) * 3 } + 1`   Incremental Capacity of vector is `CurrentCapacity * 2`.
    //It is introduced from `jdk 1.2`                               It is introduced from `jdk 1.0`
    //
    //## Set
    //Set is a pre-defined interface which is stored into `java.util` package.
    //It is introduced from `jdk 1.2`
    //
    //Diff betn set and List
    //1. Insertion order in set is not followed.          1. Insertion order in list is followed.
    //   2. In set duplicates are not allowed.                2. Duplicates in set are allowed.
    //      3. Set is not an index based.                    List is index based
    //         4. Null value is allowed in set only one time.  in list null value is allowed multiple times.
    //
    //### HashSet;
    //1. It is pre-defined class which is stored in `java.util` package.
    //2. It is also underlined DSA of collection.
    //3. Initial capacity of HashSet is `16`.
    //4. incremental capacity 75% of  initial capacity
    //copy
    //
    //
    //Incremental Capacity is 75 % of Initial capacity.
}
// ##LINKHASHSET:-
// link-hashSet:- is a predefine class which is store in java.util.package
// it is introduce from jdk version 1.4
// link hashset can't allow duplicate value
//link-hashSet follow intersection order

//TREE-SET:-
//is a pre-Define class tree-set in java.util.package
//it introduce from jdk1.2
// Tree hashset it contains compareTo() method

//1. Finding a lower value in the stock into the market system. (Create a satta-matta app)
//2. Finding available meeting room slot(Time management system) e.g 9 O clock, 10:30 , 1pm and 3 pm.
//3. Custom sorting in TreeSet of Employee class which is store the data of age and name and sort the data with the help of TreeSet.
//4. Sorting and retriving exam score with a range.
        //University needs to store student score and retrive only those of specific range.
//5. Handling realtime leaderboard in a game system.
        // a gaming platform track top score and must display in sorted order.