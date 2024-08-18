package com.ondev.genericmodules.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class AiResponse {
    private final List<Generation> generations;
}