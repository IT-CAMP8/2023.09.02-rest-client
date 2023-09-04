package pl.camp.it.rest.client.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderPositionResponseDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
public class OrderPositionResponseDTO {

  private Integer id;

  private String book;

  private Integer quantity;

  private String order;

  public OrderPositionResponseDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderPositionResponseDTO book(String book) {
    this.book = book;
    return this;
  }

  /**
   * Get book
   * @return book
  */
  
  @Schema(name = "book", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("book")
  public String getBook() {
    return book;
  }

  public void setBook(String book) {
    this.book = book;
  }

  public OrderPositionResponseDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderPositionResponseDTO order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  
  @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPositionResponseDTO orderPositionResponseDTO = (OrderPositionResponseDTO) o;
    return Objects.equals(this.id, orderPositionResponseDTO.id) &&
        Objects.equals(this.book, orderPositionResponseDTO.book) &&
        Objects.equals(this.quantity, orderPositionResponseDTO.quantity) &&
        Objects.equals(this.order, orderPositionResponseDTO.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, book, quantity, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPositionResponseDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

