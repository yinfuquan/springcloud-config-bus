package com.yin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yin.
 * Date:2019/9/7
 * Time: 16:43
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {

        public static void main(String[] args) {
            SpringApplication.run(ConfigApplication.class, args);
        }

}
