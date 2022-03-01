package ru.dunice.elkclient.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService  {


    @EventListener(classes = {ContextRefreshedEvent.class})
    public void test() {
        log.info("one");
        log.info("two");
        //throw new RuntimeException("I am dead!");
//        log.info("three");
    }
}