package androidx.navigation.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AtomicInt {
    private final AtomicInteger atomicInt;

    public AtomicInt(int i2) {
        this.atomicInt = new AtomicInteger(i2);
    }

    public final int decrementAndGet$navigation_runtime() {
        return this.atomicInt.decrementAndGet();
    }

    public final int get$navigation_runtime() {
        return this.atomicInt.get();
    }

    public final int incrementAndGet$navigation_runtime() {
        return this.atomicInt.incrementAndGet();
    }
}
