package com.cintiaschutt.designpatterns.strategy.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}