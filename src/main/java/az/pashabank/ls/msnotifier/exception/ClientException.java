package az.pashabank.ls.msnotifier.exception;

public class ClientException extends RuntimeException {

    public ClientException() {
        super("exception.notifier.client-fail- Error with client integration");
    }
}
