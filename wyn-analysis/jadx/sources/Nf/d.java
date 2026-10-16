package Nf;

import Ef.H;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class d extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8680h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : e.f8681a;
    }

    @Override // Nf.a
    public final void a(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8680h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            H6.g gVar = e.f8681a;
            if (obj2 != gVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, gVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = Nf.d.f8680h;
        r3 = r0.f8679b;
        r2.set(r3, null);
        r0.f8678a.n(r1, new Ff.d(1, r3, r0));
     */
    @Override // Nf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf.InterfaceC3103c r6) {
        /*
            r5 = this;
            boolean r0 = r5.f()
            ef.C r1 = ef.C2515C.f34653a
            if (r0 == 0) goto L9
            goto L49
        L9:
            jf.c r6 = A6.h.A(r6)
            Ef.n r6 = Ef.H.v(r6)
            Nf.c r0 = new Nf.c     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Nf.i.f8688g     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4a
            int r3 = r5.f8689a     // Catch: java.lang.Throwable -> L4a
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L36
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Nf.d.f8680h     // Catch: java.lang.Throwable -> L4a
            Nf.d r3 = r0.f8679b     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L4a
            Ff.d r2 = new Ff.d     // Catch: java.lang.Throwable -> L4a
            r4 = 1
            r2.<init>(r4, r3, r0)     // Catch: java.lang.Throwable -> L4a
            Ef.n r0 = r0.f8678a     // Catch: java.lang.Throwable -> L4a
            r0.n(r1, r2)     // Catch: java.lang.Throwable -> L4a
            goto L3c
        L36:
            boolean r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L16
        L3c:
            java.lang.Object r6 = r6.s()
            kf.a r0 = kf.a.f39711a
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r1
        L46:
            if (r6 != r0) goto L49
            return r6
        L49:
            return r1
        L4a:
            r0 = move-exception
            r6.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Nf.d.b(jf.c):java.lang.Object");
    }

    public final boolean e() {
        return Math.max(i.f8688g.get(this), 0) == 0;
    }

    public final boolean f() {
        int i5;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f8688g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f8689a;
            if (i10 > i11) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i11));
            } else {
                if (i10 <= 0) {
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f8680h.set(this, null);
                    c10 = 0;
                    break;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        return "Mutex@" + H.t(this) + "[isLocked=" + e() + ",owner=" + f8680h.get(this) + ']';
    }
}
