import java.util.Scanner;

/**
 * Created by Faishal on 13/07/2017.
 */
public class Distinct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jum;
        do {
            System.out.println("Masukan jumlah array (Max 10) : ");
            jum = input.nextInt();
            if (jum>10){
                System.out.println("MAX 10!");
            }
        }while (jum>10);
        int[] array = new int[10];
        int[] arrayHasil = new int[10];
        int count = 0;

        for (int i = 0; i < jum; i++) {
            System.out.print("Angka - "+(i+1)+" :");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < jum; i++) {
            if (i==jum-1){
                arrayHasil[count]=array[i];
                System.out.print(arrayHasil[count]);
                count++;
                break;
            }
            for(int j=(i+1); j<jum; j++){
                if (array[i]==array[j] && i!=jum-1){
                    break;
                }else if (j == jum-1){
                    arrayHasil[count] = array[i];
                    System.out.print(arrayHasil[count]);
                    count++;
                }
            }
        }
        System.out.println();
        System.out.print("Hasil Array  = { ");
        for (int i=0; i<count; i++){
            System.out.print(arrayHasil[i]+" , ");
        }
        System.out.println("}");

    }
}
