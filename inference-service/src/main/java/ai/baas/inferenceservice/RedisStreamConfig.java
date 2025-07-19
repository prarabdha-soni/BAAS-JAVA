package ai.baas.inferenceservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.stream.ReadOffset;
import org.springframework.data.redis.stream.StreamListener;
import org.springframework.data.redis.stream.StreamMessageListenerContainer;

@Configuration
public class RedisStreamConfig {
    // Custom Redis Stream listener configuration goes here
} 