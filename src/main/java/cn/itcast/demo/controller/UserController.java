package cn.itcast.demo.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/loginUser")
    public void loginUser() {

        String name = SecurityContextHolder.getContext().getAuthentication().getName();

        System.out.println(name);
        System.out.println("hahahahahahhahah");

    }

}
