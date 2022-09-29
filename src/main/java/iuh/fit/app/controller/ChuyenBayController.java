package iuh.fit.app.controller;

import iuh.fit.app.model.ChuyenBay;
import iuh.fit.app.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {

    @Autowired
    private ChuyenBayService chuyenBayService;

    @GetMapping("/cau1")
    public List<ChuyenBay> getChuyenBayTuDAD(){
        return chuyenBayService.findCBGaDiDAD();
    }

    @GetMapping("/cau4")
    public List<ChuyenBay> getChuyenBayDoDaiTu8To10(){
        return chuyenBayService.findCBDoDai8to10();
    }
}
