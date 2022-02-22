package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/2/22
 **/
@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "hello-spring-boot-web";
    }


}
