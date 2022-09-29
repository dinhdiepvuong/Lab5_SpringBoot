package iuh.fit.app.service;

import iuh.fit.app.model.ChuyenBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChuyenBayService {

    public List<ChuyenBay> findCBGaDiDAD();
    public List<ChuyenBay> findCBDoDai8to10();
}
