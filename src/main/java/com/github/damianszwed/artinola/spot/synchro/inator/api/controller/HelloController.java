package com.github.damianszwed.artinola.spot.synchro.inator.api.controller;

import com.github.damianszwed.artinola.spot.synchro.inator.api.HelloApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

    @Override
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!");
    }
}
