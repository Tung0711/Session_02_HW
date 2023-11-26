package Session_02_Hw;

import java.util.Scanner;
public class B1_Hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, last;
        int total = 0;
        System.out.println("Nhap vao gia tri dau tien:");
        first = sc.nextInt();
        System.out.println("Nhap vao gia tri cuoi cung:");
        last = sc.nextInt();

        //tinh tong cac so chan vua nhap
        for (int i = first; i <= last; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tong cua cac so chan tu "+first+
                " den "+last+" la "+total);
    }
}
