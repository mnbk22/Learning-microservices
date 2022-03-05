package com.mnbk.microservice.challenge;

import lombok.*;
import com.mnbk.microservice.user.User;
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

/**
 * Identifies the attempt from a {@link User} to solve a challenge.
 * */

public class ChallengeAttempt {
    private Long id;
    private Long userID;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
