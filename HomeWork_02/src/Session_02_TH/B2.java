package Session_02_TH;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float html, css, javascript;
        System.out.println("Nhap vao diem HTML:");
        html = sc.nextFloat();
        System.out.println("Nhap vao diem CSS:");
        css = sc.nextFloat();
        System.out.println("Nhap vao diem javascript:");
        javascript = sc.nextFloat();
        //Tinh diem trung binh
        float avgMark = (html + css + javascript) / 3;
        System.out.printf("Diem trung binh: %.2f\n", avgMark);
        if (avgMark >= 0 && avgMark < 5) {
            System.out.println("Xep loai Yeu.");
        } else if (avgMark >= 5 && avgMark < 7) {
            System.out.println("Xep loai Trung Binh");
        } else if (avgMark >= 7 && avgMark < 8) {
            System.out.println("Xep loai kha");
        } else if (avgMark >= 8 && avgMark < 9) {
            System.out.println("Xep loai Gioi");
        } else {
            System.out.println("Xep loai Xuat Sac");
        }
    }
}
