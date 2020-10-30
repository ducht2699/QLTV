
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
public interface ChucNang {
    public void nhapSach();
    public void nhapBao();
    public void vietDanhSachTaiLieu();
    public void sortTaiLieuTheoNXB();
    public TaiLieu findTaiLieu(Date from, Date to);
    public int tongDauSachTheoTacGia();
}
