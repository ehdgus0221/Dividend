package com.example.dividend.exception;

// 에러가 났을 떄, 던져줄 클래스

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private String message;
}
