package com.poly;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {


    @RequestMapping()
    public CountDate greeting(@RequestParam(value="year") int year) {


        return new CountDate(200, year );
    }
}
