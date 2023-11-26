package Session_02_Hw;

import java.util.Scanner;

public class B3_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100;
        System.out.println("Tất cả số nguyên tố nhỏ hơn 100 là:" + n);

        for (int i = 2; i < n; i++) {
            if (soNT(i)) {
                System.out.print(i + " ");
            }
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
