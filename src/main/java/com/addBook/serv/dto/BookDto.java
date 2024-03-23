package com.addBook.serv.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {

    @Schema(example = "война и мир")
    @NotNull
    private String title;

    private AuthorDto authorDto;
}
