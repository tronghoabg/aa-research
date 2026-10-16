package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class aisv {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(aisv.class, "b");
    public volatile int b;
    public final ahnb c;

    public aisv(int i, ahnb ahnbVar) {
        this.c = ahnbVar;
        this.b = i;
    }

    public final int a() {
        return a.incrementAndGet(this);
    }

    public final boolean b(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == aisy.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        a.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
