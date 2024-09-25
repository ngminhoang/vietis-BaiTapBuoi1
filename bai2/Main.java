package bai2;

import bai2.entities.Book;
import bai2.entities.Cart;
import bai2.entities.Customer;
import bai2.store.OfflineStore;
import bai2.store.Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new OfflineStore();
        Cart cart = new Cart();
        Customer currentCustomer = null;

        // Add default books
        store.addBook(new Book("Sách 1", "Tác giả 1", 100.0, 10));
        store.addBook(new Book("Sách 2", "Tác giả 2", 150.0, 5));
        store.addBook(new Book("Sách 3", "Tác giả 3", 200.0, 7));
        store.addBook(new Book("Sách 4", "Tác giả 4", 250.0, 3));
        store.addBook(new Book("Sách 5", "Tác giả 5", 300.0, 2));
        store.addBook(new Book("Sách 6", "Tác giả 6", 120.0, 15));
        store.addBook(new Book("Sách 7", "Tác giả 7", 80.0, 20));
        store.addBook(new Book("Sách 8", "Tác giả 8", 60.0, 25));
        store.addBook(new Book("Sách 9", "Tác giả 9", 90.0, 18));
        store.addBook(new Book("Sách 10", "Tác giả 10", 110.0, 12));

        // Add default customer
        store.addCustomer(new Customer("Nguyễn Văn A", "Địa chỉ A", "0123456789"));
        currentCustomer = store.getCustomers().get(0);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Show list of books");
            System.out.println("2. Show list of customers");
            System.out.println("3. Add book to cart");
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("6. Add new customer");
            System.out.println("7. Add new book");
            System.out.println("8. Switch customer");
            System.out.println("9. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    store.showBooks();
                    break;

                case 2:
                    store.shoCustomers();
                    break;

                case 3:
                    System.out.print("Enter the number of the book to add to the cart (1 to " + store.getBooks().size() + "): ");
                    int bookIndex = scanner.nextInt() - 1;
                    if (bookIndex >= 0 && bookIndex < store.getBooks().size()) {
                        if (store.getBooks().get(bookIndex).getStock() <= 0) {
                            System.out.println("This Book is not available because of sold out.");
                        } else {
                            cart.addBook(store.getBooks().get(bookIndex));
                            System.out.println("Book added to cart.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    System.out.println("Books in your cart:");
                    for (Book book : cart.getItems()) {
                        System.out.println(book.getTitle() + " - " + book.getPrice());
                    }
                    System.out.println("Total: " + cart.calculateTotal());
                    break;

                case 5:
                    if (!(currentCustomer == null || cart.getItems().isEmpty())) {
                        store.checkout(currentCustomer, cart);
                        cart.clear();
                        System.out.println("Thank you for your purchase, " + currentCustomer.getName() + "!");
                    } else {
                        System.out.println("No customer selected for checkout or cart is empty.");
                    }
                    break;

                case 6:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter customer phone: ");
                    String phone = scanner.nextLine();
                    Customer newCustomer = new Customer(name, address, phone);
                    store.addCustomer(newCustomer);
                    currentCustomer = newCustomer;
                    System.out.println("New customer added: " + name);
                    break;

                case 7:
                    System.out.print("Enter book title: ");
                    String newBookTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter stock: ");
                    int stock = scanner.nextInt();
                    Book newBook = new Book(newBookTitle, author, price, stock);
                    store.addBook(newBook);
                    System.out.println("New book added: " + newBook.getTitle());
                    break;

                case 8:
                    System.out.println("Select a customer:");
                    for (int i = 0; i < store.getCustomers().size(); i++) {
                        System.out.println((i + 1) + ". " + store.getCustomers().get(i).getName());
                    }
                    System.out.print("Enter the number of the customer: ");
                    int customerIndex = scanner.nextInt() - 1;
                    if (customerIndex >= 0 && customerIndex < store.getCustomers().size()) {
                        currentCustomer = store.getCustomers().get(customerIndex);
                        System.out.println("Switched to customer: " + currentCustomer.getName());
                    } else {
                        System.out.println("Invalid customer number.");
                    }
                    break;

                case 9:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}


