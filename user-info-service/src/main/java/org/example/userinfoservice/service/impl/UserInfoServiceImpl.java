package org.example.userinfoservice.service.impl;

import com.alibaba.rsocket.RSocketService;
import org.example.common.po.UserInfo;
import org.example.common.service.UserInfoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RSocketService(serviceInterface = UserInfoService.class)
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public Mono<UserInfo> findByName(String name) {
        return Mono.just(new UserInfo("Test Passed"));
    }
}
