package Task2;

import java.util.Scanner;

public class Book {

    static class Title {
        static String title;
        static void show(){
            System.out.println("Введите название книги: ");
            Scanner in = new Scanner(System.in);
            title = in.next();
        }
    }



    static class Author {
        static String author;
        static void show(){
            System.out.println("Введите имя автора: ");
            Scanner in = new Scanner(System.in);
            author = in.next();
        }
    }



    static class Content {
        static String content;
        static void show(){
            System.out.println("Введите краткое содержание книги: ");
            Scanner in = new Scanner(System.in);
            content = in.next();
        }
    }
}
