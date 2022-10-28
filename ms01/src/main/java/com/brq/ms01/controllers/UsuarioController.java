package com.brq.ms01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// comentário

/*
 * comentário
 * */

@RestController
public class UsuarioController {

    /*
     * o @GetMapping permite associar o verbo GET com a rota /usuarios
     */

    @GetMapping("usuarios")
    public String getAllUsuarios(){
        return "Get Usuários";
    }
}
