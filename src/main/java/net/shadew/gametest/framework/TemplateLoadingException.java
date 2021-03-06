package net.shadew.gametest.framework;

public class TemplateLoadingException extends RuntimeException {
    public TemplateLoadingException() {
    }

    public TemplateLoadingException(String message) {
        super(message);
    }

    public TemplateLoadingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemplateLoadingException(Throwable cause) {
        super(cause);
    }
}
