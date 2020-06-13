package com.huice.controller;

import com.huice.model.old.OldUser;

import com.huice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/api/user/get")
    public OldUser getUser(){
        OldUser user = iUserService.selectAll();
        return  user;
    }
    @GetMapping("/api/user/oldToNow")
    public void toInsert(){
        iUserService.oldToNow();
    }
}
