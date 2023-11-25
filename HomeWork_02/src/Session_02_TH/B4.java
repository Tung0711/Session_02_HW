package Session_02_TH;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap vao mot so nguyen:");
        number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("%d chia het cho ca 3 va 5", number);
        /*} else if (number % 3 == 0 && number % 5 != 0) {
            System.out.printf("%d chi chia het cho 3", number);
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.printf("%d chi chia het cho 5", number);*/
        } else {
            System.out.printf("%d khong chia het cho ca 3 va 5", number);
        }
    }
}