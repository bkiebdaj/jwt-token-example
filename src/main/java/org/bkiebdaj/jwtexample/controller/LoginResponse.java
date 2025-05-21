package org.bkiebdaj.jwtexample.controller;

public record LoginResponse(String token, long expiresIn) {
}
