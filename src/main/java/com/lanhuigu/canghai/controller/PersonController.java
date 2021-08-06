package com.lanhuigu.canghai.controller;

import com.lanhuigu.canghai.config.ApplicationConfig;
import com.lanhuigu.canghai.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HeChengyao
 * @date: 2021/7/29 11:45
 */
// @Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private Person person;
    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/find")
    public Person findPerson() {
        String cs = applicationConfig.getCanHaiSangTian();
        String rd = applicationConfig.getRenJanZengDao();
        System.out.println(cs + rd);
        // log.info(">>>>>>" + cs + "," + rd);
        return person;
    }

}
