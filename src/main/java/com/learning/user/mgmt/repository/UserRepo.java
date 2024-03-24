package com.learning.user.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.user.mgmt.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
