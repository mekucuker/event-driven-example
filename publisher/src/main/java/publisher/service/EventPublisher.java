package publisher.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    @Value("${exchange}")
    private String exchange;

    @Value("${routing.key}")
    private String routingKey;

    private RabbitTemplate rabbitTemplate;

    public EventPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Publishes the given message to the specified queue.
     *
     * @param message
     */
    public void send(String message) {
        this.rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
