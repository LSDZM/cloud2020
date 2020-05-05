package com.dzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: dzm
 * @date: 2020/5/4 15:03
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class,args);
  }
}
