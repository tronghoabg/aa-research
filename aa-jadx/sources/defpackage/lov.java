package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lov implements defpackage.mbe {
    public final defpackage.eqp c;
    private final java.util.Map e = new java.util.LinkedHashMap();
    private final defpackage.eqs f;
    public static final defpackage.lou a = new defpackage.lou();
    private static final defpackage.yqm d = defpackage.yqm.c("MediaNotificationProc");
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 8);

    public lov() {
        defpackage.eqs eqsVar = new defpackage.eqs(defpackage.afcf.a);
        this.f = eqsVar;
        this.c = eqsVar;
    }

    private final void c() {
        this.f.m(defpackage.afga.W(this.e.values()));
    }

    @Override // defpackage.mbe
    public final /* synthetic */ boolean a(android.service.notification.StatusBarNotification statusBarNotification, int i, boolean z) {
        statusBarNotification.getClass();
        android.app.Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return false;
        }
        int i2 = defpackage.lou.b;
        java.lang.String string = notification.extras.getString("android.template");
        if ((!defpackage.afga.f("android.app.Notification$MediaStyle", string) && !defpackage.afga.f("android.support.v4.app.NotificationCompat$MediaStyle", string)) || notification.extras.getParcelable("android.mediaSession") == null || (notification.flags & 64) == 0) {
            return false;
        }
        ((defpackage.yqj) d.e()).y("Media notification posted: %s", statusBarNotification.getKey());
        this.e.put(statusBarNotification.getKey(), new defpackage.afau(statusBarNotification.getPackageName(), notification.getSmallIcon()));
        c();
        return true;
    }

    @Override // defpackage.mbe
    public final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        if (this.e.remove(statusBarNotification.getKey()) == null) {
            return false;
        }
        ((defpackage.yqj) d.e()).y("Tracked media notification removed: %s", statusBarNotification.getKey());
        c();
        return true;
    }
}
