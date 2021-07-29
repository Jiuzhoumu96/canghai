package com.lanhuigu.canghai.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: HeChengyao
 * @date: 2021/7/28 18:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * ConfigurationProperties配置绑定。需要将Bean放到容器中
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
@Component
/**
 * 使用 ConfigurationProperties 的方式1.这个地方使用 @Component
 * 方式2. 在配置类 MyConfig类中使用 EnableConfigurationProperties 注解
 */
@ConfigurationProperties(prefix = "mycar")
public class Car {

    String brand;
    Integer price;
    Integer speed;

}
