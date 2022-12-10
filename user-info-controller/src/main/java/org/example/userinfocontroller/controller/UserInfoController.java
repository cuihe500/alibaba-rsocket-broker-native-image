package org.example.userinfocontroller.controller;

import org.example.annotation.EnableUserInfoService;
import org.example.common.po.UserInfo;
import org.example.common.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@EnableUserInfoService
public class UserInfoController {

    private UserInfoService userInfoService;

    @Autowired
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/find/{name}")
    Mono<UserInfo> findByName(@PathVariable String name) {
        return userInfoService.findByName(name);
    }

}
