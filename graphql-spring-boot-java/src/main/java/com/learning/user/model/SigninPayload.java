package com.learning.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

/**
 * Author: Nitin Gupta
 * Date: 12/12/19
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SigninPayload {
    private UUID token;
    private User user;
}
