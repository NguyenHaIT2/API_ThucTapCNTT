package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface HocsinhHinhanhRepository extends JpaRepository<HocsinhHinhanhEntity, HocsinhHinhanhEntityPK> {
    List<HocsinhHinhanhEntity> findByMahinhanh(long mahinhanh);
    List<HocsinhHinhanhEntity> findByMahocsinh(long mahocsinh);
}
