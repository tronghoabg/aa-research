package X0;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* renamed from: X0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1291t {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Parcelable b(Person person) {
        return person;
    }
}
