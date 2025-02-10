package com.LSG.demo.service;

import com.LSG.demo.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order){
        if (order.getBasic() < 100.00 ){
            return 20.00;
        }else if(order.getBasic()>=100.00 && order.getBasic()<200.00){
            return 12.00;
        } else {
            return 00.00;
        }
    }
}
