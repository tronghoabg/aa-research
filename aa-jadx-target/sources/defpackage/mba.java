package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mba {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.NotifDebug");

    public static void a(android.service.notification.StatusBarNotification statusBarNotification, java.lang.String str) {
        if (defpackage.kmv.c(defpackage.acvl.b(), statusBarNotification.getPackageName())) {
            ((defpackage.yqj) a.l().ai((char) 4668)).M("%s: %s", str, statusBarNotification);
        }
    }
}
