package com.cassey.ggsddu.ms.order.service;

import com.cassey.ggsddu.ms.order.req.OrderCreateReq;
import com.cassey.ggsddu.ms.order.res.OrderCreateRes;

/**
 * Created by cassey on 2019/11/27.
 */
public interface OrderService {
    /**
     * 创建定单
     *
     * @param req
     * @return
     */
    OrderCreateRes create(OrderCreateReq req);
}
