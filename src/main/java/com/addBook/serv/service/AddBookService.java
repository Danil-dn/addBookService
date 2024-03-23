package com.addBook.serv.service;

import com.addBook.serv.dto.BookDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AddBookService {
    final BookProducer bookProducer;

    public AddBookService(BookProducer bookProducer) {
        this.bookProducer = bookProducer;
    }

    public void addBook(BookDto bookDto) throws JsonProcessingException {
        bookProducer.sendBookToKafka("topic--book", convertBookDtoToJson(bookDto));
    }

    private String convertBookDtoToJson(BookDto bookDto) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(bookDto);
    }
}
