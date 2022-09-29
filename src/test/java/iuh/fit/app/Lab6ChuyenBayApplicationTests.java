package iuh.fit.app;

import iuh.fit.app.model.NhanVien;
import iuh.fit.app.service.ChuyenBayService;
import iuh.fit.app.service.MayBayService;
import iuh.fit.app.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab6ChuyenBayApplicationTests {

    @Autowired
    private ChuyenBayService chuyenBayService;
    @Autowired
    private MayBayService mayBayService;
    @Autowired
    private NhanVienService nhanVienService;

    @Test
    void chuyenBayTuDAD1() {
        chuyenBayService.findCBGaDiDAD().forEach(System.out::println);
    }

    @Test
    void mayBayTamBayHon10000(){
        mayBayService.findMBTamBayHon10000().forEach(System.out::println);
    }

    @Test
    void nhanVienLuongNhoHon10000(){
        nhanVienService.findNVLuongNhoHon10000().forEach(System.out::println);
    }

    @Test
    void getNhanVienById(){
        NhanVien nv = nhanVienService.findNhanVienByMaNV("011564812");
        System.out.println(nv);
    }

    @Test
    void updateNhanVienById(){
        nhanVienService.updateLuongNv("011564812", 153974);
    }
}
