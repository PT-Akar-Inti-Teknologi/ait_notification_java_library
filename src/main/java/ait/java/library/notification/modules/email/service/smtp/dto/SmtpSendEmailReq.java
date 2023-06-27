package ait.java.library.notification.modules.email.service.smtp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SmtpSendEmailReq {

  private String to;
  private String subject;
  private String text;

}
