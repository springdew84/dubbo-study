package com.cassey.ggsddu.ms.consumer.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cassey.ggsddu.ms.consumer.order.pojo.form.PreOrderForm;
import com.cassey.ggsddu.ms.consumer.order.service.OrderPreService;
import com.cassey.ggsddu.ms.order.req.OrderCreateReq;
import com.cassey.ggsddu.ms.order.res.OrderCreateRes;
import com.cassey.ggsddu.ms.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderPreServiceImpl implements OrderPreService {

    @Reference
    private OrderService orderService;

    @Override
    public boolean preOrder(PreOrderForm form) {
        OrderCreateReq req = new OrderCreateReq();

        OrderCreateRes res = orderService.create(req);

        if(res != null && res.getId() != null) {
            return true;
        } else {
            return false;
        }
    }
}
