package util;

import domain.Book;

import java.util.Random;

import static service.BookInterface.BOOK_AUTHOR_NAME1;
import static service.BookInterface.BOOK_AUTHOR_NAME2;
import static service.BookInterface.BOOK_AUTHOR_NAME3;
import static service.BookInterface.BOOK_AUTHOR_NAME4;
import static service.BookInterface.BOOK_AUTHOR_NAME5;
import static service.BookInterface.BOOK_AUTHOR_NAME6;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC1;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC2;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC3;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC4;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC5;
import static service.BookInterface.BOOK_AUTHOR_PATRONYMIC6;
import static service.BookInterface.BOOK_AUTHOR_SURNAME1;
import static service.BookInterface.BOOK_AUTHOR_SURNAME2;
import static service.BookInterface.BOOK_AUTHOR_SURNAME3;
import static service.BookInterface.BOOK_AUTHOR_SURNAME4;
import static service.BookInterface.BOOK_AUTHOR_SURNAME5;
import static service.BookInterface.BOOK_AUTHOR_SURNAME6;
import static service.BookInterface.BOOK_NAME1;
import static service.BookInterface.BOOK_NAME2;
import static service.BookInterface.BOOK_NAME3;
import static service.BookInterface.BOOK_NAME4;
import static service.BookInterface.BOOK_NAME5;
import static service.BookInterface.BOOK_NAME6;

public class BookUtil {

    public static Book[] generateBooks(int total, int countOfSame) {
        Book[] arrayBook = new Book[total];
        for (int i = 0; i < total; i++) {
            Book book = new Book();
            book.setBookName(generateBookName());
            book.setAuthorName(generateBookAuthorName());
            book.setAuthorSurname(generateBookAuthorSurname());
            book.setAuthorPatronymic(generateBookAuthorPatronymic());
            arrayBook[i] = book;
        }
        for (int i = 0; i < countOfSame; i++) {
            Book book = new Book("Treasure Island", "Robert", "Louis", "Stevenson");
            arrayBook[i] = book;
        }
        return (arrayBook);
    }

    private static String generateBookName() {
        String [] arrayBookName = {BOOK_NAME1,BOOK_NAME2, BOOK_NAME3, BOOK_NAME4, BOOK_NAME5, BOOK_NAME6};
        return(arrayBookName[random(arrayBookName.length)]);
    }

    private static String generateBookAuthorName() {
        String [] arrayBookAuthorName = {BOOK_AUTHOR_NAME1,BOOK_AUTHOR_NAME2, BOOK_AUTHOR_NAME3, BOOK_AUTHOR_NAME4, BOOK_AUTHOR_NAME5, BOOK_AUTHOR_NAME6};
        return(arrayBookAuthorName[random(arrayBookAuthorName.length)]);
    }

    private static String generateBookAuthorSurname() {
        String [] arrayBookAuthorSurname = {BOOK_AUTHOR_SURNAME1,BOOK_AUTHOR_SURNAME2, BOOK_AUTHOR_SURNAME3, BOOK_AUTHOR_SURNAME4, BOOK_AUTHOR_SURNAME5, BOOK_AUTHOR_SURNAME6};
        return(arrayBookAuthorSurname[random(arrayBookAuthorSurname.length)]);
    }

    private static String generateBookAuthorPatronymic() {
        String [] arrayBookAuthorPatronymic = {BOOK_AUTHOR_PATRONYMIC1,BOOK_AUTHOR_PATRONYMIC2, BOOK_AUTHOR_PATRONYMIC3, BOOK_AUTHOR_PATRONYMIC4, BOOK_AUTHOR_PATRONYMIC5, BOOK_AUTHOR_PATRONYMIC6};
        return(arrayBookAuthorPatronymic[random(arrayBookAuthorPatronymic.length)]);
    }

    public static int random(int arrayLength) {
        Random random = new Random();
        int arrayIndex = random.nextInt(arrayLength);
        return (arrayIndex);
    }

}
