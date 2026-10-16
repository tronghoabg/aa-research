package X0;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* renamed from: X0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1290s {
    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static Parcelable a(Icon icon) {
        return icon;
    }
}
