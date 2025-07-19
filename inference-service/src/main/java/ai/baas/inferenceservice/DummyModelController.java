package ai.baas.inferenceservice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/model")
@Tag(name = "Dummy Model", description = "Dummy AI model endpoints. Replace with your own model.")
public class DummyModelController {

    /**
     * Dummy AI model endpoint. Replace this with your own model logic.
     * Example: POST /api/model/predict { "input": "hello" }
     */
    @Operation(
        summary = "Dummy prediction endpoint",
        description = "Returns a dummy prediction. Replace with your own model logic.",
        requestBody = @RequestBody(
            required = true,
            content = @Content(schema = @Schema(implementation = PredictionRequest.class))
        ),
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Dummy prediction response",
                content = @Content(schema = @Schema(implementation = PredictionResponse.class))
            )
        }
    )
    @PostMapping("/predict")
    public PredictionResponse predict(@org.springframework.web.bind.annotation.RequestBody PredictionRequest request) {
        // Dummy logic: echo the input and return a fake prediction
        String prediction = "You sent: " + request.getInput() + ". This is a dummy prediction.";
        return new PredictionResponse(prediction);
    }

    public static class PredictionRequest {
        private String input;
        public String getInput() { return input; }
        public void setInput(String input) { this.input = input; }
    }

    public static class PredictionResponse {
        private String prediction;
        public PredictionResponse(String prediction) { this.prediction = prediction; }
        public String getPrediction() { return prediction; }
        public void setPrediction(String prediction) { this.prediction = prediction; }
    }
} 