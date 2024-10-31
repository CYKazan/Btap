package btap2;
import java.util.Scanner;
public class Btap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String chuoiNhap = scanner.nextLine(); 

        if (scanner.hasNext()) {
            System.out.println("da nhap vao mot chuoi.");
        } else {
            System.out.println("khÃ´ng phai la mot chuoi.");
        }

        scanner.close();
    }
    
}
