package com.pannik.tracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pannik.tracker.entities.*;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByRname(ERole rname);
}
