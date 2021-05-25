// package com.redhat.banestes.amq.springbootclient.service;

// import org.apache.activemq.ActiveMQConnectionFactory;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jms.annotation.EnableJms;
// import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
// import org.springframework.jms.support.converter.MessageConverter;
// import org.springframework.jms.support.converter.MessageType;
// // import org.springframework.amqp.core.AmqpTemplate;
// // amqpTemplate.convertAndSend("javainuseExchange", "javainuse", emp);

// @Configuration
// public class JmsConfig {

//     @Value("${app.springboot.queue}")
//     private String brokerUrl;
//     @Value("${app.springboot.user}")
//     private String brokerUser;
//     @Value("${app.springboot.password}")
//     private String brokerPassword;

//     @Bean
//     public ActiveMQConnectionFactory activeMQConnectionFactory() {
//         ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
//         activeMQConnectionFactory.setBrokerURL(brokerUrl);
//         activeMQConnectionFactory.setUserName(brokerUser);
//         activeMQConnectionFactory.setPassword(brokerPassword);
//         return activeMQConnectionFactory;
//     }

 // Only required due to defining myFactory in the receiver
//  @Bean
//  public JmsListenerContainerFactory<?> myFactory(
//      ConnectionFactory connectionFactory,
//      DefaultJmsListenerContainerFactoryConfigurer configurer) {
//    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//    configurer.configure(factory, connectionFactory);
//    return factory;
//  }

//     // @Bean
//     // public MessageConverter jacksonJmsMessageConverter() {
//     //     MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//     //     // converter.setTargetType(MessageType.TEXT);
//     //     // converter.setTypeIdPropertyName("_type");
//     //     return converter;
//     // }

// }
