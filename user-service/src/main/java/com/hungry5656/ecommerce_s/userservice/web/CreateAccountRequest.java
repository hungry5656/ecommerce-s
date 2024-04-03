package com.hungry5656.ecommerce_s.userservice.web;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
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
    /*TODO: @Pattern(regexp = "",message="msg")*/
    @Size(max = 32, message = "userName should be within 32 characters")
    private String userName;

    @NotBlank
    /*TODO: @Pattern(regexp = "",message="msg")*/
    @Size(min = 8, max = 32, message = "password should be between 8 and 32 characters")
    private String password;

    @NotBlank
    @Size(max = 32, message = "firstName should be within 32 characters")
    private String firstName;

    @NotBlank
    @Size(max = 32, message = "lastName should be within 32 characters")
    private String lastName;

    @NotBlank
    /*TODO: @Pattern(regexp = "",message="msg")*/
    @Size(max = 32, message = "email should be within 32 characters")
    @Email
    private String email;

    @NotBlank
    @Min(1)
    @Max(1)
    private Boolean businessFlag;
}
