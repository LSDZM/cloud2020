package com.dzm.springcloud.controller;


import java.util.UUID;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dzm
 * @date: 2020/4/29 20:39
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/payment/consul")
  public String paymentConsul(){
    return "springcloud with consul："+serverPort+"\t"+ UUID.randomUUID().toString();
  }



}
