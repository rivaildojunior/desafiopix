package com.example.pix.controller;


import com.example.pix.model.Transacao;
import com.example.pix.service.PixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/")
public class PixController {

    private PixService service;

    public PixController(PixService service) {
        this.service = service;
    }

    @GetMapping("/{email}")
    public void reenviarPix(@PathVariable String email) {
        service.reenviarPix(email);
    }
}
