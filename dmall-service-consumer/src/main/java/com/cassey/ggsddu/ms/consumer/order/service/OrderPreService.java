package com.cassey.ggsddu.ms.consumer.order.service;

import com.cassey.ggsddu.ms.consumer.order.pojo.form.PreOrderForm;

public interface OrderPreService {
    /**
     * 下单
     * @param form
     * @return
     */
    boolean preOrder(PreOrderForm form);
}
