package ai.baas.inferenceservice;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class InferenceService {

    private final WebClient webClient = WebClient.create("http://localhost:5001"); // Proxy to OpenAI/gRPC

    public String processPrompt(String prompt) {
        return webClient.post()
                .uri("/v1/ai")
                .bodyValue(prompt)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
} 