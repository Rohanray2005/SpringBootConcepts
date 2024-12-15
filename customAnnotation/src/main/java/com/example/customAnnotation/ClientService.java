package com.example.customAnnotation;

import com.example.customAnnotation.annotations.ClientAspect;
import com.example.customAnnotation.annotations.ClientTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public String provideService(){
        ClientTypeEnum clientTypeEnum = ClientAspect.getCurrentClientType();
        return "Client Type Recieved : " + clientTypeEnum.name();
    }
}
