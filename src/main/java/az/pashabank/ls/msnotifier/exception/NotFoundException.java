package az.pashabank.ls.msnotifier.exception;

public class NotFoundException extends CityException {

    public NotFoundException() {
        super("exception.ms-notifier.city-not-found",
                "exception.ms-notifier.city-not-found");
    }

    public NotFoundException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
