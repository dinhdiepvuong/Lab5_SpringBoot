package iuh.fit.app.service.serviceImpl;

import iuh.fit.app.model.ChuyenBay;
import iuh.fit.app.model.MayBay;
import iuh.fit.app.respository.ChuyenBayRepository;
import iuh.fit.app.respository.MayBayRepository;
import iuh.fit.app.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayServiceImpl implements MayBayService {

    @Autowired
    private MayBayRepository mayBayRepository;

    public List<MayBay> findMBTamBayHon10000(){
        return mayBayRepository.findMBTamBayHon10000();
    }
}
