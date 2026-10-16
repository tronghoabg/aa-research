package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes2.dex */
public final class ssn {
    public static final int a;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        new ymp("android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY");
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    public static PendingIntent b(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
