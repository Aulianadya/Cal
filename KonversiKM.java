import java.util.Scanner;
public class KonversiKM {
        /**
         * Method untuk mengkonversi kilometer (KM) menjadi sentimeter (CM).
         *
         * @param km Nilai dalam kilometer (KM) yang akan dikonversi.
         * @return Nilai dalam sentimeter (CM) setelah dikonversi.
         */
        public static double konversiKMtoCM(double km) {
            double cm = km * 100000;
            return cm;
        }

        /**
         * Method utama untuk menjalankan program.
         * @param args Argumen baris perintah.
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan jarak dalam KM :");
            double km = sc.nextDouble();
            double hasilKonversi = konversiKMtoCM(km);
            System.out.println(km + " kilometer = " + hasilKonversi + " sentimeter");
        }
    }


