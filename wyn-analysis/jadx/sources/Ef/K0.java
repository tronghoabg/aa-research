package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class K0 extends AbstractC0509q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3682g = AtomicIntegerFieldUpdater.newUpdater(K0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f3683e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    public U f3684f;

    public static void l(int i5) {
        throw new IllegalStateException(("Illegal state " + i5).toString());
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        return true;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f3682g;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    return;
                }
                l(i5);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 2));
        this.f3683e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3682g;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i5);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i5, 1)) {
                U u10 = this.f3684f;
                if (u10 != null) {
                    u10.dispose();
                    return;
                }
                return;
            }
        }
    }
}
