package iuh.fit.app.service;

import iuh.fit.app.model.MayBay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MayBayService {

    public List<MayBay> findMBTamBayHon10000();
}
