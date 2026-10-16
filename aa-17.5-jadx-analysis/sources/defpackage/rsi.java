package defpackage;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public final class rsi implements rte {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public rtg b;
    public final Context c;
    public Handler g;
    public Runnable h;
    public boolean i;
    public final rtu j;
    public volatile boolean d = false;
    public final Object f = new Object();
    public final boolean e = true;

    public rsi(Context context, rtu rtuVar, boolean z) {
        this.c = context;
        this.j = rtuVar;
    }

    public final void a() {
        Runnable runnable;
        synchronized (this.f) {
            Handler handler = this.g;
            if (handler != null && (runnable = this.h) != null) {
                handler.removeCallbacks(runnable);
            }
        }
    }
}
