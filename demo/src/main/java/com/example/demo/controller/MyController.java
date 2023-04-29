package com.example.demo.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Request;
import com.example.demo.model.Response;
@RestController
public class MyController {
    @PostMapping(value="/feedback",consumes = {"application/json"})
    public ResponseEntity<Response> feedback(@RequestBody Request request){
        Response response =Response.builder()
        .uid(request.getUid())
        .operationUid(request.getOperationUid())
        .systemTime(request.getSystemTime())
        .code("success")
        .errorCode("")
        .errorMessage("")
        .build();
        return  new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
