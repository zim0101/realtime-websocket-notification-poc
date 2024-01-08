package com.app.realtimewebsocketnotificationpoc.model;

import com.app.realtimewebsocketnotificationpoc.model.enums.NotificationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationHistory implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @NotNull
    private NotificationType notificationType;

    @ManyToOne
    private Account account;

    @NotNull
    private String message;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}