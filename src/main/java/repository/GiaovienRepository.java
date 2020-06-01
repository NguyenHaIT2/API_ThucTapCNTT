package repository;

import entity.GiaovienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface GiaovienRepository extends JpaRepository<GiaovienEntity, Long> {
    List<GiaovienEntity> findGiaovienEntitiesByTen(String ten);
}
