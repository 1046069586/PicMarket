package com.example.back_end.service.impl;

import com.example.back_end.mapper.OrderMapper;
import com.example.back_end.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void buy(String username, String name) {
        orderMapper.buy(username, name);




    }
}
