package Session_02_TH;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        char checkMath;
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu 1:");
        number1 = sc.nextInt();
        System.out.println("Nhap vao so nguyen thu 2:");
        number2 = sc.nextInt();
        System.out.println("Nhap phep toan ( +, -, *, /):");
        checkMath = sc.next().charAt(0);

        switch (checkMath) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("So bi chia phai khac khong");
                } else {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}
