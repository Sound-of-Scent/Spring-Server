package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.ChatbotErrorCode;

public class EmptyMessageException extends CustomException {
    public EmptyMessageException() {
        super(ChatbotErrorCode.EMPTY_MESSAGE);
    }
}

