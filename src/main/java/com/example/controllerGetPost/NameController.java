package com.example.controllerGetPost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @GetMapping("/yourName")
    public String returnName (@RequestParam String name) {
        return name;
    }
    @PostMapping("yourReverseName")
    public String returnReverseName (@RequestParam String name) {
        StringBuilder buildName = new StringBuilder(name);
        String reverseName = buildName.reverse().toString();
        return reverseName;
    }
}
