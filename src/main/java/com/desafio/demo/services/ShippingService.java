package com.desafio.demo.services;

import com.desafio.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order) {

        if (order.getBasic() < 100.00){
            System.out.println("20");
            return order.getBasic() + 20.00;
        }else if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00){
            System.out.println("12");
            return order.getBasic() + 12.00;
        }else {
            System.out.println("0");
            return order.getBasic();
        }
    }
}