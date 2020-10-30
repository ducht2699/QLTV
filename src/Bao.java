
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducho
 */
public class Bao extends TaiLieu implements TinhGia{
    private String ngayPH;

    public Bao(String ngayPH) {
        super();
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public double getGia() {
        double gia = 10000;
        if (super.getSoPH() < 300) {
            gia -= gia * 10 / 100;
        }
        return gia;
    }
    
    
}
