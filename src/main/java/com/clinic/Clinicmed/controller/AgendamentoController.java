package com.clinic.Clinicmed.controller;

import java.util.List;

import com.clinic.Clinicmed.model.Agendamento;
import com.clinic.Clinicmed.repository.AgendamentoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/agendamentos")
public class AgendamentoController {
    
    @Autowired
    private AgendamentoRepo AgendamentoRepo;

    @GetMapping
    public List<Agendamento> findAll(){
            return AgendamentoRepo.findAll();
    }

    @PostMapping
    public Agendamento save(@RequestBody Agendamento novoAgendamento){
        return AgendamentoRepo.save(novoAgendamento);
    }

    @PutMapping 
    public Agendamento update(@RequestBody Agendamento agendamentoAtualizar){
        return AgendamentoRepo.save(agendamentoAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Agendamento agendamentoDeletar){
        AgendamentoRepo.delete(agendamentoDeletar);
        return "Agendamento Deletado com sucesso";
    }







}