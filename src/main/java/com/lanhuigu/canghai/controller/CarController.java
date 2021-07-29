package com.lanhuigu.canghai.controller;

import com.lanhuigu.canghai.po.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HeChengyao
 * @date: 2021/7/28 18:10
 */
@Slf4j
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    Car car;

    @GetMapping("/find")
    public Car findCar(){

        return car;

    }
}
