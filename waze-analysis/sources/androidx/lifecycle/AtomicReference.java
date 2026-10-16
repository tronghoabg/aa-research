package androidx.lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AtomicReference<V> {
    private final java.util.concurrent.atomic.AtomicReference<V> base;

    public AtomicReference(V v) {
        this.base = new java.util.concurrent.atomic.AtomicReference<>(v);
    }

    public final boolean compareAndSet(V v, V v2) {
        return AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.base, v, v2);
    }

    public final V get() {
        return this.base.get();
    }
}
