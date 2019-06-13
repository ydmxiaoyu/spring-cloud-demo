package com.jrm.ydm.customereureka.controller;

import com.jrm.ydm.customereureka.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 消费者服务控制器
 *
 * @author yudaoming
 * @version 1.0
 * @date 2019/6/3 13:08
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private FeignService feignService;

    /**
     * 测试方法
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "消费者服务测试...";
    }

    /**
     * 通过 feign 调用服务提供者的测试方法
     * @return
     */
    @GetMapping("/cus")
    public String testProvide(){

        return feignService.provideTestFunction();
    }

}
