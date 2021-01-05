package com.languageLearning.LangLearning.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

@Service
public class EmailService {

    @Autowired
   private JavaMailSender javaMailSender;

    public void sendEmail( String emailul, String textul) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("sebastianmarius2100@gmail.com");

        msg.setSubject(emailul);
        msg.setText(textul);

        javaMailSender.send(msg);

    }

}
