package com.cassey.ggsddu.ms.consumer.order.controller;

import com.cassey.ggsddu.ms.consumer.common.data.Result;
import com.cassey.ggsddu.ms.consumer.order.pojo.form.PreOrderForm;
import com.cassey.ggsddu.ms.consumer.order.service.OrderPreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderPreService orderPreService;

    @PostMapping("create")
    public Result preOrder(@RequestBody PreOrderForm form) {
        orderPreService.preOrder(form);
        return Result.succeed();
    }
}
