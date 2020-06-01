package service;

import repository.GroupRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupRoleService{
    @Autowired
    GroupRoleRepository repository;
}
