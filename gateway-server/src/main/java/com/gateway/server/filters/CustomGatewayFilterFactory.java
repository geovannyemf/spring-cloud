package com.gateway.server.filters;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.OrderedGatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class CustomGatewayFilterFactory extends AbstractGatewayFilterFactory<CustomGatewayFilterFactory.Configuration> {

	private final Logger logger = LoggerFactory.getLogger(CustomGatewayFilterFactory.class);
	
	public CustomGatewayFilterFactory() {
		super(Configuration.class);
	}

	@Override
	public GatewayFilter apply(Configuration config) {
		return new OrderedGatewayFilter((exchange, chain) -> {
			logger.info("Executing PRE gateway filter factory: "+config.message);
			return chain.filter(exchange).then(Mono.fromRunnable(()-> {
				Optional.ofNullable(config.cookieValue).ifPresent(cookie->{
					exchange.getResponse().getCookies().add(config.cookieName, ResponseCookie.from(config.cookieName, cookie).build());
				});
				logger.info("Executing POST gateway filter factory: "+config.message);
			}));
		},2);
	}
	
	
	
	@Override
	public List<String> shortcutFieldOrder() {
		return Arrays.asList("message","cookieName","cookieValue");
	}



	@Override
	public String name() {
		return "Custom";
	}

	public static class Configuration {
		private String message;
		private String cookieValue;
		private String cookieName;
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getCookieValue() {
			return cookieValue;
		}
		public void setCookieValue(String cookieValue) {
			this.cookieValue = cookieValue;
		}
		public String getCookieName() {
			return cookieName;
		}
		public void setCookieName(String cookieName) {
			this.cookieName = cookieName;
		}
		
	}

}
