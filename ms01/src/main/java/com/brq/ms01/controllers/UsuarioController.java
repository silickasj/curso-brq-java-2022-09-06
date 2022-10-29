package com.brq.ms01.controllers;

import com.brq.ms01.models.UsuarioModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// comentário

/*
 * comentário
 * */

@RestController
public class UsuarioController {

    // este arraylist é didático pois está simulando um banco de dados
    private ArrayList<UsuarioModel> usuarios = new ArrayList<>();

    /*
     * o @GetMapping permite associar o verbo GET com a rota /usuarios
     */

    @GetMapping("usuarios")
    public ArrayList<UsuarioModel> getAllUsuarios(){

        UsuarioModel u = new UsuarioModel();
        u.setId(1);
        u.setNome("Manoel");
        u.setEmail("manoel@gmail.com");

        usuarios.add(u);

        return usuarios;
    }

    @PostMapping("usuarios")
    public String create(){
        return "POST Usuários";
    }
}
