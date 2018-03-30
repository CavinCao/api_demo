package com.cavin.springboot.api_demo.controller;

import com.cavin.springboot.api_demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//相当于 @Controller + @ResponseBody
//该注解 方法method 返回类型是String时候则返回string,返回对象时候则讲json_encode 该对象的json字符串
@RestController
@RequestMapping("/demo")
@Api(value="/demo", tags="测试接口模块")
public class DemoController {

    @Autowired
    private DemoService demoService;

    //该注解mapping指定路由
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    @ApiOperation(value="输出hello", notes="这是第一个demo")
    public String SayHello() {
        return demoService.sayHello();
    }
}
