package Session_02_TH;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        System.out.println("Nhap vao ngay:");
        day = sc.nextInt();
        System.out.println("Nhap vao thang:");
        month = sc.nextInt();
        System.out.println("Nhap vao nam:");
        year = sc.nextInt();
        //kiem tra ngay thang nam vua nhap co hop le khong
        if (year > 0 && month > 0 && month <= 12) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (day > 0 && day <= 31) {
                        System.out.println("Ngay thang nam hop le");
                    } else {
                        System.out.println("Ngay thang nam khong hop le");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (day > 0 && day <= 30) {
                        System.out.println("Ngay thang nam hop le");
                    } else {
                        System.out.println("Ngay thang nam khong hop le");
                    }
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if(day > 0 && day <= 29 ){
                            System.out.println("Ngay thang nam hop le");
                        }else{
                            System.out.println("Ngay thang nam hop le");
                        }
                    }else if(day > 0 && day <= 28){
                        System.out.println("Ngay thang nam hop le");
                    }else{
                        System.out.println("Ngay thang nam khong hop le");
                    }
        }
        } else {
            System.out.println("Ngay thang nam khong hop le");
        }
    }
}
