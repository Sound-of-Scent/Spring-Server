package com.scent.perfume.domain.chat.dto;

public record ChatResponse(
        String message
) {
    public record recommendation(Long perfumeId) {

    }
}
