package Session_02_TH;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;
        System.out.println("Nhap vao nam:");
        year = sc.nextInt();
        System.out.println("Nhap vao thang:");
        month = sc.nextInt();
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang "+month+" năm "+year+" co 31 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("thang "+month+" năm "+year+" co 30 ngay");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0)
                        || (year % 400 == 0)) {
                    System.out.println("Năm nhuan thang 2 co 29 ngay");
                } else {
                    System.out.println("thang "+month+" năm "+year+" co 28 ngay");
                }
                break;
            default:
                System.out.println("Thang nhap vao khong hop le");
        }
    }
}
