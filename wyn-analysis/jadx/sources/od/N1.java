package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class N1 extends S1 {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f41739c;

    public N1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f41739c = atomicIntegerFieldUpdater;
    }

    @Override // od.S1
    public final boolean q(P1 p12) {
        return this.f41739c.compareAndSet(p12, 0, -1);
    }

    @Override // od.S1
    public final void r(P1 p12) {
        this.f41739c.set(p12, 0);
    }
}
