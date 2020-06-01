package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface HocsinhHocphiRepository extends JpaRepository<HocsinhHocphiEntity, Long> {
    List<HocsinhHocphiEntity> findByMahocsinh(long mahocsinh);
    List<HocsinhHocphiEntity> findByTinhtrang(int t);
    List<HocsinhHocphiEntity> findByNamAndThang(int nam, int thang);
}