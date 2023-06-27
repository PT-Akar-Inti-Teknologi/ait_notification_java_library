package ait.java.library.notification.modules.sms.config;

import ait.java.library.notification.modules.sms.service.fazpass.service.FazPassNotificationService;
import ait.java.library.notification.modules.sms.service.SmsNotificationService;
import ait.java.library.notification.modules.sms.service.twilio.service.TwilioNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {

  @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "fazpass")
  @Bean(name = "fazpassNotification")
  public SmsNotificationService fazPassNotificationService(){
    return new FazPassNotificationService();
  }

  @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "twilio")
  @Bean(name = "twilioNotification")
  public SmsNotificationService twilioNotificationService(){
    return new TwilioNotificationService();
  }

}
