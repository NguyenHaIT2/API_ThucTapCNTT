package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface GroupRoleRepository extends JpaRepository<GroupRoleEntity, GroupRoleEntityPK> {
}
