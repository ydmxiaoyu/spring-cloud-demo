package com.jrm.ydm.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者控制器
 *
 * @author yudaoming
 * @version 1.0
 * @date 2019/6/3 11:37
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private DiscoveryClient client;

    /**
     * 测试服务提供者
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "服务提供者的测试方法...";
    }

}
