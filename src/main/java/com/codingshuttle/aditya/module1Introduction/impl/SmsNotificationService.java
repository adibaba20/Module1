package com.codingshuttle.aditya.module1Introduction.impl;


import com.codingshuttle.aditya.module1Introduction.NotificationService;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending...."+message);
    }
}
