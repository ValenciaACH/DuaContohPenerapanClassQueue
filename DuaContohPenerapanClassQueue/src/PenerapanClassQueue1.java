import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class PenerapanClassQueue1 {
    public static void main(String[] args) throws IOException {
        Queue<String> customerQueue = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah pelanggan");
            System.out.println("2. Proses pelanggan berikutnya");
            System.out.println("3. Lihat jumlah pelanggan dalam antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int choice = Integer.parseInt(reader.readLine());
        try {
            switch (choice) {
                case 1:
                    System.out.print("Nama pelanggan: ");
                    String customerName = reader.readLine();
                    customerQueue.add(customerName);
                    System.out.println("Pelanggan " + customerName + " ditambahkan ke dalam antrian.");
                    break;
                case 2:
                    if (!customerQueue.isEmpty()) {
                        String nextCustomer = customerQueue.poll();
                        System.out.println("Pelanggan " + nextCustomer + " diproses.");
                    } else {
                        System.out.println("Tidak ada pelanggan dalam antrian.");
                    }
                    break;
                case 3:
                    System.out.println("Jumlah pelanggan dalam antrian: " + customerQueue.size());
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

            System.out.println();
        }
    }
}
