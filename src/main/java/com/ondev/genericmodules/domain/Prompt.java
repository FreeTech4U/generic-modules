package com.ondev.genericmodules.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Prompt {
    private final List<Message> messages;
}