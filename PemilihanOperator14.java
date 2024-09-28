import java.util.Scanner;
public class PemilihanOperator14  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();

        int hasil = 0;

        if (operator == '+') {
            hasil = a + b;
        } else if (operator == '-') {
            hasil = a - b;
        } else if (operator == '*') {
            hasil = a * b;
        } else if (operator == '/') {
            hasil = a / b;
        } else {
            System.out.println("Operator yang dipilih tidak sesuai. Silakan memilih operator yang valid (+, -, *, /).");
        }

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
            sc.close();
        }
    }
}
