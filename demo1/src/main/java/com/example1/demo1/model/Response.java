package com.example1.demo1.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response {
    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;
}
