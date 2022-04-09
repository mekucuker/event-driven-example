package consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    private final Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    /**
     * Consumes the message from the specified queue.
     *
     * @param message
     */
    @RabbitListener(queues = "${event.driven.example.queue}")
    public void consume(String message) {
        logger.info("Consumed Message From The Queue: {}", message);
    }
}
