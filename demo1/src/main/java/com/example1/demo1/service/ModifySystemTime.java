package com.example1.demo1.service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example1.demo1.model.Response;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setSystemTime("");
        return response;
    }
}

