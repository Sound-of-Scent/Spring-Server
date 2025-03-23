package com.scent.perfume.domain.chat.dto;

public record MessageRequest(
        String message,
        Long conversationId
) {
}
