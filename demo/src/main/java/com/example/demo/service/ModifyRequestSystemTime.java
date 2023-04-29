package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Request;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifyRequestSystemTime implements ModifyRequestService {
    @Override
    public void modifyRq(Request request){
        request.setSystemTime("Current time: "+System.currentTimeMillis());

        HttpEntity <Request>httpEntity =new HttpEntity<Request>(request);
        new RestTemplate().exchange("http://localhost:8082/nextapp", HttpMethod.POST, 
        httpEntity, new ParameterizedTypeReference<>() {
            
        });
    }
}
