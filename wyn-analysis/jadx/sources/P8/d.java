package p8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class d extends ic.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f43277b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f43278c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f43279d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f43280e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f43281f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f43277b = atomicReferenceFieldUpdater;
        this.f43278c = atomicReferenceFieldUpdater2;
        this.f43279d = atomicReferenceFieldUpdater3;
        this.f43280e = atomicReferenceFieldUpdater4;
        this.f43281f = atomicReferenceFieldUpdater5;
    }

    @Override // ic.d
    public final void I(l lVar, l lVar2) {
        this.f43278c.lazySet(lVar, lVar2);
    }

    @Override // ic.d
    public final void J(l lVar, Thread thread) {
        this.f43277b.lazySet(lVar, thread);
    }

    @Override // ic.d
    public final boolean h(m mVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f43280e;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == cVar);
        return false;
    }

    @Override // ic.d
    public final boolean i(m mVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f43281f;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == obj);
        return false;
    }

    @Override // ic.d
    public final boolean j(m mVar, l lVar, l lVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f43279d;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, lVar, lVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == lVar);
        return false;
    }

    @Override // ic.d
    public final c v(m mVar) {
        return (c) this.f43280e.getAndSet(mVar, c.f43273d);
    }

    @Override // ic.d
    public final l w(m mVar) {
        return (l) this.f43279d.getAndSet(mVar, l.f43288c);
    }
}
