package com.elitederma.backend.model;

public record MessageRequestDTO(
        String clientName,
        String clientEmail,
        String subject,
        String content) {
}
