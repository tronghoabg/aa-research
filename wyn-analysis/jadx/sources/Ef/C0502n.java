package Ef;

import ef.C2530n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.InterfaceC3465d;

/* renamed from: Ef.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0502n extends P implements InterfaceC0498l, InterfaceC3465d, R0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3751f = AtomicIntegerFieldUpdater.newUpdater(C0502n.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3752g = AtomicReferenceFieldUpdater.newUpdater(C0502n.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3753h = AtomicReferenceFieldUpdater.newUpdater(C0502n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3103c f3754d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3108h f3755e;

    public C0502n(int i5, InterfaceC3103c interfaceC3103c) {
        super(i5);
        this.f3754d = interfaceC3103c;
        this.f3755e = interfaceC3103c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0478b.f3712a;
    }

    public static Object D(F0 f02, Object obj, int i5, tf.q qVar) {
        if (obj instanceof C0517x) {
            return obj;
        }
        if (i5 != 1 && i5 != 2) {
            return obj;
        }
        if (qVar != null || (f02 instanceof InterfaceC0496k)) {
            return new C0516w(obj, f02 instanceof InterfaceC0496k ? (InterfaceC0496k) f02 : null, qVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(F0 f02, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f02 + ", already has " + obj).toString());
    }

    public final void A() {
        InterfaceC3103c interfaceC3103c = this.f3754d;
        Throwable th = null;
        Jf.f fVar = interfaceC3103c instanceof Jf.f ? (Jf.f) interfaceC3103c : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Jf.f.f6108h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                H6.g gVar = Jf.b.f6099c;
                if (obj == gVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            a(th);
        }
    }

    public final void B(Object obj, int i5, tf.q qVar) throws N {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3752g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof F0) {
                Object objD = D((F0) obj2, obj, i5, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i5);
                return;
            }
            if (obj2 instanceof C0504o) {
                C0504o c0504o = (C0504o) obj2;
                c0504o.getClass();
                if (C0504o.f3757c.compareAndSet(c0504o, 0, 1)) {
                    if (qVar != null) {
                        k(qVar, c0504o.f3788a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(A a5, Object obj) throws N {
        InterfaceC3103c interfaceC3103c = this.f3754d;
        Jf.f fVar = interfaceC3103c instanceof Jf.f ? (Jf.f) interfaceC3103c : null;
        B(obj, (fVar != null ? fVar.f6109d : null) == a5 ? 4 : this.f3694c, null);
    }

    public final H6.g E(Object obj, tf.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3752g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof F0;
            H6.g gVar = H.f3668a;
            if (!z2) {
                boolean z10 = obj2 instanceof C0516w;
                return null;
            }
            Object objD = D((F0) obj2, obj, this.f3694c, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return gVar;
        }
    }

    @Override // Ef.InterfaceC0498l
    public final boolean a(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3752g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof F0)) {
                return false;
            }
            boolean z2 = (obj instanceof InterfaceC0496k) || (obj instanceof Jf.r);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0504o c0504o = new C0504o(z2, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0504o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            F0 f02 = (F0) obj;
            if (f02 instanceof InterfaceC0496k) {
                j((InterfaceC0496k) obj, th);
            } else if (f02 instanceof Jf.r) {
                l((Jf.r) obj, th);
            }
            if (!x()) {
                p();
            }
            q(this.f3694c);
            return true;
        }
    }

    @Override // Ef.R0
    public final void b(Jf.r rVar, int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f3751f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i5));
        w(rVar);
    }

    @Override // Ef.P
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3752g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof F0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0517x) {
                return;
            }
            if (!(obj instanceof C0516w)) {
                cancellationException2 = cancellationException;
                C0516w c0516w = new C0516w(obj, (InterfaceC0496k) null, (tf.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0516w)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0516w c0516w2 = (C0516w) obj;
            if (c0516w2.f3785e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0516w c0516wA = C0516w.a(c0516w2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0516wA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC0496k interfaceC0496k = c0516w2.f3782b;
            if (interfaceC0496k != null) {
                j(interfaceC0496k, cancellationException);
            }
            tf.q qVar = c0516w2.f3783c;
            if (qVar != null) {
                k(qVar, cancellationException, c0516w2.f3781a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // Ef.P
    public final InterfaceC3103c d() {
        return this.f3754d;
    }

    @Override // Ef.P
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // Ef.P
    public final Object f(Object obj) {
        return obj instanceof C0516w ? ((C0516w) obj).f3781a : obj;
    }

    @Override // Ef.InterfaceC0498l
    public final void g(Object obj, tf.q qVar) throws N {
        B(obj, this.f3694c, qVar);
    }

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        InterfaceC3103c interfaceC3103c = this.f3754d;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f3755e;
    }

    @Override // Ef.P
    public final Object i() {
        return f3752g.get(this);
    }

    @Override // Ef.InterfaceC0498l
    public final boolean isActive() {
        return f3752g.get(this) instanceof F0;
    }

    public final void j(InterfaceC0496k interfaceC0496k, Throwable th) {
        try {
            interfaceC0496k.a(th);
        } catch (Throwable th2) {
            H.w(this.f3755e, new E5.Q("Exception in invokeOnCancellation handler for " + this, th2, 1));
        }
    }

    public final void k(tf.q qVar, Throwable th, Object obj) {
        InterfaceC3108h interfaceC3108h = this.f3755e;
        try {
            qVar.invoke(th, obj, interfaceC3108h);
        } catch (Throwable th2) {
            H.w(interfaceC3108h, new E5.Q("Exception in resume onCancellation handler for " + this, th2, 1));
        }
    }

    public final void l(Jf.r rVar, Throwable th) {
        InterfaceC3108h interfaceC3108h = this.f3755e;
        int i5 = f3751f.get(this) & 536870911;
        if (i5 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i5, interfaceC3108h);
        } catch (Throwable th2) {
            H.w(interfaceC3108h, new E5.Q("Exception in invokeOnCancellation handler for " + this, th2, 1));
        }
    }

    @Override // Ef.InterfaceC0498l
    public final H6.g m(Object obj, tf.q qVar) {
        return E(obj, qVar);
    }

    @Override // Ef.InterfaceC0498l
    public final void n(Object obj, tf.l lVar) throws N {
        B(obj, this.f3694c, lVar != null ? new C0500m(lVar, 0) : null);
    }

    @Override // Ef.InterfaceC0498l
    public final void o(Object obj) throws N {
        q(this.f3694c);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3753h;
        U u10 = (U) atomicReferenceFieldUpdater.get(this);
        if (u10 == null) {
            return;
        }
        u10.dispose();
        atomicReferenceFieldUpdater.set(this, E0.f3662a);
    }

    public final void q(int i5) throws N {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f3751f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC3103c interfaceC3103c = this.f3754d;
                boolean z2 = i5 == 4;
                if (!z2 && (interfaceC3103c instanceof Jf.f)) {
                    boolean z10 = i5 == 1 || i5 == 2;
                    int i12 = this.f3694c;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        Jf.f fVar = (Jf.f) interfaceC3103c;
                        A a5 = fVar.f6109d;
                        InterfaceC3108h context = fVar.f6110e.getContext();
                        if (Jf.b.j(a5, context)) {
                            Jf.b.i(a5, context, this);
                            return;
                        }
                        AbstractC0481c0 abstractC0481c0A = J0.a();
                        if (abstractC0481c0A.f3721b >= 4294967296L) {
                            abstractC0481c0A.B(this);
                            return;
                        }
                        abstractC0481c0A.J(true);
                        try {
                            H.H(this, interfaceC3103c, true);
                            do {
                            } while (abstractC0481c0A.Q());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                H.H(this, interfaceC3103c, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable r(z0 z0Var) {
        return z0Var.getCancellationException();
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        Throwable thA = C2530n.a(obj);
        if (thA != null) {
            obj = new C0517x(false, thA);
        }
        B(obj, this.f3694c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f3751f;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i10 = i5 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f3752g.get(this);
                if (obj instanceof C0517x) {
                    throw ((C0517x) obj).f3788a;
                }
                int i11 = this.f3694c;
                if (i11 == 1 || i11 == 2) {
                    InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) this.f3755e.get(C0499l0.f3748a);
                    if (interfaceC0501m0 != null && !interfaceC0501m0.isActive()) {
                        CancellationException cancellationException = interfaceC0501m0.getCancellationException();
                        c(cancellationException);
                        throw cancellationException;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 536870912 + (536870911 & i5)));
        if (((U) f3753h.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return kf.a.f39711a;
    }

    public final void t() {
        U u10 = u();
        if (u10 == null || (f3752g.get(this) instanceof F0)) {
            return;
        }
        u10.dispose();
        f3753h.set(this, E0.f3662a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(H.L(this.f3754d));
        sb2.append("){");
        Object obj = f3752g.get(this);
        sb2.append(obj instanceof F0 ? "Active" : obj instanceof C0504o ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(H.t(this));
        return sb2.toString();
    }

    public final U u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) this.f3755e.get(C0499l0.f3748a);
        if (interfaceC0501m0 == null) {
            return null;
        }
        U uX = H.x(interfaceC0501m0, true, new C0506p(this, 0));
        do {
            atomicReferenceFieldUpdater = f3753h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, uX)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return uX;
    }

    public final void v(tf.l lVar) {
        w(new C0494j(lVar, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bc, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(Ef.F0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Ef.C0502n.f3752g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof Ef.C0478b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lb0
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof Ef.InterfaceC0496k
            r3 = 0
            if (r1 != 0) goto Lb9
            boolean r1 = r2 instanceof Jf.r
            if (r1 != 0) goto Lb9
            boolean r1 = r2 instanceof Ef.C0517x
            if (r1 == 0) goto L5d
            r0 = r2
            Ef.x r0 = (Ef.C0517x) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = Ef.C0517x.f3787b
            r5 = 0
            boolean r1 = r4.compareAndSet(r0, r5, r1)
            if (r1 == 0) goto L59
            boolean r1 = r2 instanceof Ef.C0504o
            if (r1 == 0) goto Lb0
            boolean r1 = r2 instanceof Ef.C0517x
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            r0 = r3
        L40:
            if (r0 == 0) goto L44
            java.lang.Throwable r3 = r0.f3788a
        L44:
            boolean r0 = r8 instanceof Ef.InterfaceC0496k
            if (r0 == 0) goto L4e
            Ef.k r8 = (Ef.InterfaceC0496k) r8
            r7.j(r8, r3)
            return
        L4e:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.AbstractC3340k.c(r8, r0)
            Jf.r r8 = (Jf.r) r8
            r7.l(r8, r3)
            return
        L59:
            y(r8, r2)
            throw r3
        L5d:
            boolean r1 = r2 instanceof Ef.C0516w
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L96
            r1 = r2
            Ef.w r1 = (Ef.C0516w) r1
            Ef.k r5 = r1.f3782b
            if (r5 != 0) goto L92
            boolean r5 = r8 instanceof Jf.r
            if (r5 == 0) goto L6f
            return
        L6f:
            kotlin.jvm.internal.AbstractC3340k.c(r8, r4)
            r4 = r8
            Ef.k r4 = (Ef.InterfaceC0496k) r4
            java.lang.Throwable r5 = r1.f3785e
            if (r5 == 0) goto L7d
            r7.j(r4, r5)
            return
        L7d:
            r5 = 29
            Ef.w r1 = Ef.C0516w.a(r1, r4, r3, r5)
        L83:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L8a
            goto Lb0
        L8a:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L83
            goto L0
        L92:
            y(r8, r2)
            throw r3
        L96:
            boolean r1 = r8 instanceof Jf.r
            if (r1 == 0) goto L9b
            return
        L9b:
            kotlin.jvm.internal.AbstractC3340k.c(r8, r4)
            r3 = r8
            Ef.k r3 = (Ef.InterfaceC0496k) r3
            Ef.w r1 = new Ef.w
            r4 = 0
            r5 = 0
            r6 = 28
            r1.<init>(r2, r3, r4, r5, r6)
        Laa:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Lb1
        Lb0:
            return
        Lb1:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto Laa
            goto L0
        Lb9:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.C0502n.w(Ef.F0):void");
    }

    public final boolean x() {
        if (this.f3694c != 2) {
            return false;
        }
        InterfaceC3103c interfaceC3103c = this.f3754d;
        AbstractC3340k.c(interfaceC3103c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return Jf.f.f6108h.get((Jf.f) interfaceC3103c) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
