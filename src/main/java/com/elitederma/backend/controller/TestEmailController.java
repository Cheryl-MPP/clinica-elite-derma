package com.elitederma.backend.controller;

import com.elitederma.backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/test-email")
    public String testEmail() {
        emailService.sendTestEmail();
        return "Correo de prueba enviado (verifica tu bandeja de entrada).";
    }
}
