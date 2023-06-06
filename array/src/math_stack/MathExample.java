package math_stack;

import java.io.*;
import java.util.*;

public class MathExample {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //class math : int, float, double, bukan string
        //sqrt: akar kuadrat
        System.out.println(Math.sqrt(4.4));

        //pow: pangkat
        System.out.println(Math.pow(5.0,3));

        //random
        System.out.println(Math.random());

        /*
        item jurusan:
        1. SI
        2. DKV
        3. Manajemen

        Stack: urutan LIFO (last in first out)
        ketentuan:
        - import java util (ok)
        - deklarasi stack
        - push data (tambah data)
        - pop (ambil data/item)
        -size (lihat jumlah urutan stack)
         */

        Stack<String> stack = new Stack<String>();
        System.out.println("Nama Prodi 1 : " + stack.push("SI"));
        System.out.println("Nama Prodi 2 : " + stack.push("DKV"));
        System.out.println("Nama Prodi 3 : " + stack.push("Manajemen"));

        //lihat isi stack
        //! = noyasi tidak sama dengan
        while (!stack.empty()){
            System.out.println("Cetak urutan : " + stack.pop());
            System.out.println("Jumlah urutan sekarang : " + stack.size());


        }


    }
}