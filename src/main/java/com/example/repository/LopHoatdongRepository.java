package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface LopHoatdongRepository extends JpaRepository<LopHoatdongEntity, LopHoatdongEntityPK> {
    List<LopHoatdongEntity> findByMalop(long malop);
}
