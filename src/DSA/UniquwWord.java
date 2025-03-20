package DSA;

import java.util.HashSet;

public class UniquwWord {
    public static void main(String[] args) {
        String Sent = " java is unique language java";
        String[] word = Sent.split(" ");
        HashSet h1 = new HashSet();

        for (String i:word){
            h1.add(i);

        }
        System.out.println(h1);
    }
}
//FINDing unique words from sentence