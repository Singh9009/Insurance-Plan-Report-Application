package in.prashant.utils;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {

	@Autowired
	private JavaMailSender mailSender;
	
	
	public boolean sendMail(String subject, String body, String to, File f)
	{
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setSubject(subject);
			messageHelper.setText(body, true);
			messageHelper.setTo(to);
			messageHelper.addAttachment("Plan Info", f);
			mailSender.send(mimeMessage);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
}
