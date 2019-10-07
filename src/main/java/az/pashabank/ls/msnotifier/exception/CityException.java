package az.pashabank.ls.msnotifier.exception;

import java.util.UUID;

public class CityException extends RuntimeException {
    private final String errorUuid;

    private final String errorCode;

    private final String errorMessage;

    public CityException(String errorUuid, String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorUuid = errorUuid;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CityException(String errorCode, String errorMessage) {
        this(UUID.randomUUID().toString(), errorCode, errorMessage);
    }

    public String getErrorUuid() {
        return errorUuid;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
