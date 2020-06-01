package repository;

import entity.BinhluanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface BinhluanRepository extends JpaRepository<BinhluanEntity, Long> {
    List<BinhluanEntity> findByMahinhanhAndMaphuhuynh(long mahinhanh, long maphuhuynh);
}
