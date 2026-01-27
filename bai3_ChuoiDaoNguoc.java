
package assignments_7;
import java.util.*;
public class bai3_ChuoiDaoNguoc {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String chuoi = sc.nextLine();
        String daonguoc  = "";
        for(int i = chuoi.length() - 1 ; i >= 0 ; i --){
            daonguoc += chuoi.charAt(i);
        }
        System.out.println("Chuoi dao nguoc la :" + daonguoc);
    }
}
