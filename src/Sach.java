/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducho
 */
public class Sach extends TaiLieu implements TinhGia{
    private String tenSach;
    private String tenTacGia;
    private int soLuongTrang;

    public Sach(String tenSach, String tenTacGia, int soLuongTrang) {
        super(tenSach, tenTacGia, soLuongTrang);
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.soLuongTrang = soLuongTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoLuongTrang() {
        return soLuongTrang;
    }

    public void setSoLuongTrang(int soLuongTrang) {
        this.soLuongTrang = soLuongTrang;
    }

    @Override
    public double getGia() {
        double gia = this.soLuongTrang * 2000;
        if (super.getSoPH() < 300) {
            gia -= gia * 20 / 100;
        }
        return gia;
    }
    
    
}
