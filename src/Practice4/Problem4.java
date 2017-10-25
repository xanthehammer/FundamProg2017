package Practice4;

import practice2.TextIO;

public class Problem4 {

    public static void main(String[] args){

        System.out.println("Enter the height of the square to be created: ");
        int height = TextIO.getlnInt();


        for (int i = 0; i < height; i++){

            for (int x = 0; x < height; x++){

                if (i == x){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }


    }

}
