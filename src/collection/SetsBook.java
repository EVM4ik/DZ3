package collection;

import domain.Book;
import domain.FieldForComparator;
import util.BookUtil;
import util.CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsBook {

    public static void main(String[] args) {

        Book[] books = BookUtil.generateBooks(25, 6);

        Set<Book> booksSet = new HashSet<>();
        Collections.addAll(booksSet, books);
        CollectionsUtil.print(booksSet);

        List<String> towels = new ArrayList<>();
        towels.add("A");
        towels.add("E");
        towels.add("I");
        towels.add("O");
        towels.add("U");
        towels.add("Y");
        towels.add("a");
        towels.add("e");
        towels.add("i");
        towels.add("o");
        towels.add("u");
        towels.add("y");

        for (Book e : booksSet) {
            for (String s: towels)
                if(e.getBookName().startsWith(s)) {
                    Set<Book> booksSet2 = new HashSet<>();
                    booksSet2.add(e);
                    System.out.println();
                    CollectionsUtil.print(booksSet2);
                }
        }

        String userQuery = "AUTHOR-NAME";
        FieldForComparator fieldForComparator = FieldForComparator.valueOf(userQuery);
        List sortedBooksSet = new ArrayList(booksSet);

        switch (fieldForComparator) {
            case AUTHORNAME:
                Collections.sort(sortedBooksSet, new Comparator<Book>() {
                    public int compare(Book o1, Book o2) {
                        return CharSequence.compare(o1.getAuthorName(), o2.getAuthorName());
                    }
                });
                System.out.println("Sort name");
                CollectionsUtil.print(sortedBooksSet);
                break;
            case AUTHORSURNAME:
                Collections.sort(sortedBooksSet, new Comparator<Book>() {
                    public int compare(Book o1, Book o2) {
                        return CharSequence.compare(o1.getAuthorSurname(), o2.getAuthorSurname());
                    }
                });
                System.out.println("Sort surname");
                CollectionsUtil.print(sortedBooksSet);
                break;
            case AUTHORPATRONYMIC:
                Collections.sort(sortedBooksSet, new Comparator<Book>() {
                    public int compare(Book o1, Book o2) {
                        return CharSequence.compare(o1.getAuthorPatronymic(), o2.getAuthorPatronymic());
                    }
                });
                System.out.println("Sort patronymic");
                CollectionsUtil.print(sortedBooksSet);
                break;
        }
    }

}
