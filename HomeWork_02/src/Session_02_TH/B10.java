package Session_02_TH;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salaryBasic, numberWorkday;
        double salary;
        int actualWorkday = 26;
        System.out.println("Nhap vao luong co ban:");
        salaryBasic = sc.nextInt();
        System.out.println("Nhap vao so ngay cong thuc te:");
        numberWorkday = sc.nextInt();

        // tinh luong
        if (numberWorkday <= actualWorkday) {
            salary = salaryBasic * (numberWorkday / actualWorkday);
        } else {
            int workday = actualWorkday;
            int resitualWorkday = numberWorkday - actualWorkday;
            salary = (salaryBasic * (numberWorkday / actualWorkday))
                    + (1.5 * (salaryBasic * (numberWorkday / actualWorkday)));
        }
        //in ra man hinh:
        System.out.println("Luong cua ban la:" +salary);
    }
}
