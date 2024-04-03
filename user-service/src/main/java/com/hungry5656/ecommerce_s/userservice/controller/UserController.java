package com.hungry5656.ecommerce_s.userservice.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-24
 */
@RestController
@CrossOrigin
public class UserController {

    @PostMapping("/user")
    // TODO: set the admin permission
    public ResponseEntity<?> createUser() {

        // TODO: call create User Service

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
