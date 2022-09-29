package iuh.fit.app.service.serviceImpl;

import iuh.fit.app.model.NhanVien;
import iuh.fit.app.respository.NhanVienRepository;
import iuh.fit.app.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;


    public List<NhanVien> findNVLuongNhoHon10000(){
        return nhanVienRepository.findNVLuongNho10000();
    }

    public NhanVien findNhanVienByMaNV(String maNV){
        return nhanVienRepository.findNhanVienByMaNV(maNV);
    }

    public List<NhanVien> findAllNhanVien(){
        return nhanVienRepository.findAllNhanVien();
    }

    @Override
    public NhanVien saveNhanVien(NhanVien nhanvien) {
        return nhanVienRepository.save(nhanvien);
    }

    public void updateLuongNv(String maNV, Integer luong){
        nhanVienRepository.updateNhanVienById(maNV, luong);
    }

    public void deleteNhanVienById(String maNV){
        nhanVienRepository.deleteNhanVienById(maNV);
    }


}
