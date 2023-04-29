package com.example1.demo1.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Request {
    @NotBlank
    @Size(max=32)
    private String uid;
    private String systemname;
    private String operationUid;

    @NotBlank
    private String systemTime;
    private String source;
    private Integer communicationId;
    private Integer templateId;
    @Max(7)
    private Integer productCode;
    @Max(5)
    private Integer smsCode;
}
