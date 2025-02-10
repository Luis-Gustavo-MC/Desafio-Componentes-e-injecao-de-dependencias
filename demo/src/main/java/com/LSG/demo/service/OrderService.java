package com.LSG.demo.service;

import com.LSG.demo.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Double total(Order order){
        double result = order.getBasic() * (order.getDiscount()/100);
        return order.getBasic() - result;
    }
}
