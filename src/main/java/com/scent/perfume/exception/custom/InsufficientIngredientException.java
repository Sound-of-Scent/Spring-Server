package com.scent.perfume.exception.custom;

import com.scent.perfume.exception.code.IngredientErrorCode;

public class InsufficientIngredientException extends CustomException {
    public InsufficientIngredientException() {
        super(IngredientErrorCode.INSUFFICIENT_INGREDIENT);
    }

    public InsufficientIngredientException(String perfumeName) {
        super(IngredientErrorCode.INSUFFICIENT_INGREDIENT);
    }

    // TODO : 어떤 재료인지 이름 명시
}

