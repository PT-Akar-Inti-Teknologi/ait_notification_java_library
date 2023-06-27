package ait.java.library.notification.modules.email.service.sendinblue.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SibSendEmailReq {

  private String to;
  private String subject;
  private String text;

}
