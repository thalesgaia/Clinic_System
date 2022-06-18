package com.clinic.Clinicmed.repository;

import com.clinic.Clinicmed.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usuario, Long> {
}