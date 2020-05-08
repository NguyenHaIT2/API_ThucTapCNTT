package com.example.service;

import com.example.entity.HinhanhEntity;
import com.example.entity.HocsinhEntity;
import com.example.repository.HinhanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HinhanhService{
    @Autowired
    HinhanhRepository repository;
    public HinhanhEntity getHinhanhById(Long id) throws Exception {
        Optional<HinhanhEntity> hinhanh  = repository.findById(id);

        if (hinhanh.isPresent()) {
            return hinhanh.get();
        } else {
            throw new Exception("No hinh anh record exist for given id");
        }
    }
    public List<HinhanhEntity> getHinhanhByThoigianLike(Date date) {
        List<HinhanhEntity> hinhanhlist = new ArrayList<HinhanhEntity>();
        repository.findHinhanhByThoigianLike(date).forEach(hinhanhlist::add);
        if (hinhanhlist.size() > 0) {
            return hinhanhlist;
        } else {
            return new ArrayList<HinhanhEntity>();
        }
    }
}
