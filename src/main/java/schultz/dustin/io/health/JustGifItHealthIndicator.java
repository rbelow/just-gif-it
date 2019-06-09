package schultz.dustin.io.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.justgifit.JustGifItProperties;

@Component
public class JustGifItHealthIndicator implements HealthIndicator {

	private JustGifItProperties properties;
	
	@Override
	public Health health() {
		if (!properties.getGifLocation().canWrite()) {
			return Health.down().build();
		}
		
		return Health.up().build();
	}
}
