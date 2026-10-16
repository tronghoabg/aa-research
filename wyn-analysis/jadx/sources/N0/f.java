package N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8001a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8002b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8003c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8004d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8005e;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8001a = atomicReferenceFieldUpdater;
        this.f8002b = atomicReferenceFieldUpdater2;
        this.f8003c = atomicReferenceFieldUpdater3;
        this.f8004d = atomicReferenceFieldUpdater4;
        this.f8005e = atomicReferenceFieldUpdater5;
    }

    @Override // android.support.v4.media.session.b
    public final boolean K(i iVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8004d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == eVar);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean L(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8005e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean M(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8003c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final void n0(h hVar, h hVar2) {
        this.f8002b.lazySet(hVar, hVar2);
    }

    @Override // android.support.v4.media.session.b
    public final void o0(h hVar, Thread thread) {
        this.f8001a.lazySet(hVar, thread);
    }
}
