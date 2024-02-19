package bg.aspar.example.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.aspar.example.service.dto.MessageDTO;


@RestController
@RequestMapping("/api")
public class HelloResource {

    @GetMapping("/hello")
    public ResponseEntity<MessageDTO> getHelloMessage() {
//        log.debug("REST request to get Hello message: ", message);
        return ResponseEntity.ok()
//        		.headers(headers)
        		.body(new MessageDTO("Hello World!"));
    }
}
