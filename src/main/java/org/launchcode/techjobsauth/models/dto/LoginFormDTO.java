package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {

    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid Username. Must be between 3 and 20 characters.")
    private String username;

    @NotBlank
    @Size(min = 5, max = 20, message = "Invalid Password. Must be between 5 and 20 characters")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
