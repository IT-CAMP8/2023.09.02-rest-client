package pl.camp.it.rest.client;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserRequest {
    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private User.Role role;
}
