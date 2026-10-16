package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class jej implements jeg {
    public static final yph a = yph.c("CAR.SETUP.WIFI");
    public final ScheduledExecutorService b;
    public final ConnectivityManager c;
    public xxh d = xvy.a;

    public jej(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        Objects.checkIndex(0, 3);
        int[] iArr = jeh.b;
        boolean[] zArr = jeh.a;
        if (!zArr[0]) {
            try {
                iArr[0] = 1;
            } catch (Throwable unused) {
            }
            zArr[0] = true;
        }
        if (iArr == null || iArr[0] != 1) {
            throw new RuntimeException(null, null);
        }
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.c = (ConnectivityManager) systemService;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void a() {
        if (this.d.f()) {
            this.d.b().cancel(true);
            this.d = xvy.a;
            ((ype) ((ype) a.f()).ai((char) 1952)).u("Cancelled socket reconnect future");
        }
    }
}
