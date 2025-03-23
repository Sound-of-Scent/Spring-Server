package com.scent.perfume.domain.chat.dto;

public record ChatRequest(
        String model,
        String message
) {
}
