package ai.baas.inferenceservice;

import org.springframework.web.bind.annotation.*;
import baas.service.InferenceService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inference")
@RequiredArgsConstructor
public class InferenceController {

    private final InferenceService inferenceService;

    @PostMapping("/prompt")
    public String handlePrompt(@RequestBody String prompt) {
        return inferenceService.processPrompt(prompt);
    }
} 