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
import pl.camp.it.rest.client.api.model.OrderPositionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SaveOrderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
public class SaveOrderRequest {

  private Integer userId;

  @Valid
  private Set<@Valid OrderPositionDTO> orderPositions;

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

  public SaveOrderRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public SaveOrderRequest orderPositions(Set<@Valid OrderPositionDTO> orderPositions) {
    this.orderPositions = orderPositions;
    return this;
  }

  public SaveOrderRequest addOrderPositionsItem(OrderPositionDTO orderPositionsItem) {
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
  @Valid 
  @Schema(name = "orderPositions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderPositions")
  public Set<@Valid OrderPositionDTO> getOrderPositions() {
    return orderPositions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderPositions(Set<@Valid OrderPositionDTO> orderPositions) {
    this.orderPositions = orderPositions;
  }

  public SaveOrderRequest status(StatusEnum status) {
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

  public SaveOrderRequest total(Double total) {
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

  public SaveOrderRequest dateTime(OffsetDateTime dateTime) {
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
    SaveOrderRequest saveOrderRequest = (SaveOrderRequest) o;
    return Objects.equals(this.userId, saveOrderRequest.userId) &&
        Objects.equals(this.orderPositions, saveOrderRequest.orderPositions) &&
        Objects.equals(this.status, saveOrderRequest.status) &&
        Objects.equals(this.total, saveOrderRequest.total) &&
        Objects.equals(this.dateTime, saveOrderRequest.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, orderPositions, status, total, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOrderRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

