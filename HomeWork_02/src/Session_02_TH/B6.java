package Session_02_TH;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newIndex, oldIndex, total;
        System.out.println("Nhap vao so dien dau thang:");
        oldIndex = sc.nextInt();
        System.out.println("Nhap vao so dien cuoi thang:");
        newIndex = sc.nextInt();
        int electricNumber = newIndex - oldIndex;
        if (electricNumber >= 0 && electricNumber < 50) {
            total = electricNumber * 10000;
        } else if (electricNumber >= 50 && electricNumber < 100) {
            total = electricNumber * 15000;
        } else if (electricNumber >= 100 && electricNumber < 150) {
            total = electricNumber * 20000;
        } else if (electricNumber >= 150 && electricNumber < 200) {
            total = electricNumber * 25000;
        } else {
            total = electricNumber * 30000;
        }
        System.out.println("Tien dien tieu thu trong thang la:" +total);
    }
}
