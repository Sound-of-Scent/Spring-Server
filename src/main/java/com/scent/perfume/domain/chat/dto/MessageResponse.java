package com.scent.perfume.domain.chat.dto;

public record MessageResponse(
        String message,
        Long conversationId,
        Integer conversationCount,
        Boolean isComplete,
        String perfumeRecommendation
) {
}
