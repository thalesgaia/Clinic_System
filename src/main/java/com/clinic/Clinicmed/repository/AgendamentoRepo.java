package com.clinic.Clinicmed.repository;

import com.clinic.Clinicmed.model.Agendamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepo extends JpaRepository<Agendamento, Long> {
    
}
