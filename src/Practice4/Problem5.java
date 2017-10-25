package Practice4;

public class Problem5 {

    public static void main(String[] args){

        System.out.println("-----------------");

        for (int i = 0; i < 7; i++){

            System.out.print("| ");
            for (int x = 0; x < 7; x++) {

                if ((i == x) || (6 - x == i)) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println("|");

        }
        System.out.println("-----------------");

    }

}
