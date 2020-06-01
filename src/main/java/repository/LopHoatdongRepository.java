package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface LopHoatdongRepository extends JpaRepository<LopHoatdongEntity, LopHoatdongEntityPK> {
    List<LopHoatdongEntity> findByMalop(long malop);
}
