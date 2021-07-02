package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @Resource
    DevMapper devMapper;

    @RequestMapping("/")
    public String sayHello() {
        return devMapper.getName()+" Really appreciate your star, that's the power of our life.";
    }
}
