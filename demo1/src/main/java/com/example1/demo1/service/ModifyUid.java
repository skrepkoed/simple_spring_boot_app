package com.example1.demo1.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example1.demo1.model.Response;
@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setUid("NewUidInNewApp");
        return response;
    }
}
