package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Response;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    public Response modify(Response response){
        response.setErrorMessage("Something wrong");
        return response;
    }
}
