package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fnq {
    public static void a(android.app.Service service, int i, android.app.Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (android.app.ForegroundServiceStartNotAllowedException e) {
            defpackage.fjv.a();
            android.util.Log.w(androidx.work.impl.foreground.SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (java.lang.SecurityException e2) {
            defpackage.fjv.a();
            android.util.Log.w(androidx.work.impl.foreground.SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }
}
