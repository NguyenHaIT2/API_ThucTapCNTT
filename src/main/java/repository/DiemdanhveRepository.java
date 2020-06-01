package repository;

import entity.DiemdanhveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface DiemdanhveRepository extends JpaRepository<DiemdanhveEntity, Long> {
}
