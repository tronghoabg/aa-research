package X0;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class F {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z2) {
        builder.setAllowGeneratedReplies(z2);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
