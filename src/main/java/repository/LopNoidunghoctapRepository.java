package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface LopNoidunghoctapRepository extends JpaRepository<LopNoidunghoctapEntity, LopNoidunghoctapEntityPK> {
    List<LopNoidunghoctapEntity> findByMalop(long malop);
}
