package collection;

import domain.Book;
import util.BookUtil;
import util.CollectionsUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsBook {

    public static void main(String[] args) {

        Book[] books = BookUtil.generateBooks(20, 0);

        List<Book> booksLinked = new LinkedList<>();
        Collections.addAll(booksLinked, books);
        CollectionsUtil.print(booksLinked);

        booksLinked.remove(6);
        CollectionsUtil.print(booksLinked);

    }
}
