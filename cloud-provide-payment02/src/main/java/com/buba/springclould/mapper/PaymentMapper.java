package com.buba.springclould.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ce.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

   int create(Payment payment);
   Payment queryById(@Param("id")long id);
}