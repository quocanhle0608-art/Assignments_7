
package assignments_7;
import java.util.*;
public class bai2_DemSoTuTrongChuoi {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Nhap chuoi :");
        String DemSoTu =sc.nextLine();
        String[] number = DemSoTu.trim().split(" ");
        int SoTu = number.length;
        System.out.println("So tu trong chuoi la :" + SoTu);
    }
    
}
