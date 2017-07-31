package com.undead.view;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 * Created by WeiYangDong on 2017/7/31.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
