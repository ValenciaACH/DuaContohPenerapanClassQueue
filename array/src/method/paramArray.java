package method;
import java.io.*;
public class paramArray {
    //parameter: variable tampung sementara di sebuah fungsi/prosedur
    //fungsi berparameter array untuk menghitung rata-rata nilai(angka)

    public static int AvgArray(int[] data) {
        //ddeklarasi variabel tampung lain untuk memproses suatu perhitungan
        int jml=0, rata=0;
        //rata-rata (jumlah nilai/jumlah data)
        for (int i = 0; i < data.length; i++) {
            //penjumlahan nilai (1+1=2 +3=5 +1=6 +7=13 ..dst)
            jml += data[i];

        }
        rata = jml/ data.length;

        return rata;
        //rata karea tujuannya adalah rata
    }
    public static void terserah() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1[] = new int[3];
        for (int i = 0; i < d1.length; i++) {
            System.out.print("Isi Angka : ");
            d1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(AvgArray(d1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d[] = {1, 2, 4}; //data statis

        //data dinamis: bisa dari inputan user (isi angka dari user)

        //cara panggil prosedurnya
        //sout : method untuk cetal layar/console
        //*:tipe void tidak bisa dicetak dengan sout
        terserah();
    }


}
