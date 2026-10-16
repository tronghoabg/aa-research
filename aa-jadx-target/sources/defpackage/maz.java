package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class maz {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NotifChannelManager");
    private static defpackage.maz c;
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.content.Context e;
    private final java.util.concurrent.Executor f;

    private maz(android.content.Context context, java.util.concurrent.Executor executor) {
        this.e = context;
        this.f = executor;
    }

    public static android.app.NotificationChannel a(android.content.Context context) {
        c();
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("gearhead_connection_status", context.getString(2132083800), true != defpackage.adax.aP() ? 2 : 4);
        ep$.ExternalSyntheticApiModelOutline1.m(notificationChannel, (android.net.Uri) null, (android.media.AudioAttributes) null);
        ep$.ExternalSyntheticApiModelOutline1.m(notificationChannel, false);
        ep$.ExternalSyntheticApiModelOutline1.m$1(notificationChannel, false);
        return notificationChannel;
    }

    public static synchronized void b(android.content.Context context, java.util.concurrent.Executor executor) {
        if (c == null) {
            c = new defpackage.maz(context, executor);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static synchronized void c() {
        defpackage.maz mazVar = c;
        if (mazVar != null) {
            int i = 1;
            if (mazVar.d.compareAndSet(false, true)) {
                try {
                    defpackage.maz mazVar2 = c;
                    android.content.Context context = mazVar2.e;
                    if (context == null) {
                        throw new java.lang.IllegalStateException("Context is null, cannot setup notification channels.");
                    }
                    android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
                    if (notificationManager == null) {
                        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 4665)).u("NotificationManager not found, cannot setup channels.");
                        return;
                    }
                    try {
                        ep$.ExternalSyntheticApiModelOutline1.m(notificationManager, defpackage.ygw.t(a(context), new android.app.NotificationChannel("gearhead_alerts", context.getString(2132084624), 4), new android.app.NotificationChannel("gearhead_surveys_and_feedback", context.getString(2132084635), 3), new android.app.NotificationChannel("gearhead_tips_and_tricks", context.getString(2132084644), 3)));
                    } catch (java.lang.IllegalArgumentException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai((char) 4666)).u("Couldn't create notification channels");
                    }
                    mazVar2.f.execute(new defpackage.mbx(defpackage.ygw.s("gearhead_default", "gearhead_importance_high", "gearhead_wireless"), notificationManager, i));
                } catch (java.lang.IllegalStateException e2) {
                    c.d.set(false);
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e2)).ai((char) 4667)).u("Couldn't setup notification channels.");
                }
            }
        }
    }
}
