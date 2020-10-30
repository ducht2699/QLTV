/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducho
 */
public class TaiLieu {
    private String ma;
    private String tacGia;
    private int soPH;

    public TaiLieu(String ma, String tacGia, int soPH) {
        this.ma = ma;
        this.tacGia = tacGia;
        this.soPH = soPH;
    }
    
    public TaiLieu () {
        
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    
    
    
}
