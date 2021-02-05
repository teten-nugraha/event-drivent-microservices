package id.ten.kafka.eventdrivenmicroservices.service;

import id.ten.kafka.eventdrivenmicroservices.payload.Message;
import id.ten.kafka.eventdrivenmicroservices.stream.EventStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class EventStreamService {

    @Autowired
    private EventStream eventStream;

    public Boolean produceEvent(Message msg) {
        System.out.println("Producing events --> id: "+ msg.getId() +" name: "+msg.getName()+" Actual message: "+ msg.getData());
        msg.setBytePayload(msg.getData().getBytes());
        MessageChannel messageChannel = eventStream.producer();
        return messageChannel.send(MessageBuilder.withPayload(msg)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
    }
}
