package com.languageLearning.LangLearning.Controller;

import com.languageLearning.LangLearning.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;

@RestController
public class SendEmailController {

    @Autowired
    EmailService emailService;



    @GetMapping("/sendemail")
    @ResponseBody
    public String send(@RequestParam String email, @RequestParam String textul) throws AddressException, MessagingException, IOException {
        //sendEmail();



        emailService.sendEmail(email, textul);
        return "Email sent successfully";
    }
}