package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Five {
    public static void main(String[] args) {
        ArrayList A1= new ArrayList();
        A1.add(190);
        A1.add(90);
        A1.add(80);
        A1.add(60);
        A1.add(70);
        A1.add(10);
        A1.add(100);
        System.out.println(A1);
        ArrayList B2 = new ArrayList();
        B2.add(190);
        B2.add(90);
        B2.add(80);
        B2.add(60);
        B2.add(70);
        B2.add(78);
        B2.add(98);
        System.out.println(B2);
        System.out.println("Shuffle ARRAY");
        Collections.shuffle(A1);
        System.out.println(A1);
        System.out.println("shuffle ARRAY");
        Collections.shuffle(B2);
        System.out.println(B2);
    }
}
