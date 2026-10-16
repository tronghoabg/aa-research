package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class akav {
    private final String a;
    public final Object b;
    public final Object c;
    public volatile Object d;
    private long e;

    public akav(String str, Object obj, Object obj2, TimeUnit timeUnit) {
        ahgm.e(timeUnit, "Time unit");
        this.a = str;
        this.b = obj;
        this.c = obj2;
        System.currentTimeMillis();
        this.e = Long.MAX_VALUE;
    }

    public synchronized boolean c(long j) {
        return j >= this.e;
    }

    public final synchronized long d() {
        return this.e;
    }

    public final synchronized void e(long j, TimeUnit timeUnit) {
        ahgm.e(timeUnit, "Time unit");
        this.e = Math.min(j > 0 ? System.currentTimeMillis() + timeUnit.toMillis(j) : Long.MAX_VALUE, Long.MAX_VALUE);
    }

    public final String toString() {
        return "[id:" + this.a + "][route:" + this.b + "][state:" + this.d + "]";
    }
}
