package io.desofme.authservice.dto.request;

import lombok.Data;

@Data
public class AppUserRequest {
    private String username;
    private String password;
}
