package com.siants.testng;

import org.testng.annotations.Test;

public class BasicAnnotion {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }


}
