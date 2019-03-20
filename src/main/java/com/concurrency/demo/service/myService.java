package com.concurrency.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.concurrency.demo.annotation.log;

@Service
@Slf4j
public class myService {

    @log()
    public String execute() {
        log.info("Service");
        return "Service invoke";
    }

    //concurrencyTest
    public int concurrencyTest(){
        return 1;
    }
}
