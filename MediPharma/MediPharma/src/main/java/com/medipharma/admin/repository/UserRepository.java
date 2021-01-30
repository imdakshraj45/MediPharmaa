package com.medipharma.admin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medipharma.admin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUserName(String uname);
}
