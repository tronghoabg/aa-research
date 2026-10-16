package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dun {
    public static java.lang.String b;
    private static defpackage.dum e;
    private final android.content.Context f;
    private final android.app.NotificationManager g;
    public static final java.lang.Object a = new java.lang.Object();
    public static java.util.Set c = new java.util.HashSet();
    private static final java.lang.Object d = new java.lang.Object();

    public dun(android.content.Context context) {
        this.f = context;
        this.g = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public final void a(java.lang.String str, int i) {
        this.g.cancel(str, i);
    }

    public final void b(java.lang.String str, int i, android.app.Notification notification) {
        android.os.Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.g.notify(str, i, notification);
            return;
        }
        android.content.Context context = this.f;
        defpackage.duk dukVar = new defpackage.duk(context.getPackageName(), i, str, notification);
        synchronized (d) {
            defpackage.dum dumVar = e;
            if (dumVar == null) {
                dumVar = new defpackage.dum(context.getApplicationContext());
                e = dumVar;
            }
            dumVar.a.obtainMessage(0, dukVar).sendToTarget();
        }
        this.g.cancel(str, i);
    }

    public final boolean c() {
        return this.g.areNotificationsEnabled();
    }
}
