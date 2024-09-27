package com.example.UserService.service;

import com.example.UserService.repository.NotificationPreferenceRepository;
import com.example.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NotificationPreferenceRepository preferenceRepository;

    public String getUserDetails(Long id) {
        String jsonString = "{\"userId\":1,\"firstName\":\"Joe\",\"lastName\":\"Goldberg\",\"email\":\"lkneerukonda@gmail.com\",\"mobile\":\"+14697740075\",\"userPreferences\":{\"disableAllNotifications\":false,\"criticalNotificationOnly\":true,\"notificationPreferences\":[{\"category\":\"ACCOUNT_LOCKED\",\"smsEnabled\":true,\"appEnabled\":false,\"emailEnabled\":false},{\"category\":\"PASSWORD_UPDATE\",\"smsEnabled\":true,\"appEnabled\":false,\"emailEnabled\":true},{\"category\":\"LOCATION_CHANGE\",\"smsEnabled\":false,\"appEnabled\":false,\"emailEnabled\":true}]}}";
        return jsonString;
    }
}
