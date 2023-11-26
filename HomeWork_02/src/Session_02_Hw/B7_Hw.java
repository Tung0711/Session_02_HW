package Session_02_Hw;

import java.util.Scanner;

public class B7_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            hienThiMenu();
            System.out.println("Mời nhập lựa chọn của bạn (0 để thoát):");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    tinhCVandDTHCN();
                    break;
                case 2:
                    tinhCVandDTHTG();
                    break;
                case 3:
                    tinhCVandDTHT();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc. Xin tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }
        } while (luaChon != 0);
    }

    public static void hienThiMenu() {
        System.out.println("-----------------  Menu  ----------------");
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2. Tính chu vi và diện tích hình tam giác");
        System.out.println("3. Tính chu vi và diện tích hình tròn");
        System.out.println("0. Thoát");
        System.out.println("-----------------------------------------");
    }

    public static void tinhCVandDTHCN() {
        Scanner scanner = new Scanner(System.in);
        int length, width;
        int circuit, area;
        System.out.println("Nhập vào chiều dài:");
        length = scanner.nextInt();
        System.out.println("Nhập vào chiều rộng:");
        width = scanner.nextInt();

        //tính chu vi và diện tích HCN
        circuit = (length + width) * 2;
        area = length * width;

        //In ra màn hình
        System.out.println("Chu vi của hình chữ nhật là: " + circuit);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }

    public static void tinhCVandDTHTG() {
        int a, b, c, circuit;
        float p;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b:");
        b = scanner.nextInt();
        System.out.println("Nhập vào cạnh c:");
        c = scanner.nextInt();

        //Tính chu vi hình tam giác
        circuit = a + b + c;

        //Tính diện tích hình tam giác
        //1. Tính nửa chu vi của hình tam giác
        p = (a + b + c) / 2;
        //2. Tính diện tích của tam giác
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        //in ra màn hình
        System.out.println("Chu vi của hình tam giác là: " + circuit);
        System.out.printf("Diện tích của hình tam giác là: %.2f \n", area);
    }

    public static void tinhCVandDTHT() {
        //2*pi*r = cv
        //pi*r*r = dt
        int r;
        double circuit, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn:");
        r = scanner.nextInt();

        //Tính chu vi và diện tích hình tròn có bán kính r
        circuit = 2 * Math.PI * r;
        area = Math.PI * r * r;

        // in ra màn hình
        System.out.printf("Chu vi của hình tròn có bán kính R là: %.2f \n", circuit);
        System.out.printf("Diện tích của hình tròn có bán kính R là: %.2f \n", area);
    }
}
