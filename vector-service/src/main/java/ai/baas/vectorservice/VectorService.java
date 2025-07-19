package ai.baas.vectorservice;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class VectorService {
    private final WebClient qdrantClient = WebClient.create("http://localhost:6333");

    public String searchVector(String queryVector) {
        return qdrantClient.post()
                .uri("/collections/default/search")
                .bodyValue(queryVector)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
} 