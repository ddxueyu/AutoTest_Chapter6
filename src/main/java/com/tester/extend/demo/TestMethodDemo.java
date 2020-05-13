package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by lanmao on 2020/5/12.
 */
public class TestMethodDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }


    @Test
    public void test3(){
        Assert.assertEquals("aaaa","aaaa");
        assert "aaa".equals("aaA");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
         throw new RuntimeException("这是自己抛的异常");
    }
}
