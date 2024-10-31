package Btap1;

import java.util.Scanner;

public class Btap1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ten");
            String name = scanner.nextLine();

            System.out.print("Nhap tuoi");
            String age = scanner.nextLine();

            System.out.print("Nhap gioi tinh");
            String gender = scanner.nextLine();

            System.out.print("Nhap GPA");
            String gpa = scanner.nextLine();

            System.out.print("Nhap chuyen nganh");
            var major = scanner.nextLine();

            System.out.print(" Nhap que quan");
            String hometown = scanner.nextLine();

            System.out.println("\n Thong tin sinh vien:");
            System.out.println("Nhap ten: Chau Y Kazan" + name);
            System.out.println("Nhap tuoi: 19" + age);
            System.out.println("Nhap gioi tinh: Male" + gender);
            System.out.println("Nhap GPA: 5.0" + gpa);
            System.out.println("Nhap chuyen nganh: CNTT" + major);
            System.out.println("Nhap que quan: Binh Dinh" + hometown);

        }
    }
}
