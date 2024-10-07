package com.example.UserService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "notification_preferences")
public class NotificationPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "notification_category")
    private String notificationCategory;
    @Column(name = "sms_enabled")
    private boolean smsEnabled;
    @Column(name = "app_enabled")
    private boolean appEnabled;
    @Column(name = "email_enabled")
    private boolean emailEnabled;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
