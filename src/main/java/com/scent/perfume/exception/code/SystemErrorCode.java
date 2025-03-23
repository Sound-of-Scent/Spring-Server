package com.scent.perfume.exception.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SystemErrorCode implements ErrorCode {
    INTERNAL_SERVER_ERROR(500, "S-001", "서버 내부 오류입니다."),
    BAD_REQUEST(400, "S-002", "잘못된 요청입니다."),
    METHOD_NOT_ALLOWED(405, "S-003", "허용되지 않은 요청 방식입니다."),
    UNSUPPORTED_MEDIA_TYPE(415, "S-004", "지원되지 않는 데이터 형식입니다.");

    private final int status;
    private final String code;
    private final String message;
}
