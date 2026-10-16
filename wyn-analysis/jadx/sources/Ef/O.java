package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class O extends Jf.q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3692e = AtomicIntegerFieldUpdater.newUpdater(O.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // Jf.q, Ef.z0
    public final void k(Object obj) throws N {
        l(obj);
    }

    @Override // Jf.q, Ef.z0
    public final void l(Object obj) throws N {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3692e;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                Jf.b.h(H.G(obj), A6.h.A(this.f6134d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
