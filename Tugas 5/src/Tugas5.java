import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] param) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan bilangan 3-15: ");
        int a= input.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
