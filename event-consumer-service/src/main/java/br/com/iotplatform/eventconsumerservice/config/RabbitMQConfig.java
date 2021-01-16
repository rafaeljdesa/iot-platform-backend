package br.com.iotplatform.eventconsumerservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.exchangeName}")
    private String EXCHANGE_NAME;

    @Value("${rabbitmq.queueName}")
    private String QUEUE_NAME;

    @Value("${rabbitmq.routingKeyName}")
    private String ROUTING_KEY_NAME;

    @Value("${rabbitmq.hostName}")
    private String HOST_NAME;

    @Value("${rabbitmq.userName}")
    private String USER_NAME;

    @Value("${rabbitmq.password}")
    private String PASSWORD;

    @Bean
    Queue queue() {
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_NAME);
    }

    @Bean
    ConnectionFactory connectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(HOST_NAME);
        cachingConnectionFactory.setUsername(USER_NAME);
        cachingConnectionFactory.setPassword(PASSWORD);
        return cachingConnectionFactory;
    }

}
