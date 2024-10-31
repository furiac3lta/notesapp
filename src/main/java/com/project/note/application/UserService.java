package com.project.note.application;

import com.project.note.domain.model.User;
import com.project.note.domain.port.IUserRepository;

import java.util.List;

public class UserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }
    public User save(User user) {
        return iUserRepository.save(user);
    }
    public User findById(Integer id) {
        return iUserRepository.findById(id);
    }

}
