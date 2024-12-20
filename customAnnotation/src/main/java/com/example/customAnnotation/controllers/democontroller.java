package com.example.customAnnotation.controllers;

import com.example.customAnnotation.ClientService;
import com.example.customAnnotation.annotations.ClientType;
import com.example.customAnnotation.annotations.ClientTypeEnum;
import com.example.customAnnotation.annotations.ClientValidate;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
    private final ClientService clientService;

    public democontroller(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getexcellent")
    @ClientType(ClientTypeEnum.EXCELLENT)
    public String getTypeExcellent(){
        return clientService.provideService();
    }

    @GetMapping("/getgood")
    @ClientType(ClientTypeEnum.GOOD)
    public String getTypeGood(){
        return clientService.provideService();
    }

    @GetMapping("/getaverage")
    @ClientType(ClientTypeEnum.AVERAGE)
    public String getTypeAverage(){
        return clientService.provideService();
    }

    @GetMapping("/checkclienttype/{clientType}")
    public String checkClientType(@PathVariable @ClientValidate String clientType) {
        return "Correct !";
    }
}
