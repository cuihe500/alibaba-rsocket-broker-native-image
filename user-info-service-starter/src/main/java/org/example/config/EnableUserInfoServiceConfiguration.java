package org.example.config;

import com.alibaba.rsocket.invocation.RSocketRemoteServiceBuilder;
import com.alibaba.rsocket.upstream.UpstreamManager;
import org.example.common.service.UserInfoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class EnableUserInfoServiceConfiguration {

    @Bean
    public UserInfoService userInfoService(UpstreamManager upstreamManager) {
        return RSocketRemoteServiceBuilder
                .client(UserInfoService.class)
                .upstreamManager(upstreamManager)
                .nativeImage()
                .build();
    }

}
