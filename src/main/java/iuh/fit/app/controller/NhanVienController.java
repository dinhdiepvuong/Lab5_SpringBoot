package iuh.fit.app.controller;

import iuh.fit.app.model.NhanVien;
import iuh.fit.app.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/cau3")
    public List<NhanVien> getNhanVienLuongNhoHon10000(){
        return nhanVienService.findNVLuongNhoHon10000();
    }

//    1. Read NhanVien: All , findNhanVienByID
    @GetMapping("/nhanviens/{id}")
    public NhanVien getNhanVienByMaNV(@PathVariable("id") String nhanVienID){
        return nhanVienService.findNhanVienByMaNV(nhanVienID);
    }
    @GetMapping("/nhanviens")
    public List<NhanVien> getAllNhanVien(){
        return nhanVienService.findAllNhanVien();
    }

//    2. Create NhanVien:
    @PostMapping("/nhanviens")
     public NhanVien addNhanVien(@RequestBody NhanVien theNhanVien){
        return nhanVienService.saveNhanVien(theNhanVien);
     }

//     3. Update NhanVien biet Id
    @PutMapping("/nhanviens")
    public NhanVien updateLuongNhanVienById(@RequestBody NhanVien nhanvien){
        return nhanVienService.saveNhanVien(nhanvien);
    }

//    4. Delete NhanVien biet Id
    @DeleteMapping("/nhanviens/{id}")
    public String deleteNhanVienById(@PathVariable("id") String nhanVienId){

        nhanVienService.deleteNhanVienById(nhanVienId);
        return "Successfully!";
    }
}
