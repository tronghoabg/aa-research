package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class aisu {
    public static final /* synthetic */ int a = 0;
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(aisu.class, "c");
    private volatile int c;
    private final ahnb d;

    public aisu(boolean z, ahnb ahnbVar) {
        this.d = ahnbVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = b.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.d == aisy.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        this.c = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
