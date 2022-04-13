package com.buba.springclould.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ce.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
   int create(Payment payment);
   Payment queryById(@Param("id")long id);
}