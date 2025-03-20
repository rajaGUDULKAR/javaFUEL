package Arraylist;

import javax.naming.Name;

public class Student {
    int age ;
    String Name ;
    Student(int age, String Name) {
        this.age = age;
        this.Name = Name;
    }
    public String toString(){
        return "age" +age+ "Name" +Name;
    }
}
