package com.github.springeurekatudy.controller;

import com.github.springeurekatudy.test.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyuhu
 * @date 2018/4/19 上午10:06
 */

@RestController
public class HelloController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.company}")
    private String userCompany;

    @Value("${random.value}")
    private String randomValue;

    @Value("${random.int}")
    private int randomInt;

    @Value("${random.long}")
    private long randomLong;

    @Value("${random.code}")
    private String randomIntCode;

    @Value("${random.uuid}")
    private String uuid;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/user")
    public String user() {
        return new User().setUserName(userName).setUserCompany(userCompany).toString();
    }

    @RequestMapping("/random")
    public String random() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("randomValue: " + randomValue);
            System.out.println("randomInt: " + randomInt);
            System.out.println("randomLong: " + randomLong);
            System.out.println("randomIntCode: " + randomIntCode);
        }
        return "ok";
    }

}
