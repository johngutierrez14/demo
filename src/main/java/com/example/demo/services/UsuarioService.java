package com.example.demo.services;

import java.util.*;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios(){
       return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUsuarios(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}
