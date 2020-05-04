package com.tindao.cobranca2;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class Cobranca2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cobranca2Application.class, args);
	}
	
	@Bean
	public LocaleResolver localResolver()
	{
		return (new FixedLocaleResolver(new Locale("pt", "BR")));
	}
}
