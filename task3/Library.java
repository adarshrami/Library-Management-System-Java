package com.task3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " registered successfully.");
    }

    public void showAllBooks() {
        System.out.println("\n📘 All Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book != null && user != null) {
            book.issueBook();
            System.out.println("Issued to: " + user.getName());
        } else {
            System.out.println("Book or User not found!");
        }
    }

    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found!");
        }
    }

    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }

    private User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id)
                return u;
        }
        return null;
    }
}

