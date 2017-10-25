package Practice4;

public class Problem6 {

    public static void main(String[] args){

        for (int i = 0; i < 10; i++){


            for (int x = i; x < (i + 10); x++){

                if (x > 9){
                    System.out.print((x - 10) + " ");
                }
                else{
                    System.out.print(x + " ");
                }

            }
            System.out.println();

        }

    }

}
