package com.jrm.ydm.customereureka.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 使用 feign 作为负载的服务接口
 * @author yudaoming
 */
@FeignClient("eureka-provider")
public interface FeignService {

    /**
     * 服务测试方法
     * @return
     */
    @GetMapping("/provider/test")
    public String provideTestFunction();

}
