package X0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;

/* renamed from: X0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1278f {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z2) {
        builder.setAllowSystemGeneratedContextualActions(z2);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder, boolean z2) {
        builder.setContextual(z2);
    }

    public static void e(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }
}
