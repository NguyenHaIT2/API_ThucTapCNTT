package service;

import repository.ThucdonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThucdonService{
    @Autowired
    ThucdonRepository repository;
}
