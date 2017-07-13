import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Faishal on 13/07/2017.
 */
public class InputData {
    static class Data{
        public Integer nomor;
        public String nama;
        public Integer nilai;
        public Data(Integer nomor, String nama, Integer nilai){
            this.nomor = nomor;
            this.nama = nama;
            this.nilai = nilai;
        }
    }

    public static void cariJuara(List<Data> d){
        int show = 0;
        int lastNilai = 0;
        for(int i=0; i<d.size(); i++){
            if(d.get(i).nilai != lastNilai){
                show++;
                if(show > 3){
                    break;
                }
                System.out.println("-------");
                System.out.println("Juara " + show);
            }
            System.out.print("Nilai : "+d.get(i).nilai);
            System.out.println(" Nama : "+d.get(i).nama);

            lastNilai = d.get(i).nilai;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Data> listData = new ArrayList();
        while(true) {
            System.out.print("Masukan Nomor : ");
            int nomor = input.nextInt();
            if (nomor == 9999){
                break;
            }

            System.out.print("Masukan Nama : ");
            String nama = input.next();
            System.out.print("Masukan Nilai : ");
            int nilai = input.nextInt();
            System.out.println("Data Terinput -- *** ");
            System.out.println("JIKA INGIN KELUAR. MASUKAN 9999 di NOMOR");
            System.out.println();

            //Biar langsung ke sort
            int insertIdx = listData.size();
            for(int i=0; i<listData.size(); i++){
                if(nilai > listData.get(i).nilai){
                    insertIdx = i;
                    break;
                }
            }
            listData.add(insertIdx, new Data(nomor, nama, nilai));
        };
        cariJuara(listData);
    }
}
