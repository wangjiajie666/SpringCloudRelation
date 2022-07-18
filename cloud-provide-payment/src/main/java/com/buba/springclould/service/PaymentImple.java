package com.buba.springclould.service;
 
import com.buba.springclould.mapper.PaymentMapper;
import com.ce.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class PaymentImple implements PaymentService {
    @Autowired
    PaymentMapper paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
 
    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}