package X0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class B {
    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j8, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j8, person);
    }

    public static Parcelable a(Person person) {
        return person;
    }
}
