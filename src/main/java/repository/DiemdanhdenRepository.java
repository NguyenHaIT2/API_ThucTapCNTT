package repository;

import entity.DiemdanhdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface DiemdanhdenRepository extends JpaRepository<DiemdanhdenEntity, Long> {
}
