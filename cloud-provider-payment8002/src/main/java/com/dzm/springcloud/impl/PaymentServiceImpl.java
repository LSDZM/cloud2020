package com.dzm.springcloud.impl;

import com.dzm.springcloud.dao.PaymentDao;
import com.dzm.springcloud.entities.Payment;
import com.dzm.springcloud.service.PaymentService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author dzm
 * @date 2020/4/29 20:32
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  @Override
  public int create(Payment payment){
    return paymentDao.create(payment);
  }

  @Override
  public Payment getPaymentById(Long id){
    return paymentDao.getPaymentById(id);
  }

}
