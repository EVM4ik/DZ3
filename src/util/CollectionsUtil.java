package util;

import java.util.Collection;

public class CollectionsUtil {

    public static <E> void print(Collection<E> listForPrint) {
        for (E e : listForPrint) {
            System.out.println(e);
        }
    }
}
