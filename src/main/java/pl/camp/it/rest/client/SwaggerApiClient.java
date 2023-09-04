package pl.camp.it.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import pl.camp.it.rest.client.api.ApiApi;
import pl.camp.it.rest.client.api.model.*;
import pl.camp.it.rest.client.api.model.Book;
import pl.camp.it.rest.client.api.model.User;
import pl.camp.it.rest.client.api.model.UserRequest;

import java.util.Optional;

public class SwaggerApiClient implements ApiApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ApiApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> deleteBook(Integer id) {
        return ApiApi.super.deleteBook(id);
    }

    @Override
    public ResponseEntity<Book> getBookById(Integer id) {
        return ApiApi.super.getBookById(id);
    }

    @Override
    public ResponseEntity<BookListResponse> getBooks(String pattern) {
        return ApiApi.super.getBooks(pattern);
    }

    @Override
    public ResponseEntity<OrderPositionResponseDTO> getById(Integer id) {
        return ApiApi.super.getById(id);
    }

    @Override
    public ResponseEntity<User> getByLogin(String loginOrId) {
        return ApiApi.super.getByLogin(loginOrId);
    }

    @Override
    public ResponseEntity<OrderPositionListResponse> getByOrderId(Integer orderId) {
        return ApiApi.super.getByOrderId(orderId);
    }

    @Override
    public ResponseEntity<OrderDTO> getOrderById(Integer id) {
        return ApiApi.super.getOrderById(id);
    }

    @Override
    public ResponseEntity<OrderListResponse> getOrdersByUserId(Integer userId) {
        return ApiApi.super.getOrdersByUserId(userId);
    }

    @Override
    public ResponseEntity<Book> saveBook(Book book) {
        return ApiApi.super.saveBook(book);
    }

    @Override
    public ResponseEntity<OrderDTO> saveOrder(SaveOrderRequest saveOrderRequest) {
        return ApiApi.super.saveOrder(saveOrderRequest);
    }

    @Override
    public ResponseEntity<User> saveUser(UserRequest userRequest) {
        return ApiApi.super.saveUser(userRequest);
    }

    @Override
    public ResponseEntity<User> test1() {
        return ApiApi.super.test1();
    }

    @Override
    public ResponseEntity<Book> test2(String param, Integer a, String header1, String header2, User user) {
        return ApiApi.super.test2(param, a, header1, header2, user);
    }

    @Override
    public ResponseEntity<Book> test3() {
        return ApiApi.super.test3();
    }

    @Override
    public ResponseEntity<Book> updateBook(Integer id, Book book) {
        return ApiApi.super.updateBook(id, book);
    }
}
