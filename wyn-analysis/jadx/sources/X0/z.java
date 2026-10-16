package X0;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class z {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z2) {
        return messagingStyle.setGroupConversation(z2);
    }
}
