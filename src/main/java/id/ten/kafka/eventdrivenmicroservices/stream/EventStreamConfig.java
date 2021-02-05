package id.ten.kafka.eventdrivenmicroservices.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(EventStream.class)
public class EventStreamConfig {
}
