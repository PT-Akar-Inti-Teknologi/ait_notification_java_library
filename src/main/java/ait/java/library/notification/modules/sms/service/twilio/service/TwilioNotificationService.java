package ait.java.library.notification.modules.sms.service.twilio.service;

import ait.java.library.notification.modules.sms.service.SmsNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("twilioNotification")
@ConditionalOnProperty(prefix = "notification", name = "service")
public class TwilioNotificationService implements SmsNotificationService {

  @Override
  public String sendSms(String message) {
    return null;
  }
}
