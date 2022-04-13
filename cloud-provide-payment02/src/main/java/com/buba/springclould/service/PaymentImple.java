package com.buba.springclould.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buba.springclould.dao.PaymentDao;
import com.ce.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentImple extends ServiceImpl<PaymentDao , Payment> implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        System.out.println("-11111111111111111-");
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }

    @Override
    public List<Payment> select(Payment dept) {
        System.out.println(dept+"--------------------");
        return this.paymentDao.selectList(new QueryWrapper<Payment>().eq("serial",dept.getSerial()));
    }
}