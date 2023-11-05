package com.byd.dct.iddm.demo;

import com.byd.dct.iddm.common.feign.annotation.EnableIddmFeignClients;
import com.byd.dct.iddm.common.security.annotation.EnableIddmResourceServer;
import com.byd.dct.iddm.common.swagger.annotation.EnableIddmDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @author pig archetype
* <p>
* 项目启动类
*/
@EnableIddmDoc(value = "demo")
@EnableIddmFeignClients
@EnableIddmResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class IddmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IddmDemoApplication.class, args);
    }

}
