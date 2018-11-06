package com.zhzhd.test;;
/**
 *@author zhangzhendong1
 *@date 2018/11/6
 *@package com.zhzhd.test
 *@describe
 **/
public class HelloServiceImpl implements HelloService{
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}