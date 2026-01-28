
package assignments_7;
import java.util.Scanner;
public class bai5_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("Nhap ky tu can dem: ");
        char ch = sc.next().charAt(0);

        int dem = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                dem++;
            }
        }

        System.out.println("So la xuat hien cua '" + ch + "' la: " + dem);
    }
}

    
