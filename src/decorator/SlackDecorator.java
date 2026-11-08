package decorator;

public class SlackDecorator extends NotifierDecorator{

    protected SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
        System.out.println("Enviando SLACK: " + message);
    }
}
