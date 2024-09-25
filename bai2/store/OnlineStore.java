package bai2.store;

import bai2.entities.Cart;
import bai2.entities.Customer;
import bai2.entities.Order;
import bai2.message.EmailService;

public class OnlineStore extends Store {
    @Override
    public void checkout(Customer customer, Cart cart) {
        System.out.println("Processing online checkout for " + customer.getName());
        Order order = new Order(customer, cart);
        order.processOrder(new EmailService());
        System.out.println("Online order processed for " + customer.getName());
    }
}
