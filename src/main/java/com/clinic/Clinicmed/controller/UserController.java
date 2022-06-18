package com.clinic.Clinicmed.controller;

import java.util.List;

import com.clinic.Clinicmed.model.Usuario;
import com.clinic.Clinicmed.repository.UserRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public List<Usuario> findAll(){
            return userRepo.findAll();
    }
    
    @PostMapping
    public Usuario save(@RequestBody Usuario novoUsuario){
        return userRepo.save(novoUsuario);
    }
    
    @PutMapping
    public Usuario update(@RequestBody Usuario usuarioAtualizar){
        return userRepo.save(usuarioAtualizar);
    }

    @DeleteMapping 
    public String delete(@RequestBody Usuario usuarioDeletar){
        userRepo.delete(usuarioDeletar);
        return "usuario deletado com sucesso";
    }
    

}
