package com.example.service;

import com.example.entity.HocsinhEntity;
import com.example.entity.LopHoatdongEntity;
import com.example.entity.LopNoidunghoctapEntity;
import com.example.entity.NoidunghoctapEntity;
import com.example.repository.LopNoidunghoctapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LopNoidunghoctapService{
    @Autowired
    LopNoidunghoctapRepository repository;
    public List<LopNoidunghoctapEntity> getAllLopNoidunghoctap() {
        List<LopNoidunghoctapEntity> list = new ArrayList<LopNoidunghoctapEntity>();
        repository.findAll(Sort.by("manoidunghoctap").descending()).forEach(list::add);

        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<LopNoidunghoctapEntity>();
        }
    }
    public List<LopNoidunghoctapEntity> getLopNoidunghoctapByMalop(long malop ) throws Exception{
        List<LopNoidunghoctapEntity> list = new ArrayList<LopNoidunghoctapEntity>();
        repository.findByMalop(malop).forEach(list::add);
        if (list.size() > 0) {
            return list;
        } else {
            return new ArrayList<LopNoidunghoctapEntity>();
        }
    }
}
