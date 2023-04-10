import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Segitiga {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            System.out.print("Masukkan Jumlah Baris : ");
            n = Integer.parseInt(reader.readLine());
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
