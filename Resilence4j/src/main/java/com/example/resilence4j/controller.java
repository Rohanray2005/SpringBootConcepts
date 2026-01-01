package com.example.resilence4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class controller {

    @Autowired
    private DemoService demoService;

    @GetMapping("/call")
    public String callService() {
        return demoService.unstableMethod();
    }
}
