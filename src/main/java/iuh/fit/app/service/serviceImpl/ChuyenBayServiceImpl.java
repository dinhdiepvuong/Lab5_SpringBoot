package iuh.fit.app.service.serviceImpl;

import iuh.fit.app.model.ChuyenBay;
import iuh.fit.app.respository.ChuyenBayRepository;
import iuh.fit.app.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    public List<ChuyenBay> findCBGaDiDAD(){
        return chuyenBayRepository.findCBGaDiDAD();
    }

    @Override
    public List<ChuyenBay> findCBDoDai8to10() {
        return chuyenBayRepository.findCBDoDai8to10();
    }
}
