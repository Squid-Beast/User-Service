package com.example.UserService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@Table(name = "user_details")
public class UserPreference {
    @Column(name = "disable_all_notifications")
    private boolean disableAllNotifications;
    @Column(name = "critical_notifications")
    private boolean criticalNotificationOnly;
}
