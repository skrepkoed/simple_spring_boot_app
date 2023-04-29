package com.example1.demo1.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo1.model.Request;
import com.example1.demo1.model.Response;
import com.example1.demo1.service.MyModifyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MyController {
    private final MyModifyService myModifyService;
    public MyController(@Qualifier("ModifyUid") MyModifyService modifyService){
        this.myModifyService=modifyService;
    }
    @PostMapping(value="/nextapp",consumes = {"application/json"})
    public ResponseEntity<Response> feedback(@RequestBody Request request){
        log.info("Incoming request:"+String.valueOf(request));
        Response response =Response.builder()
        .uid(request.getUid())
        .operationUid(request.getOperationUid())
        .systemTime(request.getSystemTime())
        .code("success")
        .errorCode("")
        .errorMessage("")
        .build();
        Response responseAfterModify=myModifyService.modify(response);
        log.info("Outcoming response:"+String.valueOf(responseAfterModify));
        return  new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
