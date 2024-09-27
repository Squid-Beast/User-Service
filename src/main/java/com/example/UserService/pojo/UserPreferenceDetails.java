package com.example.UserService.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPreferenceDetails {
    private boolean disableAllNotifications;
    private boolean criticalNotificationOnly;
    private List<NotificationPreferenceDetails> notificationPreferenceDetails;
}
