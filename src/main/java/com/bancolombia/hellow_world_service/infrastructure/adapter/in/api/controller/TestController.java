package com.bancolombia.hellow_world_service.infrastructure.adapter.in.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {

    @Value("${server.port}")
    private String port;
    
    @GetMapping("")
    public ResponseEntity<String> test() throws UnknownHostException{
        String hostName = InetAddress.getLocalHost().getHostName();
        return ResponseEntity.ok(String.format("Hello World from %s on port %s!", hostName, port));
    }
    
}
