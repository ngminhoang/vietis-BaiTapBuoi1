package bai2.store;

import bai2.entities.Book;
import bai2.entities.Cart;
import bai2.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {
    private static List<Book> books = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public void showBooks() {
        System.out.println("Books in store:");
        for (Book book : getBooks()) {
            System.out.println(book.getTitle() + " - " + book.getPrice() + " - " + book.getStock());
        }
    }
    public void shoCustomers() {
        System.out.println("Customers in store:");
        for (Customer customer : getCustomers()) {
            System.out.println(customer.getName() + " - " + customer.getPhone());
        }
    }

    public abstract void checkout(Customer customer, Cart cart);
}
