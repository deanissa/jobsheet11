
import java.util.Scanner;
public class individu2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Statement input nilai N
        System.out.println ("Masukkan Nilai N :");
        int N = sc.nextInt();

        //Perulangan Bintang Segitiga Terbalik (for-loop)
        //Outer Loop
        for (int i = 0; i <= N; i++) {
            //Inner Loop
            for (int j = i; j < N; j++) {
                //Statemen A
                System.out.print("*");
            }
            //Statement B
            System.out.println();
        }
    }
}
