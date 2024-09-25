package bai2.entities;

import bai2.message.MessageService;

public class Order {
    private Customer customer;
    private Cart cart;

    public Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
    }

    public void processOrder(MessageService message) {
        for (Book book : cart.getItems()) {
            book.reduceStock(1);
        }
        message.sendConfirmation(customer, cart);
    }
}
