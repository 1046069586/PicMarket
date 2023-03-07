package com.example.back_end.controller;

import com.example.back_end.config.Result;
import com.example.back_end.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/{username}/{name}")
    Result buy(@PathVariable String username, @PathVariable String name) {
        orderService.buy(username, name);
        return new Result("200", "success", null);
    }
}
