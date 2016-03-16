package com.xyxsoft.spring.ioc;

import org.junit.Assert;

/**
 * @author xyxsoft@126.com
 */
public class OutputService {

    private HelloWorldService helloWorldService;

    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
