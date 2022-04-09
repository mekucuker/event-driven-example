# Event-driven Example

This project is a basic example of event-driven architecture. In this project, a given message is published by a service and consumed by another. RabbitMQ used as the message broker.

1. Run RabbitMQ by using docker-compose up command on the project root directory. Queue configurations will be done at the startup.
2. Run publisher and consumer Spring Boot projects separately. The publisher runs on port 8080 with context path "/publisher", and the consumer runs on port 8081.
3. Type the message as query parameter (with "message" keyword) at the end of the url "localhost:8080/publisher" on the browser. Also, the EventPublisherTest class can be used to publish a message.
4. The consumed message will appear in the consumer service logs.

<b>Mehmet Emin Küçüker</b>, Software Engineer, [Linkedin](https://linkedin.com/in/mehmeteminkucuker)
