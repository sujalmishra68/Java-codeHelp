interface Notification {

    void sendMessage();

}

class Email implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("📧 Sending Email...");
    }

}

class SMS implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("📱 Sending SMS...");
    }

}

class WhatsApp implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("💬 Sending WhatsApp Message...");
    }

}

class PushNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("🔔 Sending Push Notification...");
    }

}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification n;

        n = new Email();
        n.sendMessage();

        n = new SMS();
        n.sendMessage();

        n = new WhatsApp();
        n.sendMessage();

        n = new PushNotification();
        n.sendMessage();

    }

}