package com.lanhuigu.canghai;

import com.lanhuigu.canghai.po.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: HeChengyao
 * @date: 2021/9/1 15:42
 */
public class petTest {

    public static void main(String[] args) {

        List<Pet> ss=new ArrayList<>(5);
        Pet pet=new Pet("qiutian",12.3);
        ss.add(pet);
        System.out.println(ss);
        System.out.println(ss.size());


    }


}
