package com.dzm.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dzm
 * @date: 2020/4/29 21:59
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
