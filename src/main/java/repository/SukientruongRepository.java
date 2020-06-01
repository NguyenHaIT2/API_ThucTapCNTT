package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface SukientruongRepository extends JpaRepository<SukientruongEntity, Long> {
}
