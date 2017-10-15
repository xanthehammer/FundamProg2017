package practice2;

public class Product {

    public static void main() {

        ASCIIArtGenerator artgen = new ASCIIArtGenerator();
        artgen.main("Product Calculator");

        System.out.println("Enter the first number: ");
        double firstNum = TextIO.getlnDouble();

        System.out.println("Enter the second number: ");
        double secondNum = TextIO.getlnDouble();

        double product = firstNum * secondNum;

        System.out.println("The product of " + firstNum + " and " + secondNum + " is " + product);

    }

}
