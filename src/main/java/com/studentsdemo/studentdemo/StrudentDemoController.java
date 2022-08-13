package com.studentsdemo.studentdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class StrudentDemoController {
    @RequestMapping("/hello")

    public String StudentDemo(){

        return ("Hello Yesuf Hassen");
    }
}
