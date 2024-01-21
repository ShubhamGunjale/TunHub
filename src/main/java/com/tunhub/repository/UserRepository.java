package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.Entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {
	public Users findByEmail(String email);

}
