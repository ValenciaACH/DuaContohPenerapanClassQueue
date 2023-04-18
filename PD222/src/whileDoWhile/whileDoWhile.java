package whileDoWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class whileDoWhile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while
//        menjumlahkan setiap angka yang dientrikan
//        kondisi: pengulangan penjumlahan akan dulakukan apabila angka diinputkan >= 0
//        output: angka hasil jumlah
        int number=0, jumlah=0;
        while (number >= 0){
            jumlah += number; //untuk penjumlahan setiap angka yang diinputkan // += adalah jumlah = 0, angka = 0.
                                                                                // jumlah += angka. jumlah = jumlah + angka
            System.out.print("Entri angka : ");
            number = Integer.parseInt(br.readLine());

        }
        System.out.println("Jumlah = " + jumlah);

        //mengentrikan nim dan nama apabila kondisinya true (dua data diisi dengan benar, dimana tipe datanya sesuai)
        boolean b;
        //int i = 0; untuk mengulang sampai 5
        //while (i < 5) untuk mengulang sampai 5
        while (b = true) { //boolean (=) cuma satu kali
            System.out.print("Entri nim : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Entri nama : ");
            String nama = br.readLine();
            //i++; untuk mengulang sampai 5, fungsinya adalah mengulang int i nya mejadi + 1 (i++ = i+1)
        }
    }
}
