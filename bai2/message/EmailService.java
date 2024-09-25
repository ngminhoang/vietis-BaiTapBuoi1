package bai2.message;

import bai2.entities.Book;
import bai2.entities.Cart;
import bai2.entities.Customer;

public class EmailService implements MessageService {

    @Override
    public void sendConfirmation(Customer customer, Cart cart) {
        System.out.println("Email confirmation sent to: " + customer.getName());
        System.out.println("bai2.entities.Order details: ");
        for (Book book : cart.getItems()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Total: " + cart.calculateTotal());
    }
}
