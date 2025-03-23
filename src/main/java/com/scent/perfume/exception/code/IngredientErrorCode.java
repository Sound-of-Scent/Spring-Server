package com.scent.perfume.exception.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum IngredientErrorCode implements ErrorCode {
    INSUFFICIENT_INGREDIENT(400, "I-001", "향료 잔량이 부족합니다.");

    private final int status;
    private final String code;
    private final String message;
}
