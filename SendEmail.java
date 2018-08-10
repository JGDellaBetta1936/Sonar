package com.jg.eval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.log4j.Logger;

public class SendEmail {
	static Logger log = Logger.getLogger(SendEmail.class.getName());

	public static void main(String[] args) throws MessagingException, URISyntaxException, IOException {

		SendEmail localSE = new SendEmail();
		// Sender's email ID needs to be mentioned
		String from = "timward@gmail.com";

		// Assuming you are sending email from localhost
		String host = "smtp.comcast.net";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);
		Session session = Session.getDefaultInstance(properties);
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		java.util.Properties props = System.getProperties();
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.enable", true);
		props.put("mail.smtp.auth", "true");
		session = Session.getDefaultInstance(props, null);
		String rtnValues = localSE.buildListToSend();
		StringTokenizer localST = new StringTokenizer(rtnValues, ",");
		log.info("Started -->" + localSE.getCurrentDt() );
		while (localST.hasMoreElements()) {
			String tempValue = localST.nextToken();
			log.debug(tempValue);
			try {
				Transport transport = session.getTransport("smtp");
				message = new MimeMessage(session);
				InternetAddress[] toAddress = InternetAddress.parse(tempValue);
				message.setFrom(new InternetAddress("kshukla@quantumworld.us"));
				message.setRecipients(Message.RecipientType.TO, toAddress);
				message.setSubject("Good Morning and best to new!  New engineers for you");
				//message.setText("Hi, this is a wonderful new opportunity for you in your current location of BFE.\nHope to hear from you so we can discuss the possible role.\n Thank you!  Oh yeah, sucks to get tons of spam mail....");
				message.setText("Hello, we have a new and improved list of consultatants available to join your project!  Please contact me for further info.");
				message.setSentDate(new java.util.Date()); 
				transport.connect("smtp.comcast.net", "john_gold@comcast.net", new String("DellaBetta1936"));
				message.saveChanges();
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
				log.debug("sent to " + tempValue + ".");
			} catch (Exception e) {
				log.error("Caught exception when attempting send.", e);

			}
		}
		log.info("Ended -->" +  localSE.getCurrentDt() );

	}

	public String buildListToSend() throws URISyntaxException {
		StringBuilder sb = new StringBuilder();
		File testf = new File(this.getClass().getResource("/hitThese.txt").toURI());
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(testf);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
				sb.append(",");
				log.info(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
	
	public String getCurrentDt() {
		Calendar rtnCal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		return sdf.format(rtnCal.getTime());
	}

}
