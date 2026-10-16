package U3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends xg.g {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12250e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12251f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12252g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12253h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12254i;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12250e = atomicReferenceFieldUpdater;
        this.f12251f = atomicReferenceFieldUpdater2;
        this.f12252g = atomicReferenceFieldUpdater3;
        this.f12253h = atomicReferenceFieldUpdater4;
        this.f12254i = atomicReferenceFieldUpdater5;
    }

    @Override // xg.g
    public final void J(g gVar, g gVar2) {
        this.f12251f.lazySet(gVar, gVar2);
    }

    @Override // xg.g
    public final void K(g gVar, Thread thread) {
        this.f12250e.lazySet(gVar, thread);
    }

    @Override // xg.g
    public final boolean m(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12253h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // xg.g
    public final boolean n(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12254i;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // xg.g
    public final boolean o(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12252g;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
