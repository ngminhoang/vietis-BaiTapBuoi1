package bai2.message;

import bai2.entities.Cart;
import bai2.entities.Customer;

public interface MessageService {
    void sendConfirmation(Customer customer, Cart cart);
}