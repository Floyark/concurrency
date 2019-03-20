package com.concurrency.demo.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ConcurrencyTest {

    public static int clientTotal=1000;
    public static int threadTotal=50;

    public void main(){
        log.info("日志测试");
    }

}
