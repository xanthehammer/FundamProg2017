package practice2;

public class Main {

    public static void main(String[] args){

        PrintNameShoeSize printName = new PrintNameShoeSize();
        printName.main();

        Product productCalc = new Product();
        productCalc.main();

        GroupMaker grouper = new GroupMaker();
        grouper.main();

        LetterCounter counter = new LetterCounter();
        counter.main();

        LetterReplacement replacer = new LetterReplacement();
        replacer.main();

    }

}
