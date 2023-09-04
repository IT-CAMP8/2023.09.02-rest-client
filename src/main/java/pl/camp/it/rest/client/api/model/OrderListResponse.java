package pl.camp.it.rest.client.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.camp.it.rest.client.api.model.OrderDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
public class OrderListResponse {

  @Valid
  private List<@Valid OrderDTO> orderList;

  public OrderListResponse orderList(List<@Valid OrderDTO> orderList) {
    this.orderList = orderList;
    return this;
  }

  public OrderListResponse addOrderListItem(OrderDTO orderListItem) {
    if (this.orderList == null) {
      this.orderList = new ArrayList<>();
    }
    this.orderList.add(orderListItem);
    return this;
  }

  /**
   * Get orderList
   * @return orderList
  */
  @Valid 
  @Schema(name = "orderList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderList")
  public List<@Valid OrderDTO> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<@Valid OrderDTO> orderList) {
    this.orderList = orderList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListResponse orderListResponse = (OrderListResponse) o;
    return Objects.equals(this.orderList, orderListResponse.orderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListResponse {\n");
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
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

