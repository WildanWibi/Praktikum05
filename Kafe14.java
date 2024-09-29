import java.util.Scanner;
public class Kafe14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, diskon = 0.1, nominalBayar, totalHarga;

        System.out.print("Apakah anda member: ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

         totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga;
        }  
        System.out.println("----------------------------------------");
        System.out.println(jmlKopi + " Kopi: " + (jmlKopi * hargaKopi));
        System.out.println(jmlTeh + " Teh: " + (jmlTeh * hargaTeh));
        System.out.println(jmlRoti + " Roti: " + (jmlRoti * hargaRoti));
        System.out.println("----------------------------------------");
        System.out.println("Total Harga: " + totalHarga);
        
        if (keanggotaan) {
            System.out.println("Diskon: " + (diskon * totalHarga));
            System.out.println("----------------------------------------");
            System.out.println("Nominal yang Harus Dibayar: " + nominalBayar);
            System.out.println("----------------------------------------");
        }
        
        input.close();
        
    }
}
