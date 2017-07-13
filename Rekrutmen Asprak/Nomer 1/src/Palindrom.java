import java.util.Scanner;

/**
 * Created by Faishal on 13/07/2017.
 */
public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Pengecekan Kata Sifat Palindrom ");
        boolean trigger = false;
        do {
            System.out.print("Masukan Kata - - - (Lower Case/Upper Case Semua) : ");
            String kata = input.next();
            int panjang = kata.length();
            int pivot = 0;
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == kata.charAt(panjang - 1)) {
                    panjang -= 1;
                    pivot += 1;
                } else {
                    break;
                }
            }
            if (pivot == kata.length()) {
                System.out.println("True");
            } else
                System.out.println("False");
            boolean trigger2 = false;
            while (trigger2==false) {
                System.out.println("Lagi ? (y/n) : ");
                String jwb = input.next();
                if (jwb.equalsIgnoreCase("y")) {
                    trigger = false;
                    trigger2 = true;
                } else if (jwb.equalsIgnoreCase("n")) {
                    trigger = true;
                    trigger2 = true;
                } else
                    System.out.println("Salah Memasukan Huruf !");
            }
        }while (trigger==false);
    }
}
