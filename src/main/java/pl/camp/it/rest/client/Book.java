package pl.camp.it.rest.client;

import lombok.*;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int quantity;
    private String isbn;

    public Book(int id) {
        this.id = id;
    }
}
