package Arraylist;

public class ForeachLoop {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
        System.out.println("_______________");
        for (int i : arr){
            if (i%2==1) {
                // odd and even printing
                    System.out.println(i);
                    System.out.println("______________");
                    // we can't write in revers order


                    // for each loop:-

            }
        }

        //string array
        String[] Str={"sam", "jon","tom"};
        for (String i: Str){
            System.out.println(i);
        }
    }
}