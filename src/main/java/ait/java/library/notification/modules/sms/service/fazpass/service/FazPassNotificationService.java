package ait.java.library.notification.modules.sms.service.fazpass.service;

import ait.java.library.notification.modules.sms.service.SmsNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("fazpassNotification")
@ConditionalOnProperty(prefix = "notification", name = "service")
public class FazPassNotificationService implements SmsNotificationService {

  @Override
  public String sendSms(String message) {
    return null;
  }
}
