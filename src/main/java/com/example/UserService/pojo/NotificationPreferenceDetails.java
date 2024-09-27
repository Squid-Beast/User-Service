package com.example.UserService.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPreferenceDetails {
    private String notificationCategory;
    private boolean smsEnabled;
    private boolean appEnabled;
    private boolean emailEnabled;
}
