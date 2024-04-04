package rocketseat.com.passin.domain.event.exceptions;

public class EventeNotFoundException extends  RuntimeException{
    public EventeNotFoundException(String message){
        super(message);
    }
}
