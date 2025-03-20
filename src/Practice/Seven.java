package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Seven {
    public static void main(String[] args) {
        ArrayList A1 =new ArrayList();
        A1.add("One");
        A1.add("Two");
        A1.add("Three");

        Collections.reverse(A1);
        System.out.println("Reversed ArrayList: " + A1);
    }
}
