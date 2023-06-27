package ait.java.library.notification.modules.email.config;

import ait.java.library.notification.modules.email.service.sendinblue.service.SibNotificationService;
import ait.java.library.notification.modules.email.service.EmailNotificationService;
import ait.java.library.notification.modules.email.service.smtp.service.SmtpNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

  @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "smtp")
  @Bean(name = "smtpNotification")
  public EmailNotificationService smtpNotificationService(){
    return new SmtpNotificationService();
  }

  @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "sib")
  @Bean(name = "sibNotification")
  public EmailNotificationService sibNotificationService(){
    return new SibNotificationService();
  }

}
