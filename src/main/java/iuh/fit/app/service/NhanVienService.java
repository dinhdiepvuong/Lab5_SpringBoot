package iuh.fit.app.service;

import iuh.fit.app.model.NhanVien;
import iuh.fit.app.respository.NhanVienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanVienService {
    public List<NhanVien> findNVLuongNhoHon10000();
    public NhanVien findNhanVienByMaNV(String maNV);
    public List<NhanVien> findAllNhanVien();
    public NhanVien saveNhanVien(NhanVien nhanvien);
    public void updateLuongNv(String maNV, Integer luong);
    public void deleteNhanVienById(String maNV);
}
