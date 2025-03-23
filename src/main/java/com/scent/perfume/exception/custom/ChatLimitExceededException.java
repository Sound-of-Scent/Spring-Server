package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.ChatbotErrorCode;

public class ChatLimitExceededException extends CustomException {
    public ChatLimitExceededException() {
        super(ChatbotErrorCode.CHAT_LIMIT_EXCEEDED);
    }
}

