package Session_02_TH;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int max, mid, min;
        System.out.println("Nhap vao so thu nhat:");
        a = sc.nextInt();
        System.out.println("Nhap vao so thu hai:");
        b = sc.nextInt();
        System.out.println("Nhap vao so thu ba:");
        c = sc.nextInt();
        //tim max
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        //tim min
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        //tim mid
        if (a != max && a != min) {
            mid = a;
        } else if (b != max && b != min) {
            mid = b;
        } else {
            mid = c;
        }
        //in ra man hinh
        System.out.println("Cac so duoc sap xep theo thu tu giam dan la:" + max + " " + mid + " " + min);
    }
}