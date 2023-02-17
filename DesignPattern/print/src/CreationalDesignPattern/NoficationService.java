package CreationalDesignPattern;

public class NoficationService {
    public static void main(String []args){
        NotificationFactory noti_factory =new NotificationFactory();
        Notification notification= noti_factory.createNotification("SMS");
        notification.Notify();
    }
}
