package com.example.demo;

public interface MailService {

    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to,String subject,String content,String filepath);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
