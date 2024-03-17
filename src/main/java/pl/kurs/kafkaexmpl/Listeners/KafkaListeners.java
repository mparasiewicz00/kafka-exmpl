package pl.kurs.kafkaexmpl.Listeners;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "exampleTopic",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
