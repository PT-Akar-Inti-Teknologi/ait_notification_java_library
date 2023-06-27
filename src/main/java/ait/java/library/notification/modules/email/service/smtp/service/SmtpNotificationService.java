package ait.java.library.notification.modules.email.service.smtp.service;

import ait.java.library.notification.modules.email.service.EmailNotificationService;
import ait.java.library.notification.modules.email.service.smtp.dto.SmtpSendEmailReq;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("smtpNotification")
@ConditionalOnProperty(prefix = "notification", name = "service")
public class SmtpNotificationService implements EmailNotificationService {

  @Autowired private JavaMailSender javaMailSender;
  @Value("${spring.mail.username}") private String sender;

  public String sendEmail(SmtpSendEmailReq regMsg) {
    try {

      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom(sender);
      message.setReplyTo(regMsg.getTo());
      message.setSentDate(new Date());
      message.setSubject(regMsg.getSubject());
      message.setText(regMsg.getText());
      javaMailSender.send(message);

      return "Email sent Successfully";
    } catch (Exception e) {
      return "Error while sending Mail";
    }
  }

  @Override
  public String sendEmail(String message) {
    return null;
  }
}
