package com.scyberg.springjparepository.repository;

import com.scyberg.springjparepository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
