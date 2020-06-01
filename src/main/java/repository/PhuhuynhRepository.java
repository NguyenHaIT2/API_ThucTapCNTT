package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface PhuhuynhRepository extends JpaRepository<PhuhuynhEntity, Long> {
    List<PhuhuynhEntity> findPhuhuynhEntityByTen(String ten);
}
