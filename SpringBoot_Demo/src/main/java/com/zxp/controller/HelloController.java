package com.zxp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangxpc@jiedaibao.com
 * @Description ：
 * @ClassName ：HelloController
 * @date ：2017/2/22 12:04
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/say/{name}",produces = {"application/json; charset=UTF-8"})
    public String sayHello(@PathVariable("name") String name){
        logger.info("sayHello");
        return name+"hello";
    }
}
