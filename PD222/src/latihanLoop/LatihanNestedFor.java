//package latihanLoop;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class LatihanNestedFor {
//    public static void main(String[] s) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //variabel
//        int minggu, hari;
//
//        //input
//        System.out.println("Jumlah Minggu : ");
//        minggu = Integer.parseInt(br.readLine());
//        System.out.println("Jumlah Hari :");
//        hari = Integer.parseInt(br.readLine());
//
//        //perulangan + output
//        //outer loop : baris
//        for (int i = 1; i <= minggu ; i++) {
//            System.out.println("Minggu ke - " + i);
//
//            //inner loop : kolom
//            for (int j = 1; j <= hari ; j++) {
//                //jika tidak ada hari yang ditampilkan pada minggu ke-4
//                if (i==4){
//                    break;
//                }
//                System.out.println("Hari : " +j);
//            }
//            int rows = 4;
//            int cols = 4;
//
//            for (int k = 1; k <= rows; k++) {
//                for (int l = 1; l <= cols; l++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            //pattern segitiga
//            //tanpa inputan
//            //outer loop: baris
//            for (int m = 0; m < 5 ; m++) {
//
//                //inner loop: kolom'
//                for (int n = 0; n < m ; n++) {
//                    System.out.print("*");
//
//                }
//                System.out.println();
//
//                int n = 0;
//                System.out.print("Jumlah baris : ");
//                o = Integer.parseInt(br.readLine());
//                for (int m = 0; m <= o ; m++) {
//                    for (int n = 0; n < n; n++) {
//                        System.out.println("*");
//
//                    }
//                    System.out.println();
//                }
//            }
//
//
//
////        tanpa inputan
////        baris 4
////        for (int i = 0; i < 4; i++) {
////
////            //kolom 4
////            for (int j = 0; j < 4; j++) {
////                System.out.println("*");
////            }
////            System.out.println();
//
//            //Inputan tapi belum selesai
////            int input;
////            System.out.println("Jumlah: ");
////            input = Integer.parseInt(br.readLine());
////            for (int j = 0; j < input; j++) {
////                for (int k = 0; k < ; k++) {
//
//                }
//
//            }
//        }
//
//
