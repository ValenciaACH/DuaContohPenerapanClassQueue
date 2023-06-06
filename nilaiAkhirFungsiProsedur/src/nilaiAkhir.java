import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nilaiAkhir {

    // Fungsi untuk menghitung nilai akhir
    public static double hitungNilaiAkhir(int nilaiT, int nilaiUTS, int nilaiUAS) {
        double nilaiakhir = (nilaiUAS * 30 / 100) + (nilaiUTS * 30 / 100) + (nilaiT * 40 / 100);
        return nilaiakhir;
    }

    // Prosedur untuk mencetak data nilai
    public static void cetakData(String nama, int nilaiT, int nilaiUTS, int nilaiUAS, double nilaiakhir) {
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas : " + nilaiT);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiakhir);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cari = " ", nama = " ";
        int nilaiT = 0, nilaiUTS = 0, nilaiUAS = 0;
        double nilaiakhir;

        try {
            // Mengisi data ke-1
            System.out.println("Data ke 1");
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("Nilai Tugas : ");
            nilaiT = Integer.parseInt(br.readLine());
            System.out.print("Nilai UTS : ");
            nilaiUTS = Integer.parseInt(br.readLine());
            System.out.print("Nilai UAS : ");
            nilaiUAS = Integer.parseInt(br.readLine());
            System.out.println("---------------------------------");

            // Mengisi data ke-2
            System.out.println("Data ke 2");
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("Nilai Tugas : ");
            nilaiT = Integer.parseInt(br.readLine());
            System.out.print("Nilai UTS : ");
            nilaiUTS = Integer.parseInt(br.readLine());
            System.out.print("Nilai UAS : ");
            nilaiUAS = Integer.parseInt(br.readLine());

            System.out.println(" ");
            System.out.println("-----------------------");
            System.out.println(" ");

        } catch (Exception e) {
            System.err.println("Terdapat Kesalahan!");
        }

        System.out.print("Pencarian Berdasarkan Nama : ");
        cari = br.readLine();
        if (cari.equalsIgnoreCase(nama)) {
            nilaiakhir = hitungNilaiAkhir(nilaiT, nilaiUTS, nilaiUAS);
            cetakData(nama, nilaiT, nilaiUTS, nilaiUAS, nilaiakhir);
        }
    }
}
