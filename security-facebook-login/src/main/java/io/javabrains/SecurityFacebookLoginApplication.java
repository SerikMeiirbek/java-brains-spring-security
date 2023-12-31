package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityFacebookLoginApplication.class, args);
	}

}
