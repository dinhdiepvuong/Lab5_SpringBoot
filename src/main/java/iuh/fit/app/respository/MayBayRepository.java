package iuh.fit.app.respository;

import iuh.fit.app.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {

    //    2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
    @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
    public List<MayBay> findMBTamBayHon10000();

    //    7. Có bao nhiêu loại máy báy Boeing.
    @Query(value = "select count(MaMB) from maybay where Loai like '%Boeing%'", nativeQuery = true)
    public int findLoaiMayBayBoeing();
}
