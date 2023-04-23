package com.example.Departmentemp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Departmentemp.Entity.Registration;

public interface RegistrationDao extends JpaRepository<Registration, Long> {
	
	public List<Registration> findByEmail(String email);

}
