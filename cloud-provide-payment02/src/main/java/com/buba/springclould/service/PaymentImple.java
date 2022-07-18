package com.buba.springclould.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buba.springclould.mapper.PaymentMapper;
import com.ce.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentImple extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        System.out.println("-11111111111111111-");
        return paymentMapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentMapper.queryById(id);
    }

    @Override
    public List<Payment> select(Payment dept) {
        return paymentMapper.selectList(new QueryWrapper<Payment>().eq("serial",dept.getSerial()));
    }
}