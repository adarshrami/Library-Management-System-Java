package com.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("WELCOME TO LIBRARY SYSTEM");
        System.out.println("==================================");

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();

                    library.addUser(new User(userId, userName));
                    break;

                case 3:
                    library.showAllBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();

                    library.issueBook(issueBookId, issueUserId);
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for using the Library System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
