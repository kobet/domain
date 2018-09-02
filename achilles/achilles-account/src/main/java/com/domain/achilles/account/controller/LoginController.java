package com.domain.achilles.account.controller;

import com.domain.achilles.bean.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Administrator
 * @Date: 2018/9/1 0001 10:07
 * @Description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String toLogin() {
        return "account/login";
    }

    @PostMapping
    @ResponseBody
    public Result login() {

        return Result.success();
    }

}
