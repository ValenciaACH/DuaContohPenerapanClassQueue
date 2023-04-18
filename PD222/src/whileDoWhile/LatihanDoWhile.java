package whileDoWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LatihanDoWhile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //letakkan variabel sebelum blok try agar terbaca di dalam block try catch
        int nim, i=0;
        String nama;
        try{ //try catch utuk error handling
            do {
                System.out.print("Entri nim : ");
                nim = Integer.parseInt(br.readLine());
                System.out.print("Entri nama : ");
                nama = br.readLine();
                i++;
            }while (i < 5);
        }catch(Exception e) {

        }
        //deklarasikan variabel
        String nimMhs = null, namaMhs = "", prodi ="", mk ="", cari="";
        int uts, uas, tugas, menu, nilaiAkhir = 0;

        try {
            /*membuat program dengan menu
            1. Entri mahasiswa (nim, nama, prodi, mk)
            2. Hitung nilai mahasiswa (uts, uas, tugas)
            3. Lihat rapor mahasiswa
            4. Keluar program
             */
            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("1. Entri Mahasiswa");
                System.out.println("2. Hitung Nilai MK Mahasiswa");
                System.out.println("3. Lihat Rapor Mahasiswa");
                System.out.println("4. Keluar Program");
                menu = Integer.parseInt(br.readLine());
                //mengisi logika setiap menu (percabangan: if, switch-case)
                switch (menu){
                    /*
                    if (menu  == 1){
                    } else if (menu == 2){
                    } else { (else dalam if-else if = default)
                    }
                     */
                    case 1:
                        System.out.println("=== Menu Entri Mahasiswa ===");
                        System.out.print("Entri nim : ");
                        nimMhs = br.readLine();
                        System.out.print("Entri nama : ");
                        namaMhs = br.readLine();
                        System.out.print("Entri program studi : ");
                        prodi = br.readLine();
                        System.out.print("Entri nama mata kuliah : ");
                        mk = br.readLine();
                        System.out.println();
                        break; //artinya berhenti proses case 1 dan mengembalikan ke perulangan awal alias menu awal/utama
                    case 2:
                        System.out.println("=== Menu Hitung Nilai ===");
                        //hitung nilai akhir (30% * uts + 30% * uas + 40% * tugas)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            //jika sesuai, entri nilai. jika tidak, ada pesan "data tidak ditemukan"
                            System.out.print("Entri nilai uts : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Entri nilai uas : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Entri ilai tugas : ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30/100) + (uas * 30/100) + (tugas * 40/100);

                            //cetak nilaiAkhir
                            System.out.println("Nilai akhir : " + nilaiAkhir);
                            System.out.println();

                        } else {
                            System.out.println("Data tidak ditemukan");
                        }

                        break;
                    case 3:
                        System.out.println("=== Menu Lihat Rapor ===");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            System.out.println(nimMhs + " " + namaMhs);
                            System.out.println("Nilai akhir MK " + mk + " : " + nilaiAkhir);
                        /*
                        A = 80 - 100
                        B+ = 75 - 79
                        B = 65 - 74
                        C+ = 60 - 64
                        C = 55 - 59
                        nilai < 55 == D/E* */
                            if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                                System.out.println("Nilai huruf : A");
                            } else if (nilaiAkhir >= 75 && nilaiAkhir <= 79){
                                System.out.println("Nilai huruf : B+");
                            } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
                                System.out.println("Nilai huruf : B");
                            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 64) {
                                System.out.println("Nilai huruf : C+");
                            } else if (nilaiAkhir >= 55 && nilaiAkhir <= 59) {
                                System.out.println("Nilai huruf : C");
                            } else {
                                System.out.println("Nilai akhir D/E");
                        }
                    }else {
                            System.out.println("Data tidak ditemukan");
                        }
                        break;
                    default: //jika yang dipilih di luar menu 1-3, maka menjalankan apa
                        System.out.println("Berhasil Keluar Program");
                        System.exit(0);
                }

            } while (menu < 4); //boleh diisi true
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan!" + e.getMessage());
        }
    }
}
