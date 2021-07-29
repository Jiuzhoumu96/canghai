package com.lanhuigu.canghai.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: HeChengyao
 * @date: 2021/7/28 16:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    Integer personId;
    String personName;
    Integer personAge;
    Pet personPet;

    public Person(Integer personId, String personName, Integer age) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = age;
    }

}
