package com.xiaopy.springfx8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaopeiyu
 * @since 2020/12/8
 */
@RestController
public class TestController {


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
