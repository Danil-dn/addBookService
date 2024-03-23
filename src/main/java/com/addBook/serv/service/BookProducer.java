package com.addBook.serv.service;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class BookProducer {

    private final KafkaProducer<String, String> producer;

    public BookProducer() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());

        this.producer = new KafkaProducer<>(props);
    }

    public void sendBookToKafka(String topic, String bookData) {
        producer.send(new ProducerRecord<>(topic, bookData));
    }

    public void close() {
        producer.close();
    }
}
