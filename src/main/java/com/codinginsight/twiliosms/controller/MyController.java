package com.codinginsight.twiliosms.controller;

import com.codinginsight.twiliosms.services.MyService;
import com.codinginsight.twiliosms.twilio.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping
    public void sendSms(@RequestBody SmsRequest smsRequest){
        myService.sendSms(smsRequest);
    }
}
