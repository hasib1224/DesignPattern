package CreationalDesignPattern;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel=="SMS")
        {
            return new SMSnotify();
        }
        else  return null;


    }
}
