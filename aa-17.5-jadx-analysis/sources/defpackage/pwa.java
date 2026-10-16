package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class pwa {
    public static final long a;
    public static final pwn b;
    public final zgt d;
    public final Object c = new Object();
    public zhc e = new zhc();
    public zgp f = wub.Y(b);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 25000L;
        b = new pwn("LowPrioritySend", "true");
    }

    public pwa(zgt zgtVar) {
        this.d = zgtVar;
    }

    public final void a() {
        zhc zhcVar;
        synchronized (this.c) {
            zhcVar = this.e;
        }
        zhcVar.o(b);
    }
}
