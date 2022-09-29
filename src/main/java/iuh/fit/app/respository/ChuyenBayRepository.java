package iuh.fit.app.respository;

import iuh.fit.app.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    //    1. Cho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select *  from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
    public List<ChuyenBay> findCBGaDiDAD();

    //    4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
    @Query(value = "select * from chuyenbay where DoDai > 8000 and DoDai < 10000", nativeQuery = true)
    public List<ChuyenBay> findCBDoDai8to10();
}
