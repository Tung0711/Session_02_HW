package Session_02_Hw;

import java.util.Scanner;

public class B3_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập n:");
        n = scanner.nextInt();
        System.out.printf("Tất cả số nguyên tố nhỏ hơn %d là:\n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (soNT(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean soNT(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
