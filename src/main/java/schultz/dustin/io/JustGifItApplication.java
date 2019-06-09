package schultz.dustin.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;

@SpringBootApplication(exclude = { JacksonAutoConfiguration.class, JmxAutoConfiguration
		.class/*, WebSocketAutoConfiguration.class */})
public class JustGifItApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustGifItApplication.class, args);
	}

}
