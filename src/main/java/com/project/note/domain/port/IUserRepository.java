package com.project.note.domain.port;

import com.project.note.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);

}
