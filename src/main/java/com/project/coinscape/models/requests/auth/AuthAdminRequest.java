package com.project.coinscape.models.requests.auth;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AuthAdminRequest {
    @NotBlank(message = "email is required")
    @Email(message = "invalid email")
    private String email;
    private String password;
    private String name;
    private String mobilePhone;
}
