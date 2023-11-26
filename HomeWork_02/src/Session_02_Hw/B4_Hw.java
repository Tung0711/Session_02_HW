package Session_02_Hw;

import java.util.Scanner;
public class B4_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i = 2;
        int count = 0;
        System.out.println("Nhập n:");
        n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        while (count < 20) {
            if (soNT(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean soNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
