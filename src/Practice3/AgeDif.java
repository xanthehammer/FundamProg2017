package Practice3;

import java.util.Arrays;
import practice2.TextIO;

public class AgeDif {

    public static void main(String args[]){

        System.out.print("Enter the first age: ");
        int firstAge = TextIO.getlnInt();

        System.out.println("Enter the second age: ");
        int secondAge = TextIO.getlnInt();

        int diff = Math.abs(firstAge - secondAge);

        if (diff < 5){
            System.out.println("very nice");
        }
        else if (diff > 5 || diff < 10){
            System.out.println("quite okay");
        }
        else if (diff > 10 || diff < 15){
            System.out.println("not that okay");
        }
        else if (diff > 15){
            System.out.println("not okay");
        }
        else {
            System.out.println("not sure");
        }


    }

}
