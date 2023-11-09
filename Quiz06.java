import java.util.Scanner;
import java.util.Random;
public class Quiz06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();

        char menu='y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer < number){
                    System.out.println ("Tebakan Angka Anda Terlalu Kecil");
                } else if ( answer > number){
                    System.out.println ("Tebakan Angka Anda Terlalu Besar");
                } else {
                    System.out.println ("Tebakan Anda benar");
                    success = true;
            }
            }while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/n)?");
            menu = sc.nextLine().charAt(0);
        } while (menu=='y'|| menu == 'Y');
    }
}
