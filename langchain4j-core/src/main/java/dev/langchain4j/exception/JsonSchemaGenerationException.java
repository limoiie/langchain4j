package dev.langchain4j.exception;

public class JsonSchemaGenerationException extends JsonSchemaException {

    public JsonSchemaGenerationException(String message) {
        super(message);
    }

    public JsonSchemaGenerationException(Throwable cause) {
        super(cause);
    }
}