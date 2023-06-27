package ait.java.library.notification.modules.email.service.sendinblue.service;

import ait.java.library.notification.modules.email.service.EmailNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("sibNotification")
@ConditionalOnProperty(prefix = "notification", name = "service")
public class SibNotificationService implements EmailNotificationService {

  @Override
  public String sendEmail(String message) {
    return null;
  }
}
