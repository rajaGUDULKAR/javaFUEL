package DSA;

import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> stu = new HashSet<>();
        stu.add(1);
        stu.add(2);
        stu.add(3);
        stu.add(4);
        stu.add(5);
        //System.out.println(stu);

        for (int i : stu){
            System.out.println(i);
        }
    }
}
