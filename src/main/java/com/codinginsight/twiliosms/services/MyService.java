package com.codinginsight.twiliosms.services;

import com.codinginsight.twiliosms.twilio.SmsRequest;
import com.codinginsight.twiliosms.twilio.SmsSender;
import com.codinginsight.twiliosms.twilio.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final SmsSender twilioSmsSender;

    @Autowired
    public MyService(@Qualifier("twilio") TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest){
        twilioSmsSender.sendSms(smsRequest);
    }
}
