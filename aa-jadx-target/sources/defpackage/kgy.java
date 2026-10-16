package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kgy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CalendarNotifActions");
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);

    public static android.content.Intent b() {
        return new android.content.Intent(defpackage.mkp.a.c, (java.lang.Class<?>) com.google.android.apps.auto.components.calendar.CalendarNotificationActionService.class);
    }

    public static defpackage.kgy c() {
        return (defpackage.kgy) defpackage.mkp.a.i(defpackage.kgy.class);
    }

    public final android.app.PendingIntent a(android.content.Intent intent) {
        android.content.Context context = defpackage.mkp.a.c;
        int andIncrement = this.b.getAndIncrement();
        android.content.ClipData clipData = wer.a;
        android.app.PendingIntent pendingIntentD = wer.d(context, andIncrement, intent, 67108864);
        pendingIntentD.getClass();
        return pendingIntentD;
    }
}
