package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class dug {
    public static String b;
    private static duf e;
    private final Context f;
    private final NotificationManager g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object d = new Object();

    public dug(Context context) {
        this.f = context;
        this.g = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i) {
        this.g.cancel(str, i);
    }

    public final void b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.g.notify(str, i, notification);
            return;
        }
        Context context = this.f;
        dud dudVar = new dud(context.getPackageName(), i, str, notification);
        synchronized (d) {
            duf dufVar = e;
            if (dufVar == null) {
                dufVar = new duf(context.getApplicationContext());
                e = dufVar;
            }
            dufVar.a.obtainMessage(0, dudVar).sendToTarget();
        }
        this.g.cancel(str, i);
    }

    public final boolean c() {
        return this.g.areNotificationsEnabled();
    }
}
