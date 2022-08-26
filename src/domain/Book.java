package domain;

import java.util.Arrays;
import java.util.Comparator;

public class Book implements Comparator<Book> {

    public static int count = 0;

    private String bookName;
    private String authorName;
    private String authorSurname;
    private String authorPatronymic;

    public Book() {
    }


    public Book(String bookName, String authorName, String authorSurname, String authorPatronymic) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorPatronymic = authorPatronymic;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }



    @Override
    public int compare(Book o1, Book o2) {
        return 0;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (authorName != null ? !authorName.equals(book.authorName) : book.authorName != null) return false;
        if (authorSurname != null ? !authorSurname.equals(book.authorSurname) : book.authorSurname != null)
            return false;
        return authorPatronymic != null ? authorPatronymic.equals(book.authorPatronymic) : book.authorPatronymic == null;
    }

    @Override
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (authorSurname != null ? authorSurname.hashCode() : 0);
        result = 31 * result + (authorPatronymic != null ? authorPatronymic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                '}';
    }
}
