/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ducho
 */
public class QLTV implements ChucNang{
    private List<TaiLieu> dsTaiLieu;

    public QLTV() {
        this.dsTaiLieu = new ArrayList<>();
    }
    
    

    @Override
    public void nhapSach() {
        Scanner scn = new Scanner(System.in);
        
        String tenSach = scn.nextLine();
        String tenTacGia = scn.nextLine();
        int soTrang = scn.nextInt();
        
        TaiLieu sach = new Sach(tenSach, tenTacGia, soTrang);
        
        dsTaiLieu.add(sach);
        
    }

    @Override
    public void nhapBao() {
        Scanner scn = new Scanner(System.in);
        
        String ngayPH = scn.nextLine();
        
        TaiLieu bao = new Bao(ngayPH);
        
        dsTaiLieu.add(bao);
    }

    @Override
    public void vietDanhSachTaiLieu() {
        for (int i = 0; i < dsTaiLieu.size(); i++) {
            System.out.println("\n" + dsTaiLieu.get(i).getMa());
        }
    }

    @Override
    public void sortTaiLieuTheoNXB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TaiLieu findTaiLieu(Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tongDauSachTheoTacGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
