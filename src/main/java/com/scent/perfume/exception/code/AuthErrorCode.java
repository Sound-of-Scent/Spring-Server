package com.scent.perfume.exception.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AuthErrorCode implements ErrorCode {
    INVALID_PASSWORD(400, "A-001", "비밀번호를 다시 확인해주세요"),
    UNAUTHORIZED_ACCESS(401, "A-002", "접근 권한이 없습니다.");

    private final int status;
    private final String code;
    private final String message;
}
