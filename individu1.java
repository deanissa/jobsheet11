
import java.util.Scanner;
public class individu1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        //Statement menginput nilai N
        System.out.print ("Masukkan nilai N : ");
        int N = sc.nextInt();   

        //Perulangan untuk Segitiga (for-loop)
        //Outer Loop
        for (int i = 0; i <= N; i++) {
            //Inner Loop
            for (int j = 0; j < i; j++) {
                //Statement A
                System.out.print(j+1);
            }
            //Statement B
            System.out.println();
        }
    }
}
