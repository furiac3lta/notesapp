package com.project.note.infrastructure.rest;

import com.project.note.application.UserService;
import com.project.note.domain.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8084/
@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }
}
