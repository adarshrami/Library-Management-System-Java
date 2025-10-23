package com.task3;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued successfully.");
        } else {
            System.out.println(title + " is already issued!");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned successfully.");
        } else {
            System.out.println(title + " was not issued!");
        }
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Status: " + (isIssued ? "Issued" : "Available");
    }
}
