import java.util.Scanner;

/**
 * Kelas VolumeBalok menghitung volume sebuah balok berdasarkan panjang, lebar, dan tinggi yang dimasukkan oleh pengguna.
 * <p>
 * Pengguna diminta untuk memasukkan panjang, lebar, dan tinggi balok, dan kemudian program akan menghitung volume balok
 * berdasarkan input tersebut. Hasil volume kemudian ditampilkan kepada pengguna.
 * </p>
 *
 * @author [Your Name]
 * @version 1.0
 */
public class VolumeBalok {
    /**
     * ini program menghitung volume balok
     * @param args ini dibuat argumen baris perintah, parameter ataupun method bisa masuk sini
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil
        System.out.println("Volume balok adalah: " + volume);

        // Menutup scanner
        input.close();
    }
}
