package pl.camp.it.rest.client.api;

import pl.camp.it.rest.client.api.model.Book;
import pl.camp.it.rest.client.api.model.BookListResponse;
import pl.camp.it.rest.client.api.model.OrderDTO;
import pl.camp.it.rest.client.api.model.OrderListResponse;
import pl.camp.it.rest.client.api.model.OrderPositionListResponse;
import pl.camp.it.rest.client.api.model.OrderPositionResponseDTO;
import pl.camp.it.rest.client.api.model.SaveOrderRequest;
import pl.camp.it.rest.client.api.model.User;
import pl.camp.it.rest.client.api.model.UserRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-02T15:41:23.134488800+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
