package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestOperations;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc

public class Assignment1v2Application<Public> {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1v2Application.class, args);
    }

    Public RestTemplate;
    RestOperations restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
