package org.bkiebdaj.jwtexample.dto;

public record RegisterUserDto(
        String email,
        String password,
        String fullName
) {
}
