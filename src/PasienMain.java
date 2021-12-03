import java.util.Scanner;

public class PasienMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Data Pasien");
        Pasien pasien1 = new Pasien();
        pasien1.setDataPasien();
        pasien1.getDataPasien();
    }
}
