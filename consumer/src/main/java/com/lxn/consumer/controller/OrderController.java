package com.lxn.consumer.controller;

import com.lxn.consumer.service.impl.OrderServiceImpl;
import com.lxn.gmallinterface.bean.UserAddress;
import com.lxn.gmallinterface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired(required = false)
    OrderService service;
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String uid){
        return service.initOrder(uid);
    }
}
