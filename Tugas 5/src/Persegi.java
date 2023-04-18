import java.util.Scanner;
public class Persegi {
    public static void main(String[] param) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai panjang: ");
        int a= input.nextInt();
        System.out.print("Masukkan nilai lebar: ");
        int b= input.nextInt();
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=b ; j++) {
                if (i==1 || i==a || j==1 || j==b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
