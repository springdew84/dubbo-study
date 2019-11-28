package com.cassey.ggsddu.ms.provider.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cassey.ggsddu.ms.order.req.OrderCreateReq;
import com.cassey.ggsddu.ms.order.res.OrderCreateRes;
import com.cassey.ggsddu.ms.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by cassey on 2019/11/27.
 */
@Service
@Component
@Slf4j
public class OrderServiceImpl implements OrderService {
    /**
     * 创建定单
     *
     * @param req
     * @return
     */
    public OrderCreateRes create(OrderCreateReq req) {
        OrderCreateRes res = new OrderCreateRes();
        res.setId(1);
        log.info("invoke create");
        return res;
    }
}
