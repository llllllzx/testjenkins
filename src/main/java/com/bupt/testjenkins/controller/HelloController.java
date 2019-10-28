package com.bupt.testjenkins.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoxinliu on 2019/10/26
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world lzx ly";
    }
}
