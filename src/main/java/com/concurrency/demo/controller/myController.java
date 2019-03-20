package com.concurrency.demo.controller;

import com.concurrency.demo.service.myService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myController")
public class myController {

    @RequestMapping("/concurrency")
    public @ResponseBody
    String resp(){
        myService myService=new myService();
        String str=myService.execute();
        return str;
    }

}
