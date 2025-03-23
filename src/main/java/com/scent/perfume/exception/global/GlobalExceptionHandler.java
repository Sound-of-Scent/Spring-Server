package com.scent.perfume.exception.global;

import com.scent.perfume.common.dto.ApiResponse;
import com.scent.perfume.exception.code.ErrorCode;
import com.scent.perfume.exception.code.SystemErrorCode;
import com.scent.perfume.exception.custom.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponse<?>> handleCustomException(ErrorCode errorCode) {
        return buildErrorResponse(errorCode);
    }

    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            MissingServletRequestParameterException.class,
            HttpMessageNotReadableException.class
    })
    public ResponseEntity<ApiResponse<?>> handleBadRequest(Exception e) {
        return buildErrorResponse(SystemErrorCode.BAD_REQUEST);
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public ResponseEntity<ApiResponse<?>> handleMethodNotAllowed(Exception e) {
        return buildErrorResponse(SystemErrorCode.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public ResponseEntity<ApiResponse<?>> handleUnsupportedMediaType(Exception e) {
        return buildErrorResponse(SystemErrorCode.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleDefaultException(Exception e) {
        return buildErrorResponse(SystemErrorCode.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ApiResponse<?>> buildErrorResponse(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.status())
                .body(ApiResponse.error(errorCode.code(), errorCode.message()));
    }
}
