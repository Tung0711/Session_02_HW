package Session_02_TH;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap vao mot so nguyen:");
        number = sc.nextInt();
        //kiem tra chan le
        if (number % 2 == 0) {
            System.out.printf("%d la so chan", number);
        } else {
            System.out.printf("%d la so le", number);
        }
    }
}
