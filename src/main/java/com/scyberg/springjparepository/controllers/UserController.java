package com.scyberg.springjparepository.controllers;

import com.scyberg.springjparepository.entities.User;
import com.scyberg.springjparepository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<User>> findAll(Pageable pageable) {
        Page<User> result = repository.findAll(pageable);
        return ResponseEntity.ok(result);
    }
}
