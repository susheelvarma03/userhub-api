package com.example.userapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    @NotBlank(message= "name is required")
    private String name;

    @Email(message= "Email is invalid")
    private String email;

    @NotBlank(message ="Password is required")
    private String password;
}
