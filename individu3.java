import java.util.Scanner;
public class individu3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Statement input Nilai N 
        System.out.println ("Masukkan Nilai N : ");
        int N = sc.nextInt();

        //Perulangan Persegiz (for-loop)
        //Outer Loop
        for (int i = 1; i <= N; i++) {
            //Inner Loop
            for (int j = 1; j <= N; j++) {
                //Kondisi untuk mencetak persegi sesuai dengan pola
                if (i == 1 || i == N || j == 1 || j == N) {
                //Statement A
                System.out.print (N);
            }else {
                System.out.print(" ");
            }
        }
            //Statement B
            System.out.println();
        }
    }
}
