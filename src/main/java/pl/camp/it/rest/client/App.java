package pl.camp.it.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        /************ GET ************/
        /*String uri = "http://localhost:8080/api/v1/user/1";
        User user = restTemplate.getForObject(uri, User.class);

        System.out.println(user);*/

        /****************** POST ****************/
        /*String uri2 = "http://localhost:8080/api/v1/user";


        UserRequest userRequest = new UserRequest(0, "szymon", "szymon123",
                "Szymon", "Jakis",
                "szymon@gmail.com", User.Role.USER);

        User user = restTemplate.postForObject(uri2, userRequest, User.class);
        System.out.println(user);*/
        /******************** EXCHANGE ****************/

        /*String uri3 = "http://localhost:8080/api/test2/{param}";
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("param", "wartosc1");

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(uri3)
                .queryParam("a", 10)
                .build();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("header1", "naglowek 1");
        httpHeaders.add("header2", "naglowek 2");

        User user = new User(123, "login", "imie",
                "nazwisko", User.Role.ADMIN);

        HttpEntity<User> request = new HttpEntity<>(user, httpHeaders);

        ResponseEntity<Book> response = restTemplate.exchange(uriComponents.toUriString(),
                HttpMethod.POST,
                request,
                Book.class,
                pathVariables);

        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusCode().value());
        HttpHeaders headers = response.getHeaders();
        for(Map.Entry<String, List<String>> header : headers.entrySet()) {
            System.out.println(header.getKey() + " - " + header.getValue());
        }

        Book book = response.getBody();
        System.out.println("Body:");
        System.out.println(book);*/

        /*********************** Client class *********************/

        User user = new User(123, "login", "imie",
                "nazwisko", User.Role.ADMIN);

        ApiClient apiClient = new ApiClient();
        Book book = apiClient.postBook("param", 1002, "h1", "h2", user);
        System.out.println(book);
    }
}
