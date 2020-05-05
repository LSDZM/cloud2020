package com.dzm.springcloud.dao;

import com.dzm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  *  @author: dzm
  *  @Date: 2020/4/29 20:11
  *  @Description:
  */
@Mapper
public interface PaymentDao {

  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);

}
