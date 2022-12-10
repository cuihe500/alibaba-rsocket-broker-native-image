package org.example.common.service;

import com.alibaba.rsocket.RSocketServiceInterface;
import org.example.common.po.UserInfo;
import reactor.core.publisher.Mono;

@RSocketServiceInterface
public interface UserInfoService {
    Mono<UserInfo> findByName(String name);
}
