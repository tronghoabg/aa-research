package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class adyo extends adyn {
    private final AtomicIntegerFieldUpdater a;

    public adyo(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.adyn
    public final boolean a(adyq adyqVar) {
        return this.a.compareAndSet(adyqVar, 0, -1);
    }

    @Override // defpackage.adyn
    public final void b(adyq adyqVar) {
        this.a.set(adyqVar, 0);
    }
}
