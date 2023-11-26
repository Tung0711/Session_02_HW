package Session_02_Hw;

import java.util.Scanner;

public class B6_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            hienThiMenu();
            System.out.println("Nhập vào lựa chọn của bạn (0 để thoát):");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    kiemTraChanLe();
                    break;
                case 2:
                    kiemTraSoNT();
                    break;
                case 3:
                    kiemTraChiaHet3();
                    break;
                case 0:
                    System.out.println("Chương trình đã kết thúc. Xin tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không chính xác. Vui lòng nhập lại!");
            }
        } while (luaChon != 0);
    }

    public static void hienThiMenu() {
        System.out.println("-----------------  Menu  -----------------");
        System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
        System.out.println("0. Thoát");
        System.out.println("------------------------------------------");
    }

    public static void kiemTraChanLe() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n:");
        number = scanner.nextInt();

        //kiểm tra số nhập vào là số chẵn hay số lẻ
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn \n", number);
        } else {
            System.out.printf("%d là số lẻ \n", number);
        }
    }

    public static void kiemTraSoNT() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số nguyên n:");
        n = scanner.nextInt();

        //kiểm tra n có p số nt ko
        if (soNT(n)) {
            System.out.println(n + " là số nguyên tố! \n");
        } else {
            System.out.println(n + " không phải là số nguyên tố! \n");
        }
    }

    public static void kiemTraChiaHet3() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n:");
        number = scanner.nextInt();

        // kiểm tra số nhập vào có chia hết cho 3 ko
        if (number % 3 == 0) {
            System.out.printf("%d là số chia hết cho 3 \n", number);
        } else {
            System.out.printf("%d là số không chia hết cho 3 \n", number);
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
