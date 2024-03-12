import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia pembaca: ");
        int usia = scanner.nextInt();

        if (usia <= 12) {
            System.out.println("Kategori: Anak-anak");
            System.out.println("Rekomendasi buku: Buku Cerita");
        } else if (usia >= 13 && usia <= 17) {
            System.out.println("Kategori: Remaja");
            System.out.println("Rekomendasi buku: Buku Petualangan");
        } else if (usia >= 18) {
            System.out.println("Kategori: Dewasa");
            System.out.println("Rekomendasi buku: Buku Non-Fiksi");
        }

        scanner.close();
    }
}
