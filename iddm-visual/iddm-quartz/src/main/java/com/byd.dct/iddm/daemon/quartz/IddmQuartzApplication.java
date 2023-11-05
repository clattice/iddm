package com.byd.dct.iddm.daemon.quartz;

import com.byd.dct.iddm.common.feign.annotation.EnableIddmFeignClients;
import com.byd.dct.iddm.common.security.annotation.EnableIddmResourceServer;
import com.byd.dct.iddm.common.swagger.annotation.EnableIddmDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author frwcloud
 * @date 2023-07-05
 */
@EnableIddmDoc("job")
@EnableIddmFeignClients
@EnableIddmResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class IddmQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(IddmQuartzApplication.class, args);
	}

}
