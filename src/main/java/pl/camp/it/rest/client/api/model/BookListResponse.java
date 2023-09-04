package pl.camp.it.rest.client.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.camp.it.rest.client.api.model.Book;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BookListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
public class BookListResponse {

  @Valid
  private List<@Valid Book> bookList;

  public BookListResponse bookList(List<@Valid Book> bookList) {
    this.bookList = bookList;
    return this;
  }

  public BookListResponse addBookListItem(Book bookListItem) {
    if (this.bookList == null) {
      this.bookList = new ArrayList<>();
    }
    this.bookList.add(bookListItem);
    return this;
  }

  /**
   * Get bookList
   * @return bookList
  */
  @Valid 
  @Schema(name = "bookList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookList")
  public List<@Valid Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<@Valid Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookListResponse bookListResponse = (BookListResponse) o;
    return Objects.equals(this.bookList, bookListResponse.bookList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookListResponse {\n");
    sb.append("    bookList: ").append(toIndentedString(bookList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

