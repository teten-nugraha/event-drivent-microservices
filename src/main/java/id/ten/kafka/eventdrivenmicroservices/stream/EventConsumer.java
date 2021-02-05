package id.ten.kafka.eventdrivenmicroservices.stream;

import id.ten.kafka.eventdrivenmicroservices.payload.Message;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
public class EventConsumer {

    @StreamListener(EventStream.INBOUND)
    public void consumeEvent(@Payload Message msg) {
        System.out.println("Inbound message--> id: " + msg.getId() + " name: " + msg.getName() + " Actual message: "
                + msg.getData() + " bytePayload: " + msg.getBytePayload());
    }
}
