package io.matoshri.security.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SecurtyController {
    @GetMapping("/login")
    public String login() {
       log.info("=== SecurityController:login() called");
        return "Success";
    }
}
