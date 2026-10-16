package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oyw {
    public static final yph a = yph.c("CAR.BTCapsUuidFetcher");
    static final Duration b = Duration.ofSeconds(7);
    private static oyw i;
    public final Context c;
    public final Map d = new HashMap();
    public final Handler e = new Handler(Looper.getMainLooper());
    public boolean h = false;
    public final BroadcastReceiver f = new oyt(this);
    public final Runnable g = new oez(this, 18);

    private oyw(Context context) {
        this.c = context.getApplicationContext();
    }

    public static synchronized oyw a(Context context) {
        oyw oywVar;
        oywVar = i;
        if (oywVar == null) {
            oywVar = new oyw(context.getApplicationContext());
            i = oywVar;
        }
        return oywVar;
    }

    public final void b() {
        Map map = this.d;
        synchronized (map) {
            if (map.isEmpty() && this.h) {
                ((ype) a.l().ai(6210)).u("Unregistering UUID broadcast receiver");
                this.c.unregisterReceiver(this.f);
                this.h = false;
            }
        }
    }
}
