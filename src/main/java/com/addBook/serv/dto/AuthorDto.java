package com.addBook.serv.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDto {

    @NotNull
    @Schema(example = "лев николаевич толстой")
    private String fullName;

    @NotNull
    @Schema(example = "мужской")
    private String gender;
}
