package DSA;

import java.util.HashSet;

public class PlagiarCheker {
    public static void main(String[] args) {
        String Doc ="java is popular programing Language"+
                "It is Widely used in enterprises application";

        String Doc2 ="Python is also object orinted programing language which most popular programing  Language  "+
                "It is Widely used in organisions application ";
        HashSet s1 = new HashSet();
        for (String i: Doc.split("\\.")){
            s1.add(i);

        }
        for (String j:Doc2.split("\\.")){
            if (s1.contains(j)){
                System.out.println("plagiarismChecker "+ j);
            }
            s1.add(j);
        }
        System.out.println(s1);
    }
}
