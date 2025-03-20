package DSA;

import java.util.HashSet;

public class Email {
    public static void main(String[] args) {
        String[] Email={"abcd@gmail.com","abcd@gmail.com",
                        "abod@gmail.com","abkd@gmail.com",
                        "agcd@gmail.com","afcd@gmail.com",};

        HashSet <String> S1 =new HashSet<>();
        for (String e: Email){
            S1.add(e);

        }
        System.out.println(S1);

    }
}
