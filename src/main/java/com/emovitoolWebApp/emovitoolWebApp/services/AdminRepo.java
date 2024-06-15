package com.emovitoolWebApp.emovitoolWebApp.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.emovitoolWebApp.emovitoolWebApp.models.User;

public interface AdminRepo extends CrudRepository<User, Integer> {
	@Query(value = "select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from administradores where id = :id", nativeQuery = true)
	public boolean exist(int id);

	@Query(value = "select * from administradores where email = :email and senha = :senha", nativeQuery = true)
	public User Login(String email, String senha);
}
