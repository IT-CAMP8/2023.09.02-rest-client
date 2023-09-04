package pl.camp.it.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

public class ApiClient {

    RestTemplate restTemplate = new RestTemplate();

    public Book postBook(String pathParam, int queryParam, String h1, String h2, User user) {
        String uri3 = "http://localhost:8080/api/test2/{param}";
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("param", pathParam);

        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(uri3)
                .queryParam("a", queryParam)
                .build();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("header1", h1);
        httpHeaders.add("header2", h2);

        HttpEntity<User> request = new HttpEntity<>(user, httpHeaders);

        ResponseEntity<Book> response = this.restTemplate.exchange(uriComponents.toUriString(),
                HttpMethod.POST,
                request,
                Book.class,
                pathVariables);

        if(response.getStatusCode().value() != 200) {
            return null;
        }

        return response.getBody();
    }
}
