package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ef.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0497k0 extends AbstractC0509q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3746f = AtomicIntegerFieldUpdater.newUpdater(C0497k0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final tf.l f3747e;

    public C0497k0(tf.l lVar) {
        this.f3747e = lVar;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        return true;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        if (f3746f.compareAndSet(this, 0, 1)) {
            this.f3747e.invoke(th);
        }
    }
}
