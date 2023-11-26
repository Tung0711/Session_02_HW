package Session_02_Hw;

import java.util.Scanner;
public class B2_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            hienThiMenu();
            System.out.println("Nhập vào lựa chọn của bạn (0 để thoát):");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    hienThiHCN();
                    break;
                case 2:
                    hienThiTGT();
                    break;
                case 3:
                    hienThiTGN();
                    break;
                case 4:
                    hienThiTGC();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc. Xin tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp - Vui lòng nhập lại!");
            }
        } while (luaChon != 0);
    }
    public static void hienThiMenu() {
        System.out.println("--------  Menu  --------");
        System.out.println("1. Hiển thị hình chữ nhật");
        System.out.println("2. Hiển thị hình tam giác vuông thuận");
        System.out.println("3. Hiển thị hình tam giác vuông ngược");
        System.out.println("4. Hiển thị hình tam giác cân");
        System.out.println("0. Thoát");
        System.out.println("-------------------------");
    }
    public static void hienThiHCN() {
        int rows = 4;
        int cols = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hienThiTGT() {
        int n = 6;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hienThiTGN() {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hienThiTGC() {
        int n = 5, k = 0;

        for (int i = 1; i <= n; i++, k = 0) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}