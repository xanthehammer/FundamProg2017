package Practice3;

import practice2.TextIO;

public class CumLaude {

    public static void main(String[] args){

        System.out.println("Enter the average grade for the thesis: ");
        float grade = TextIO.getFloat();

        String cumLaude = (grade > 4.5) ? "Cum Laude" : "not Cum Laude";

        System.out.println("The grade of " + grade + " is " + cumLaude + ".");

    }

}
