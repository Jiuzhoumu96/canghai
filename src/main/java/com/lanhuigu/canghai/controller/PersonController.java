package com.lanhuigu.canghai.controller;

import com.lanhuigu.canghai.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HeChengyao
 * @date: 2021/7/29 11:45
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private Person person;

    @GetMapping("/find")
    public Person findPerson(){
        return person;
    }

}
