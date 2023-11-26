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

    }

    public static void kiemTraSoNT() {

    }

    public static void kiemTraChiaHet3() {

    }
}
