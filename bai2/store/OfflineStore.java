package bai2.store;

import bai2.entities.Cart;
import bai2.entities.Customer;
import bai2.entities.Order;
import bai2.message.SMSService;

public class OfflineStore extends Store {
    @Override
    public void checkout(Customer customer, Cart cart) {
        System.out.println("Processing offline checkout for " + customer.getName());
        Order order = new Order(customer, cart);
        order.processOrder(new SMSService());
        System.out.println("Offline order processed for " + customer.getName());
    }
}
