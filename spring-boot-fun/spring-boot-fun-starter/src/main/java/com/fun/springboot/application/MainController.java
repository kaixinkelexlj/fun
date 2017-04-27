package com.fun.springboot.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    /**
     * 健康检查
     */
    @GetMapping("/checkpreload.htm")
    public @ResponseBody String checkPreload() {
        return "success";
    }
}
