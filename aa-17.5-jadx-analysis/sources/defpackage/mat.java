package defpackage;

import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public final class mat {
    private static final yph a = yph.c("GH.NotifDebug");

    public static void a(StatusBarNotification statusBarNotification, String str) {
        if (kmo.c(acuj.b(), statusBarNotification.getPackageName())) {
            ((ype) a.l().ai((char) 4665)).M("%s: %s", str, statusBarNotification);
        }
    }
}
