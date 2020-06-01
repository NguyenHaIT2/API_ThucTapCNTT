package service;

import repository.MonanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonanService{
    @Autowired
    MonanRepository repository;
}
