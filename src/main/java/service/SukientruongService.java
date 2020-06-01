package service;

import repository.SukientruongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SukientruongService{
    @Autowired
    SukientruongRepository repository;
}
