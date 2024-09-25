package bai2.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> items = new ArrayList<>();

    public void addBook(Book book) {
        items.add(book);
    }

    public List<Book> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Book book : items) {
            total += book.getPrice();
        }
        return total;
    }
    public void clear() {
        items.clear();
        System.out.println("The cart has been cleared.");
    }
}
