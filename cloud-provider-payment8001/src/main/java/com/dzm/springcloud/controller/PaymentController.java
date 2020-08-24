package com.dzm.springcloud.controller;

import com.dzm.springcloud.entities.CommonResult;
import com.dzm.springcloud.entities.Payment;
import com.dzm.springcloud.service.PaymentService;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

  @Resource
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @Resource
  private DiscoveryClient discoveryClient;

  @PostMapping(value = "/payment/create")
  public CommonResult create(@RequestBody Payment payment){
    int result = paymentService.create(payment);
    log.info("*********插入结果："+result);
    if (result>0){
      return new CommonResult(200,"插入数据成功",result);
    }else {
      return new CommonResult(444,"插入数据库失败",null);
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult getPaymentById(@PathVariable("id") Long id){
    Payment payment = paymentService.getPaymentById(id);
    log.info("*********查询结果："+payment);
    if (payment!=null){
      return new CommonResult(200,"查询成功 serverPort="+serverPort,payment);
    }else {
      return new CommonResult(444,"没有对应记录，查询ID："+id,null);
    }
  }

  @GetMapping(value = "/payment/discovery")
  public  Object discovery(){
    List<String> stringList = discoveryClient.getServices();
    for (String element : stringList){
      System.err.println("******element:"+ element);
    }
    List<ServiceInstance> instanceList = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
    for (ServiceInstance instance : instanceList){
      System.err.println(instance.getServiceId());
      System.err.println(instance.getHost());
      System.err.println(instance.getPort());
      System.err.println(instance.getUri());
    }
    return this.discoveryClient;
  }
}
