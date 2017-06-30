package com.ricktech.relation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a021672 on 2017/6/29.
 */

@RestController
public class UserController {
    @GetMapping("/hello")
    public String get(){
        return "Hello User";
    }
}
