package com.codinginsight.twiliosms.twilio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequest {





     @JsonProperty("phoneNumber")
     private String phoneNumber;
     @JsonProperty("message")
     private String message;
}
