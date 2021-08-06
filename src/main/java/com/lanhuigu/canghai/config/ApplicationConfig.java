package com.lanhuigu.canghai.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author: HeChengyao
 * @date: 2021/8/6 16:30
 */
@Data
@Configuration
public class ApplicationConfig {

    @Value("${com.lanhuigu.canghaisangtian}")
    String canHaiSangTian;
    @Value("${com.lanhuigu.renjianzhengdao}")
    String renJanZengDao;

}

