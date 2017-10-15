package practice2;

public class LetterReplacement {

    public static void main(){

        ASCIIArtGenerator artgen = new ASCIIArtGenerator();
        artgen.main("Text Replacer");

        System.out.println("Enter a word or phrase: ");
        String phrase = TextIO.getlnString();

        System.out.println("Which letter(s) do you want to replace? ");
        String textToReplace = TextIO.getlnString();

        System.out.println("What do you want to replace" + textToReplace + " with?");
        String replacementText = TextIO.getlnString();

        System.out.println(phrase.replace(textToReplace, replacementText));

    }

}
