package androidx.media3.common.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, int i2, int i3, int i4) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        an.B(notificationManager);
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i2), i4);
        if (i3 != 0) {
            notificationChannel.setDescription(context.getString(i3));
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void setNotification(Context context, int i2, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        an.B(notificationManager);
        if (notification != null) {
            notificationManager.notify(i2, notification);
        } else {
            notificationManager.cancel(i2);
        }
    }
}
