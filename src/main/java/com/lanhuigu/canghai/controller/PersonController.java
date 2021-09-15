package com.lanhuigu.canghai.controller;

import com.lanhuigu.canghai.common.constant.Weekdays;
import com.lanhuigu.canghai.config.ApplicationConfig;
import com.lanhuigu.canghai.po.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private Person person;
    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/find")
    public Person findPerson() {
        String cs = applicationConfig.getCanHaiSangTian();
        String rd = applicationConfig.getRenJanZengDao();
        System.out.println(cs + rd);

        log.info(Weekdays.MONDAY.toString());
        log.info(Weekdays.MONDAY.getName());
        int index = Weekdays.MONDAY.getIndex();
        Integer sss=index;
        String index_str= sss.toString();
        log.info(index_str);

        // log.info(">>>>>>" + cs + "," + rd);
        return person;
    }

}
