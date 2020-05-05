package com.dzm.springcloud.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  @author: dzm
 *  @Date: 2020/4/29 16:51
 *  @Description: Payment实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

  private Long id;
  private String serial;

}
