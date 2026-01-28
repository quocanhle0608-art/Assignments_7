
package assignments_7;
 import java.util.Scanner;
public class bai6_ThayTheTuMotChuoi {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("Nhap tu can thay the: ");
        String tuCu = sc.nextLine();

        System.out.print("Nhap tu thay the: ");
        String tuMoi = sc.nextLine();

        String ketQua = str.replace(tuCu, tuMoi);

        System.out.println("Chuoi sau khi thay the: " + ketQua);
    }
}

