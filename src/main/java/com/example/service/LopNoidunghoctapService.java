package com.example.service;

import com.example.entity.HocsinhEntity;
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

}
