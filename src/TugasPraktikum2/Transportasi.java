package TugasPraktikum2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Transportasi {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Jumlah Penumpang : ");
        int penumpang = Integer.parseInt(br.readLine());


        int bus = penumpang / 50;
        int vbus = penumpang % 50;

        int minibus = vbus / 15;
        int vminibus = vbus % 15;

        int mobil = vminibus / 7;
        int vmobil = vminibus % 7;

        int sisa = vmobil;

        if (sisa != 0){
            mobil = mobil + 1;
        }
        System.out.println("Membutuhkan Bus : " +bus+", Minibus : " +minibus+", Mobil : " +mobil);


    }
}
