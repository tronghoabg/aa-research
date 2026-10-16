package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public final class aisw {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(aisw.class, "b");
    public volatile long b;
    public final ahnb c;

    public aisw(long j, ahnb ahnbVar) {
        this.c = ahnbVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == aisy.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
