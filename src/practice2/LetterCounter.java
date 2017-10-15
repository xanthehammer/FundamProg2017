package practice2;

public class LetterCounter {

    public static void main(){

        ASCIIArtGenerator artgen = new ASCIIArtGenerator();
        artgen.main("Letter Counter");

        System.out.println("Enter your name: ");
        String name = TextIO.getlnString();

        System.out.println("There are " + name.length() + " letters in your name.");


    }

}
