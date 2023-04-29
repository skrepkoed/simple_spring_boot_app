package com.example1.demo1.service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example1.demo1.model.Response;
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