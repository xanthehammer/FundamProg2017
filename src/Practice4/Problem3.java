package Practice4;

public class Problem3 {

    public static void main(String[] args){

        for(int i = 30; i >= 0; i--) {

            if (i % 3 == 0){

                System.out.print(i);

                if (i != 0 ) System.out.print(",");

            }
        }

    }

}
