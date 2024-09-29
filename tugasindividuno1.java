import java.util.Scanner;  

public class tugasindividuno1 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String warnaLampu;  

        System.out.print("Masukkan warna lampu lalu lintas: ");  
        warnaLampu = sc.nextLine();  

        switch (warnaLampu) {  
            case "hijau":  
                System.out.println("----------------");
                System.out.println("Jalan trus");  
                System.out.println("----------------");
                break;  
            case "kuning":  
                System.out.println("----------------");
                System.out.println("Jalan");  
                System.out.println("Kurangi kecepatan");  
                System.out.println("----------------");
                break;  
            case "merah":  
                System.out.println("----------------");
                System.out.println("Jalan");  
                System.out.println("Berhenti");  
                System.out.println("----------------");

                break;  
            default:  
                System.out.println("Warna lampu tidak valid");  
                break;  
        }  

        System.out.println("Selesai");  
        System.out.println("----------------");
        sc.close();  
    }  
}  