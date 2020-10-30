
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducho
 */
public class Main {
    public static void main(String[] args) {
        
        QLTV qltv = new QLTV();
        
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap bao");
            System.out.println("3. vietsdtailieu");
            System.out.println("4. sap xep");
            System.out.println("5. tim kiem");
            System.out.println("6. tong so dau sach");
            System.out.println("Bam phim khac de thoat!");
            
            Scanner select = new Scanner(System.in);
            
            int selectMenu = select.nextInt();
            
            switch (selectMenu) {
                case 1:
                    qltv.nhapSach();
                    break;
                    case 2:
                    qltv.nhapBao();
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                    case 5:
                    
                    break;
                    case 6:
                    
                    break;
                    default:
                        System.exit(0);
                        break;
            }
        }
    }
}
