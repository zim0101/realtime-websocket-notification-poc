package com.app.realtimesocketionotificationpoc.service;

import com.app.realtimesocketionotificationpoc.model.Account;
import com.app.realtimesocketionotificationpoc.model.NotificationHistory;
import com.app.realtimesocketionotificationpoc.model.enums.NotificationType;
import com.app.realtimesocketionotificationpoc.repository.NotificationHistoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NotificationHistoryService {
    private final NotificationHistoryRepository notificationHistoryRepository;
    private final NotificationSocketHandler notificationSocketHandler;

    public NotificationHistoryService(NotificationHistoryRepository notificationHistoryRepository,
                                      NotificationSocketHandler notificationSocketHandler) {
        this.notificationHistoryRepository = notificationHistoryRepository;
        this.notificationSocketHandler = notificationSocketHandler;
    }

    @Transactional
    public void saveAndSendUserRegistrationNotificationToAdmin(List<Account> adminList, Account newUser) {
        adminList.forEach(admin -> {
            NotificationHistory notification = new NotificationHistory();
            notification.setAccount(admin);
            notification.setNotificationType(NotificationType.USER_REGISTRATION);
            notification.setMessage(newUser.getFullName() + " has registered in our app.");
            notificationSocketHandler.sendNotificationToUser(admin.getUsername(), notification);

            notificationHistoryRepository.save(notification);
        });
    }
}