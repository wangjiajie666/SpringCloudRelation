package com.buba.springclould.controller;


import com.buba.springclould.service.PaymentService;
import com.ce.springcloud.pojo.CommonResult;
import com.ce.springcloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


/*
* 提供restful服务  供其他服务调用
*
* */
@RestController
@Slf4j
public class PaymentControler {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept){
        List<Payment> select = paymentService.select(dept);
        System.out.println(select+"-------------------1111111111");
        if (null ==select|| select.size() ==0 ){
            int i = paymentService.create(dept);
            log.info("***************插入成功*******"+i);
            if(i>0){
                return new CommonResult(200,"插入数据库成功"+serverPort,i);
            }else{
                return new CommonResult(444,"插入数据库失败",null);
            }
        }else {
            return new CommonResult(444,"已存在",null);
        }

    }
    @GetMapping("/payment/get/{id}")

    public CommonResult queryById(@PathVariable("id") Long id) throws InterruptedException {
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
    
}