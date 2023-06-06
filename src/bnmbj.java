import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class bnmbj {
    public static void main(String[] args) throws IOException {
            String[] nama = new String[]{"Inodudu", "Coco", "Moci", "Kiki", "Mimi", "Selo", "Miko"};
            System.out.println("Pemenang Undian adalah = ");
            int SET_SIZE_REQUIRED = 3;
            int NUMBER_RANGE = 7;
            Random random = new Random();
            Set set = new HashSet(SET_SIZE_REQUIRED);

            while (set.size() < SET_SIZE_REQUIRED) {
                while (true) {
                    if (!set.add(random.nextInt(NUMBER_RANGE))) {
                        continue;
                    }
                    break;
                }
            }

            assert set.size() == SET_SIZE_REQUIRED;

            String coba = String.valueOf(set);
            String potong = coba.substring(1, coba.length() - 1);
            String[] angka = potong.split(",");

            for (int i = 0; i < angka.length; ++i) {
                int index = Integer.parseInt(angka[i].trim());
                System.out.println(nama[index]);
            }
        }

    }

