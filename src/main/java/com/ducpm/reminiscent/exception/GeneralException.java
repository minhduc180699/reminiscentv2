package com.ducpm.reminiscent.exception;

import com.ducpm.reminiscent.model.response.DataResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralException {
    private DataResponse fail = new DataResponse(-1);
    @ExceptionHandler(value = Exception.class)
    private ResponseEntity<?> handlerException() {
        return ResponseEntity.ok(fail);
    }
}
