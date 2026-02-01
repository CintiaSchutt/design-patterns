package com.cintiaschutt.designpatterns.strategy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cintiaschutt.designpatterns.strategy.service.NotificationStrategy;

public class WhatsappNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(WhatsappNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notification [{}] sent to Whatsapp [{}]", message, destination);
    }
}
