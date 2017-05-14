package io.github.sskorol.model;

import lombok.Data;

@Data
@SuppressWarnings("JavadocType")
public class User {
    private final String username;
    private final String password;
}
