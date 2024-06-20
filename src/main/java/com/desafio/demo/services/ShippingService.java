package com.desafio.demo.services;

import com.desafio.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order) {

        if (order.getBasic() < 100.00){
            return order.getBasic() + 20.00;
        }else if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00){
            return order.getBasic() + 12.00;
        }else {
            return order.getBasic();
        }
    }
}