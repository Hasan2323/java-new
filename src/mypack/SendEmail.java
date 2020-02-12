package mypack;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail
{
    public static void main(String [] args){

        final String username = "emarketplace2@gmail.com";
        final String password = "sanisifat";
        String name = "Ashik";

        String to   = "saimon.ctg@gmail.com";
        String from = "emarketplace2@gmail.com";
        //String host = "localhost";

        //Get the session object
        Properties prop = System.getProperties();
        //prop.setProperty("mail.smtp.host", host);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //Session session = Session.getDefaultInstance(prop);

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Welcome "+name);
            message.setText("Hi, this is example of sending email. lorum ipsum lorem ipsum lorem ipsum lorem ipsum" +
                    "THis is the second line of code" +
                    "and this is the third line of code. " +
                    "Thank you very much for your concern!");

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}
    }
}  