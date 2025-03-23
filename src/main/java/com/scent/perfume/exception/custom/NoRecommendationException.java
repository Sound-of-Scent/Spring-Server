package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.ChatbotErrorCode;

public class NoRecommendationException extends CustomException {
    public NoRecommendationException() {
        super(ChatbotErrorCode.NO_RECOMMENDATION);
    }
}

