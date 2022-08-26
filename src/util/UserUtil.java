package util;

import domain.User;

public class UserUtil {

    public static User[] generateUsers(int arrayCapacity) {
        User[] arrayUsers = new User[arrayCapacity];
        for (int i = 0; i < arrayCapacity; i++) {
            User user = new User();
            arrayUsers[i] = user;
        }
        return (arrayUsers);
    }
}
