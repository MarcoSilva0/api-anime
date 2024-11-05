package br.com.foxwebcode.springboot2.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name of this anime cannot be empty")
    @NotNull(message = "The name of this anime cannot be null")
    private String name;
    @URL(message = "The URL is not valid")
    private String url;
}
