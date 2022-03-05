package com.mnbk.microservice.user;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

/**
 * Stores information to identify the user.
 * */

public class User {
    private Long id;
    private String name;
}
