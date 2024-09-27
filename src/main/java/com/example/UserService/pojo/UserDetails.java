package com.example.UserService.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private UserPreferenceDetails userPreferenceDetails;
}
