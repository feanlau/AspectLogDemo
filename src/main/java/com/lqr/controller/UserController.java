package com.lqr.controller;

import com.lqr.model.Result;
import com.lqr.model.User;
import com.lqr.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService mUserService;

    @PostMapping("/add")
    public Result add(User user) throws NotFoundException {
        return mUserService.add(user);
    }
}
