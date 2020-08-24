package com.dzm.springcloud.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: dzm
 * @date: 2020/4/29 21:54
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

  public static final String PAYMENT_URL = "http://consul-provider-peyment";
  @Resource
  private RestTemplate restTemplate;

  @GetMapping(value = "/consumer/payment/consul")
  public String paymentInfo(){
    String result = restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    return result;
  }


}
