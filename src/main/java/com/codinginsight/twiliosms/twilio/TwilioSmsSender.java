package com.codinginsight.twiliosms.twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
@Slf4j
public class TwilioSmsSender implements SmsSender {

    @Autowired
    public TwilioConfiguration twilioConfiguration;

    @Override
    public void sendSms(SmsRequest smsRequest) {

        PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
        log.info("To Phone Number - {}", to);
        PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
        log.info("To Phone Number - {}", from);
        MessageCreator creator = Message.creator(
                to,
                from,
                smsRequest.getMessage()
        );
        creator.create();
    }

}
