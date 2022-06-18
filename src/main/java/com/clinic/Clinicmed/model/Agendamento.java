package com.clinic.Clinicmed.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Agendamento {
    private Long id;
    private String nome;
    private Date horario;
    private String responsavel;
    
    public Agendamento(){

    }

    public Agendamento(Long id, String nome, Date horario, String responsavel){
        this.id = id;
        this.nome = nome;
        this.horario = horario;
        this.responsavel = responsavel;
    }

    @Id
    @GeneratedValue
    public Long getId(){
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getHorario(){
        return horario;
    }

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.responsavel = Responsavel;
    }
}