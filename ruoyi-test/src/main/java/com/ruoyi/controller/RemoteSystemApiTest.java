package com.ruoyi.controller;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.api.RemoteUserService;
import com.ruoyi.system.api.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteSystemApiTest {

    @Autowired
    RemoteUserService remoteUserService;

    @GetMapping("/user/info/{username}")
    R<LoginUser> getUserInfo (@PathVariable("username") String username){
        return remoteUserService.getUserInfo(username, "d");
    }



}
