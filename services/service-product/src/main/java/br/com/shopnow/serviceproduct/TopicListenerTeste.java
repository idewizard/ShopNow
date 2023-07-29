package br.com.shopnow.serviceproduct;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicListenerTeste {
    @KafkaListener(topics = "${spring.kafka.consumer.topic.name.consumer}", groupId = "1")
    public void consume(ConsumerRecord<String, String> payload){
        log.info("Mensagem Recebida: {}", payload.value());
    }
}
