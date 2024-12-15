package com.app.user.repositories;

import com.app.user.entities.Role;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name); 	
}
