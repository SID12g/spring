package com.sid12g.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "나는 고양이를 좋아합니다.";
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        var date = LocalDate.now();
        return date.toString();
    }

}
