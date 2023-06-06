import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class PenerapanClassQueue2 {
    private static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("=== Menu Kasir ===");
            System.out.println("1. Tambah pelanggan");
            System.out.println("2. Proses pembayaran");
            System.out.println("3. Cek antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan menu: ");

            try {
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Nama pelanggan: ");
                        String customerName = reader.readLine();
                        enqueue(customerName);
                        System.out.println(customerName + " ditambahkan ke antrian.");
                        break;
                    case 2:
                        String nextCustomer = dequeue();
                        if (nextCustomer != null) {
                            System.out.println("Memproses pembayaran untuk " + nextCustomer);
                        } else {
                            System.out.println("Antrian kosong.");
                        }
                        break;
                    case 3:
                        displayQueue();
                        break;
                    case 4:
                        System.out.println("Terima kasih!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

    private static void enqueue(String customerName) {
        queue.add(customerName);
    }

    private static String dequeue() {
        return queue.poll();
    }

    private static void displayQueue() {
        System.out.println("Antrian saat ini:");
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (String customer : queue) {
                System.out.println(customer);
            }
        }
    }
}
