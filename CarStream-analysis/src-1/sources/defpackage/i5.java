package defpackage;

import android.app.Notification;
import android.app.Person;
import android.media.session.MediaSessionManager;
import android.os.Parcelable;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i5 {
    public static /* synthetic */ Notification.MessagingStyle.Message f(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    public static /* synthetic */ Notification.MessagingStyle g(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static /* bridge */ /* synthetic */ Person i(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ Person j(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo l(int i, int i2, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
