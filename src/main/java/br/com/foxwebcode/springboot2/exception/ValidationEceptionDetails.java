package br.com.foxwebcode.springboot2.exception;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationEceptionDetails extends ExceptionDetails {
    private final String fields;
    private final String fieldsMessage;
}
