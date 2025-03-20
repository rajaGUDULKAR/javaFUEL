package Arraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(22,"me");
        Student s2 = new Student(22,"sus");
        Student s3 = new Student(22,"rushi");
        Student s4 = new Student(50,"manteshbhai");
        Student s5 = new Student(22,"p.p.khade");

        ArrayList <Student> A1 =new ArrayList();

        A1.add(s1);
        A1.add(s2);
        A1.add(s3);
        A1.add(s4);
        A1.add(s5);



        for(Student i:A1) {

            System.out.println(A1);
        }

       /* Vector
        It is a pre-defined class which is stored into java.util package.
        It is introduced from jdk 1.2.
                Initial Capacity of vector is 10.
        Incremental Capacity of vector is CurrentCapacity * 2.
        It is also called as a Thread-Safe (synchronized).
*/

    }
}
