package com.ruoyi.controller;


import com.ruoyi.vo.Product;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

class Test {
    public static void main(String[] args) {

        String name = "charles";
        String password = "123456";
        String password1 = "123456";
        String password2 = "123456";
        String password10 = "123456";
        String password30 = "123456";
        String password40 = "123456";
        String password50 = "123456";
        String password60 = "123456";
        String password70 = "123456";
        String password80 = "123456";
        String password90 = "123456";











        for (int i = 0; i < 2; i++) {  // 只执行一次的循环
            switch (name) {
                case "charles":
                    System.out.println(name);  // 输出: charles
                    continue;  // 跳过循环的剩余部分，直接开始下一次迭代
                case "cha":
                    System.out.println("name");  // 不会执行，因为continue跳过了
            }
            System.out.println("这行不会执行");  // 被continue跳过了
        }

    }
}







