package com.mybs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AceCream on 2018/3/16.
 */
@Controller

public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}