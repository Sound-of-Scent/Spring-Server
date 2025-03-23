package com.scent.perfume.exception.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ChatbotErrorCode implements ErrorCode {
    EMPTY_MESSAGE(400, "B-001", "메시지를 입력해주세요"),
    MESSAGE_PROCESSING_ERROR(500, "B-002", "메시지 처리 중 오류가 발생했습니다."),
    CHAT_LIMIT_EXCEEDED(400, "B-003", "대화 제한 횟수를 초과했습니다."),
    NO_RECOMMENDATION(404, "C-001", "적합한 향수를 찾지 못했어요");

    private final int status;
    private final String code;
    private final String message;
}
