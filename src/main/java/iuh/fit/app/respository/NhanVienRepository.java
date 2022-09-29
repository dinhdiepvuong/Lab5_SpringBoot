package iuh.fit.app.respository;

import iuh.fit.app.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

    //    3. Tìm các nhân viên có lương nhỏ hơn 10,000
    @Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
    public List<NhanVien> findNVLuongNho10000();

    //    8. Cho biết tổng số lương phải trả cho các nhân viên.
    @Query(value = "select sum(Luong) from nhanvien ", nativeQuery = true)
    public Long tongLuongTraNV();

//    I. Read NhanVien khi biet IdNhanVien
    @Query(value = "select * from nhanvien where MaNV=?1 ", nativeQuery = true)
    public NhanVien findNhanVienByMaNV(String MaNV);

    @Query(value = "select * from nhanvien ", nativeQuery = true)
    public List<NhanVien> findAllNhanVien();

//    II. Update Luong NhanVien khi biet id
    @Transactional
    @Modifying
    @Query(value = "update nhanvien set Luong=?2 where MaNV=?1 ", nativeQuery = true)
    public void updateNhanVienById(String maNV, Integer luong);

    @Transactional
    @Modifying
    @Query(value = "delete from nhanvien where MaNV=?1", nativeQuery = true)
    public void deleteNhanVienById(String maNV);


}
