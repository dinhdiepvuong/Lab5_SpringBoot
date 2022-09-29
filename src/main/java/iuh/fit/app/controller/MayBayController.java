package iuh.fit.app.controller;

import iuh.fit.app.model.MayBay;
import iuh.fit.app.service.ChuyenBayService;
import iuh.fit.app.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class MayBayController {

    @Autowired
    private MayBayService mayBayService;

    @GetMapping("/cau2")
    public List<MayBay> getMayBayHon10000(){
        return mayBayService.findMBTamBayHon10000();
    }
}
