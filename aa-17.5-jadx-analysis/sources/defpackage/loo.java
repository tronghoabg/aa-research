package defpackage;

import android.app.Notification;
import android.service.notification.StatusBarNotification;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class loo implements max {
    public final eqj c;
    private final Map e = new LinkedHashMap();
    private final eqm f;
    public static final lon a = new lon();
    private static final yph d = yph.c("MediaNotificationProc");
    public static final afgl b = new lcj(mki.b, 9);

    public loo() {
        eqm eqmVar = new eqm(afbf.a);
        this.f = eqmVar;
        this.c = eqmVar;
    }

    private final void c() {
        this.f.m(woy.bc(this.e.values()));
    }

    @Override // defpackage.max
    public final /* synthetic */ boolean a(StatusBarNotification statusBarNotification, int i, boolean z) {
        statusBarNotification.getClass();
        Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return false;
        }
        int i2 = lon.b;
        String string = notification.extras.getString("android.template");
        if ((!affa.f("android.app.Notification$MediaStyle", string) && !affa.f("android.support.v4.app.NotificationCompat$MediaStyle", string)) || notification.extras.getParcelable("android.mediaSession") == null || (notification.flags & 64) == 0) {
            return false;
        }
        ((ype) d.e()).y("Media notification posted: %s", statusBarNotification.getKey());
        this.e.put(statusBarNotification.getKey(), new aezu(statusBarNotification.getPackageName(), notification.getSmallIcon()));
        c();
        return true;
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        if (this.e.remove(statusBarNotification.getKey()) == null) {
            return false;
        }
        ((ype) d.e()).y("Tracked media notification removed: %s", statusBarNotification.getKey());
        c();
        return true;
    }
}
