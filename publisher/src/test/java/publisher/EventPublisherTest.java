package publisher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import publisher.service.EventPublisher;

@SpringBootTest
class EventPublisherTest {

    @Autowired
    private EventPublisher eventPublisher;

    @Test
    void publishEvent() {
        eventPublisher.send("Test message!");
    }
}
