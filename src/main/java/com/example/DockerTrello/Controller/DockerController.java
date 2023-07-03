package com.example.DockerTrello.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class DockerController {
    @GetMapping
    public String hello() {
        return "Hello Tech Tribe";
    }
}