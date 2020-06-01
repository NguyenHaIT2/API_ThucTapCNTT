package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ThetranghangthangRepository extends JpaRepository<ThetranghangthangEntity, Long> {
}
