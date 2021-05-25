package com.redhat.banestes.amq.springbootclient.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

import com.redhat.banestes.amq.springbootclient.service.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("producer")
@Slf4j
public class ProducerController {

    @Autowired
    private ProducerService produceService;

    @Value("${app.springboot.queue}")
    private String destination;

    @GetMapping("/send-message/{message}")
    public String sendMessage(@PathVariable String message) {
        produceService.sendTo(destination, message);
        return "success";
    }

    @GetMapping("/send-message-batch/{totalMessages}")
    public String sendMessageBatch(@PathVariable Integer totalMessages) {
        sendMsgPostConstruct(totalMessages);
        return "success";
    }

    public void sendMsgPostConstruct(Integer totalMessages) {

        Instant start = Instant.now();
        log.info(" ## Enviar {} -> {}", totalMessages, LocalDateTime.now().toString());
        for(int i = 0; i < totalMessages; i++){
            produceService.sendTo(destination, "Mensagem #" + i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info(" ## Tempo para enviar msgs :: {}s", timeElapsed/1000);
        
    }
}
