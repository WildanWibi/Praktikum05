import java.util.Scanner;

public class ModifikasiBilangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();
        
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka + " " + hasil);
        sc.close();
    }
}