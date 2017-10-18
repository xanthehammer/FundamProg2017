package Practice3;

import practice2.TextIO;
public class PasswordChecker {

    public static void main(String[] args){

        System.out.println("Enter a password: ");
        String userPass = TextIO.getlnString();

        String myPass = "password";

        String output = userPass.equals(myPass) ? "Correct password" : "Incorrect password";

        System.out.println(output);
    }

}
