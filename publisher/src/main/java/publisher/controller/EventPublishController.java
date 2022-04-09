package publisher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import publisher.service.EventPublisher;

@RestController
public class EventPublishController {

    private final EventPublisher eventPublisher;

    public EventPublishController(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    /**
     * Get method is preferred to be able to call the endpoint from the browser.
     * The message can be written as a request parameter.
     *
     * @param message
     */
    @GetMapping
    public void publishEvent(@RequestParam String message) {
        eventPublisher.send(message);
    }
}
