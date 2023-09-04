package pl.camp.it.rest.client.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
public class OrderDTO {

  private Integer id;

  private String user;

  @Valid
  private Set<String> orderPositions;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    PAID("PAID"),
    
    SENT("SENT"),
    
    DONE("DONE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Double total;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTime;

  public OrderDTO id(Integer id) {
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

  public OrderDTO user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public OrderDTO orderPositions(Set<String> orderPositions) {
    this.orderPositions = orderPositions;
    return this;
  }

  public OrderDTO addOrderPositionsItem(String orderPositionsItem) {
    if (this.orderPositions == null) {
      this.orderPositions = new LinkedHashSet<>();
    }
    this.orderPositions.add(orderPositionsItem);
    return this;
  }

  /**
   * Get orderPositions
   * @return orderPositions
  */
  
  @Schema(name = "orderPositions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderPositions")
  public Set<String> getOrderPositions() {
    return orderPositions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderPositions(Set<String> orderPositions) {
    this.orderPositions = orderPositions;
  }

  public OrderDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OrderDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public OrderDTO dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @Valid 
  @Schema(name = "dateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDTO orderDTO = (OrderDTO) o;
    return Objects.equals(this.id, orderDTO.id) &&
        Objects.equals(this.user, orderDTO.user) &&
        Objects.equals(this.orderPositions, orderDTO.orderPositions) &&
        Objects.equals(this.status, orderDTO.status) &&
        Objects.equals(this.total, orderDTO.total) &&
        Objects.equals(this.dateTime, orderDTO.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, orderPositions, status, total, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    orderPositions: ").append(toIndentedString(orderPositions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

