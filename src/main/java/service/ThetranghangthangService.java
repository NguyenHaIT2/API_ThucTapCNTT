package service;

import repository.ThetranghangthangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThetranghangthangService{
    @Autowired
    ThetranghangthangRepository repository;
}
