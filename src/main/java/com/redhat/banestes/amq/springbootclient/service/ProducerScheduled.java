// package com.redhat.banestes.amq.springbootclient.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.jms.core.JmsTemplate;
// import org.springframework.messaging.handler.annotation.SendTo;
// import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Component;

// import lombok.extern.slf4j.Slf4j;

// import java.time.Duration;
// import java.time.Instant;
// import java.time.LocalDateTime;

// import javax.annotation.PostConstruct;

// @Component
// @Slf4j
// public class ProducerScheduled {

//     @Autowired
//     private ProducerService produceService;

//     @Value("${app.springboot.queue}")
//     private String destination;

//     @Scheduled(fixedRate = 3000)
//     public void sendMsg() {
//         produceService.sendTo(destination, " ## Msg Agendada ");
//     }

//     @PostConstruct
//     public void sendMsgPostConstruct() {

//         Instant start = Instant.now();
//         log.info(" ## Enviar 20.000 -> {}", LocalDateTime.now().toString());
//         for(int i = 0; i < 2000; i++){
//             produceService.sendTo(destination, " ## Msg Enviado #" + i);
//         }
//         Instant finish = Instant.now();
//         long timeElapsed = Duration.between(start, finish).toMillis();
//         log.info(" ## Tempo para enviar msgs :: {}s", timeElapsed/1000);
        
//     }

// }
