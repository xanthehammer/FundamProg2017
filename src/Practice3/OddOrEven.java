package Practice3;

import practice2.TextIO;

public class OddOrEven {

    public static void main(String[] args){

        System.out.println("Enter a number: ");
        int num = TextIO.getlnInt();

        String evenOrOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOrOdd);


    }

}
