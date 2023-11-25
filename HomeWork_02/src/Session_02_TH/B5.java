package Session_02_TH;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap vao canh a:");
        a = sc.nextInt();
        System.out.println("Nhap vao canh b:");
        b = sc.nextInt();
        System.out.println("Nhap vao canh c:");
        c = sc.nextInt();
        //kiem tra 3 canh co phai tam giac hay khong
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Ba canh do la tam giac.");
            //Neu la tam giac thi thuoc loai nao?
            if ((a == b) && (a != c) || (a == c) && (a != b)
                    || (b == c) && (b != a)) {
                System.out.println("Day la tam giac can");
            } else if ((a * a) + (b * b) == (c * c) || (a * c) + (c * c) == (b * b)
                    || (b * b) + (c * c) == (a * c)) {
                System.out.println("Day la tam giac vuong");
            } else if ((a * a) + (b * b) == (c * c) && a == b ||
                    (a * a) + (c * c) == (b * b) && a == c ||
                    (b * b) + (c * c) == (a * a) && b == c) {
                System.out.println("Day la tam giac vuong can");
            } else if ((a == b) && (b == c) && (a == c)) {
                System.out.println("Day la tam giac deu");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        } else {
            System.out.println("Ba canh vua nhap khong phai la tam giac");
        }
    }
}

