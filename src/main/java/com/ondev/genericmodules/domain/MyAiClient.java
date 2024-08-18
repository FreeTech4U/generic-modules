package com.ondev.genericmodules.domain;

import org.springframework.ai.client.AiClient;
import org.springframework.ai.client.AiResponse;
import org.springframework.ai.prompt.Prompt;

public interface MyAiClient extends AiClient {
    default String generate(String message) {
        return """
                default implementation of generate method in AiClient interface""";
    }

    AiResponse generate(Prompt prompt);
}