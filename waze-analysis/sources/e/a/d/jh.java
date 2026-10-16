package e.a.d;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jh extends jg {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicIntegerFieldUpdater f47225a;

    /* synthetic */ jh(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f47225a = atomicIntegerFieldUpdater;
    }

    @Override // e.a.d.jg
    public final boolean a(jj jjVar) {
        return this.f47225a.compareAndSet(jjVar, 0, -1);
    }

    @Override // e.a.d.jg
    public final void b(jj jjVar) {
        this.f47225a.set(jjVar, 0);
    }
}
