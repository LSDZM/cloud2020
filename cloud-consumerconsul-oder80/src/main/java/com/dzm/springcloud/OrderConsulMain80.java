package com.dzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author: dzm
 * @date: 2020/4/29 21:49
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class OrderConsulMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderConsulMain80.class,args);
  }

}
