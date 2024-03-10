package com.example.apiping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping(method = RequestMethod.GET, path = "/api/ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("pong");
    }

}

