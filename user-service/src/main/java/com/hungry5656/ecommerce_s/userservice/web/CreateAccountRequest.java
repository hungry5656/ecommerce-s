package com.hungry5656.ecommerce_s.userservice.web;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest {

    @NotBlank
    @Size(max = 32, message = "userName should be within 32 characters")
    private String userName;

    @NotBlank
    @Size(min = 8, max = 32, message = "password should be between 8 and 32 characters")
    private String password;

    @NotBlank
    @Size(max = 32, message = "firstName should be within 32 characters")
    private String firstName;

    @NotBlank
    @Size(max = 32, message = "lastName should be within 32 characters")
    private String lastName;

    @NotBlank
    @Size(max = 32, message = "email should be within 32 characters")
    @Email
    private String email;
}
