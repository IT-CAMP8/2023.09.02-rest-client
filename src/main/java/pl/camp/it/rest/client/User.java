package pl.camp.it.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String login;
    private String name;
    private String surname;
    private Role role;

    public User(int id) {
        this.id = id;
    }

    public static User copyOf(User user) {
        User result = new User();
        result.id = user.id;
        result.role = user.role;
        result.name = user.name;
        result.surname = user.surname;
        result.login = user.login;
        return result;
    }

    public enum Role {
        ADMIN,
        USER
    }
}
