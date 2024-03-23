package com.addBook.serv.controller;

import com.addBook.serv.dto.BookDto;
import com.addBook.serv.service.AddBookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBook {
    final AddBookService addBookService;

    @Autowired
    public AddBook(AddBookService addBookService) {
        this.addBookService = addBookService;
    }

    @PostMapping("/addBook")
    @Operation(summary = "Добавление книги")
    public void count(final @RequestBody @Valid BookDto bookDto) throws JsonProcessingException {
        addBookService.addBook(bookDto);
    }
}
