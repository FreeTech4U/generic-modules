package com.ondev.genericmodules.service.impl;

import com.ondev.genericmodules.domain.MyAiClient;
import com.ondev.genericmodules.service.PoetryService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.client.AiClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoetryServiceImpl implements PoetryService {
    public static final String WRITE_ME_HAIKU_ABOUT_CAT = """
        Write me Haiku about cat,
        haiku should start with the word cat obligatory""";

    private final AiClient aiClient;

    // constructor

    @Override
    public String getCatHaiku() {
        return aiClient.generate(WRITE_ME_HAIKU_ABOUT_CAT);
    }
}