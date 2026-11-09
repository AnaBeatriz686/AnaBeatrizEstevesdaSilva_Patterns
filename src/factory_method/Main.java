package factory_method;

public class Main {
    public static void main(String[] args) {

        NotificationService email = new NotificationService(new EmailNotificationFactory());
        email.sendNotification("Bem vindo ao sistema!");

        NotificationService sms = new NotificationService(new SMSNotificationFactory());
        sms.sendNotification("Bem vindo ao sistema!");

        NotificationService push = new NotificationService(new PushNotificationFactory());
        push.sendNotification("Bem vindo ao sistema!");
    }
}
