package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.AuthErrorCode;

public class UnauthorizedAccessException extends CustomException {
    public UnauthorizedAccessException() { super(AuthErrorCode.UNAUTHORIZED_ACCESS); }
}

