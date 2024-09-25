package bai2.message;

import bai2.entities.Book;
import bai2.entities.Cart;
import bai2.entities.Customer;

public class SMSService implements MessageService {

    @Override
    public void sendConfirmation(Customer customer, Cart cart) {
        System.out.println("SMS confirmation sent to: " + customer.getName());
        System.out.println("bai2.entities.Order details sent via SMS.");
        for (Book book : cart.getItems()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Total: " + cart.calculateTotal());
    }
}
