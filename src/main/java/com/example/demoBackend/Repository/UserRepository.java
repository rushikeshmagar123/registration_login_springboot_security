package com.example.demoBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoBackend.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	
    // Add custom query methods if needed
}
