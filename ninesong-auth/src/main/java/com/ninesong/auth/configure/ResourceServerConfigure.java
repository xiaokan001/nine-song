package com.ninesong.auth.configure;

import com.ninesong.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author zhouxz
 * @date 2021-10-18 14:12
 * @description
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Autowired
    private AuthenticationManager authenticationManager;
//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
}
