package Nf;

import Ef.C0500m;
import Ef.InterfaceC0498l;
import Ef.R0;
import Jf.r;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ka.AbstractC3256n;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8684c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8685d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8686e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8687f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8688g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8689a;

    /* renamed from: b, reason: collision with root package name */
    public final C0500m f8690b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i5, int i10) {
        this.f8689a = i5;
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0 || i10 > i5) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i5 - i10;
        this.f8690b = new C0500m(this, 1);
    }

    public final boolean c(R0 r02) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8686e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f8687f.getAndIncrement(this);
        g gVar = g.f8682a;
        long j8 = andIncrement / k.f8696f;
        loop0: while (true) {
            objB = Jf.b.b(lVar, j8, gVar);
            if (!Jf.b.e(objB)) {
                r rVarC = Jf.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f6136c >= rVarC.f6136c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) Jf.b.c(objB);
        int i5 = (int) (andIncrement % k.f8696f);
        AtomicReferenceArray atomicReferenceArray = lVar2.f8697e;
        while (!atomicReferenceArray.compareAndSet(i5, null, r02)) {
            if (atomicReferenceArray.get(i5) != null) {
                H6.g gVar2 = k.f8692b;
                H6.g gVar3 = k.f8693c;
                while (!atomicReferenceArray.compareAndSet(i5, gVar2, gVar3)) {
                    if (atomicReferenceArray.get(i5) != gVar2) {
                        return false;
                    }
                }
                boolean z2 = r02 instanceof InterfaceC0498l;
                C2515C c2515c = C2515C.f34653a;
                if (z2) {
                    ((InterfaceC0498l) r02).g(c2515c, this.f8690b);
                    return true;
                }
                if (r02 instanceof Mf.i) {
                    ((Mf.h) ((Mf.i) r02)).f7655e = c2515c;
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + r02).toString());
            }
        }
        r02.b(lVar2, i5);
        return true;
    }

    public final void d() {
        int i5;
        Object objB;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8688g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f8689a;
            if (andIncrement >= i10) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8684c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8685d.getAndIncrement(this);
            long j8 = andIncrement2 / k.f8696f;
            h hVar = h.f8683a;
            while (true) {
                objB = Jf.b.b(lVar, j8, hVar);
                if (Jf.b.e(objB)) {
                    break;
                }
                r rVarC = Jf.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f6136c >= rVarC.f6136c) {
                        break;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            }
            l lVar2 = (l) Jf.b.c(objB);
            lVar2.b();
            z2 = false;
            if (lVar2.f6136c <= j8) {
                int i11 = (int) (andIncrement2 % k.f8696f);
                H6.g gVar = k.f8692b;
                AtomicReferenceArray atomicReferenceArray = lVar2.f8697e;
                Object andSet = atomicReferenceArray.getAndSet(i11, gVar);
                if (andSet == null) {
                    int i12 = k.f8691a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == k.f8693c) {
                            z2 = true;
                            break;
                        }
                    }
                    H6.g gVar2 = k.f8692b;
                    H6.g gVar3 = k.f8694d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, gVar2, gVar3)) {
                            if (atomicReferenceArray.get(i11) != gVar2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = !z2;
                } else if (andSet != k.f8695e) {
                    boolean z10 = andSet instanceof InterfaceC0498l;
                    C2515C c2515c = C2515C.f34653a;
                    if (!z10) {
                        if (!(andSet instanceof Mf.i)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((Mf.h) ((Mf.i) andSet)).g(this, c2515c) == 0) {
                            z2 = true;
                            break;
                            break;
                        }
                    } else {
                        InterfaceC0498l interfaceC0498l = (InterfaceC0498l) andSet;
                        H6.g gVarM = interfaceC0498l.m(c2515c, this.f8690b);
                        if (gVarM != null) {
                            interfaceC0498l.o(gVarM);
                            z2 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z2);
    }
}
