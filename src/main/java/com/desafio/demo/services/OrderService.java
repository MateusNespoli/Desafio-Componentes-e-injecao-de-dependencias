package com.desafio.demo.services;

import com.desafio.demo.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total (Order order) {
        double discountAmount = order.getBasic() * (order.getDiscount() / 100.0);
        order.setBasic(order.getBasic() - discountAmount);
        return shippingService.shipment(order);
    }
}
