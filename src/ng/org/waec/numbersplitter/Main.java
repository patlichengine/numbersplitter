package ng.org.waec.numbersplitter;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a set of numbers: ");
        String myInput = reader.next();

        splitNumbers(myInput);*/

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a set of numbers: ");
        long myInput = 0;
        try {
            myInput = reader.nextLong();

            if(Long.toString(myInput).length() > 2 && Long.toString(myInput).length() <= 20 ) {
                sortNumbers(Long.toString(myInput));
            } else {
                System.out.println("Enter a set of numbers not greater than 19 digits");
            }
        } catch (Exception e) {
            System.out.println("Enter only numbers within the Integer range");
        }




        reader.close();

    }

    private static void splitNumbers(String collection) {
        String numberResult = "";
        int i;
        for(i = 0; i < collection.length(); i++){
            char c = collection.charAt(i);
            if( '0' <= c && c <= '9' ) {
                numberResult+= c + " ";
            }
        }

        System.out.println(numberResult);


    }

    private static void sortNumbers(String collection) {
        String numberResult = "";
        int tempNum;
        int[] myarray = new int[collection.length()];

        for(int i = 0; i < collection.length(); i++){
            int c =Integer.parseInt(""+collection.charAt(i));
            myarray[i] = c;
        }

        for (int x = 0; x < ( myarray.length - 1 ); x++) {
            for (int y = 0; y < myarray.length - x - 1; y++) {
                if (myarray[y] < myarray[y+1])
                {
                    tempNum = myarray[y];
                    myarray[y] = myarray[y+1];
                    myarray[y+1] = tempNum;
                    continue;
                }
            }
        }

        numberResult = "";
        for(int i = 0; i < myarray.length; i++){
            numberResult+= myarray[i] + "";
        }

        System.out.println(numberResult);
    }
}
