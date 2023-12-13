package com.lashewi.springbootboilerplate.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ExceptionMessageAccessor {

	private final MessageSource messageSource;

	ExceptionMessageAccessor(@Qualifier("exceptionMessageSource") MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessage(Locale locale, String key, Object... parameter) {
		return messageSource.getMessage(key, parameter, locale);
	}

}
