package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.AuthErrorCode;

public class InvalidPasswordException extends CustomException {
    public InvalidPasswordException() { super(AuthErrorCode.INVALID_PASSWORD); }
}

