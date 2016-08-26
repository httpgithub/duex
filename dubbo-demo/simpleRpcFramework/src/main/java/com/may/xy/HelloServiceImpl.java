package com.may.xy;

/**
 * Created by mayxys on 2016/8/26.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
