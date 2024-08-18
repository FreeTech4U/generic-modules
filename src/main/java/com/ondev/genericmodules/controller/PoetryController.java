package com.ondev.genericmodules.controller;

import com.ondev.genericmodules.service.PoetryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
@RequiredArgsConstructor
public class PoetryController {
    private final PoetryService poetryService;

    @GetMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku(){
        return ResponseEntity.ok(poetryService.getCatHaiku());
    }
}