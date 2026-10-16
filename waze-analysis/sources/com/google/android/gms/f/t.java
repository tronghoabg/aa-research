package com.google.android.gms.f;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static t f5250a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5251b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5252c;

    /* renamed from: d, reason: collision with root package name */
    private n f5253d = new n(this);

    /* renamed from: e, reason: collision with root package name */
    private int f5254e = 1;

    t(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5252c = scheduledExecutorService;
        this.f5251b = context.getApplicationContext();
    }

    public static synchronized t b(Context context) {
        t tVar;
        tVar = f5250a;
        if (tVar == null) {
            com.google.android.gms.k.e.b.d.a();
            tVar = new t(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.a.b("MessengerIpcClient"))));
            f5250a = tVar;
        }
        return tVar;
    }

    private final synchronized int f() {
        int i2;
        i2 = this.f5254e;
        this.f5254e = i2 + 1;
        return i2;
    }

    private final synchronized com.google.android.gms.o.t g(q qVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(qVar.toString()));
        }
        if (!this.f5253d.e(qVar)) {
            n nVar = new n(this);
            this.f5253d = nVar;
            nVar.e(qVar);
        }
        return qVar.f5247b.a();
    }

    public final com.google.android.gms.o.t c(int i2, Bundle bundle) {
        return g(new p(f(), i2, bundle));
    }

    public final com.google.android.gms.o.t d(int i2, Bundle bundle) {
        return g(new s(f(), i2, bundle));
    }
}
