package Ef;

import ef.C2515C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class z0 implements InterfaceC0501m0, InterfaceC0511s, G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3793a = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3794b = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public z0(boolean z2) {
        this._state$volatile = z2 ? H.f3677j : H.f3676i;
    }

    public static r N(Jf.j jVar) {
        while (jVar.g()) {
            Jf.j jVarD = jVar.d();
            if (jVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Jf.j.f6121b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (Jf.j) obj;
                    if (!jVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarD;
            }
        }
        while (true) {
            jVar = jVar.f();
            if (!jVar.g()) {
                if (jVar instanceof r) {
                    return (r) jVar;
                }
                if (jVar instanceof C0) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (!(obj instanceof t0)) {
            return obj instanceof InterfaceC0491h0 ? ((InterfaceC0491h0) obj).isActive() ? "Active" : "New" : obj instanceof C0517x ? "Cancelled" : "Completed";
        }
        t0 t0Var = (t0) obj;
        return t0Var.d() ? "Cancelling" : t0.f3769b.get(t0Var) == 1 ? "Completing" : "Active";
    }

    public static CancellationException V(z0 z0Var, Throwable th) {
        z0Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0503n0(z0Var, z0Var.t(), th) : cancellationException;
    }

    public boolean A() {
        return true;
    }

    public final S3.l B() {
        kotlin.jvm.internal.K.e(3, w0.f3786a);
        kotlin.jvm.internal.K.e(3, x0.f3789a);
        return new S3.l(this);
    }

    public boolean C() {
        return this instanceof C0514u;
    }

    public final C0 D(InterfaceC0491h0 interfaceC0491h0) {
        C0 c0B = interfaceC0491h0.b();
        if (c0B != null) {
            return c0B;
        }
        if (interfaceC0491h0 instanceof W) {
            return new C0();
        }
        if (interfaceC0491h0 instanceof AbstractC0509q0) {
            S((AbstractC0509q0) interfaceC0491h0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0491h0).toString());
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(InterfaceC0501m0 interfaceC0501m0) {
        E0 e02 = E0.f3662a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3794b;
        if (interfaceC0501m0 == null) {
            atomicReferenceFieldUpdater.set(this, e02);
            return;
        }
        interfaceC0501m0.start();
        InterfaceC0508q interfaceC0508qAttachChild = interfaceC0501m0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0508qAttachChild);
        if (I()) {
            interfaceC0508qAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, e02);
        }
    }

    public final U H(boolean z2, AbstractC0509q0 abstractC0509q0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        E0 e02;
        boolean z10;
        boolean zC;
        abstractC0509q0.f3762d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f3793a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof W;
            e02 = E0.f3662a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof InterfaceC0491h0)) {
                    z10 = false;
                    break;
                }
                InterfaceC0491h0 interfaceC0491h0 = (InterfaceC0491h0) obj;
                C0 c0B = interfaceC0491h0.b();
                if (c0B == null) {
                    AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S((AbstractC0509q0) obj);
                } else {
                    if (abstractC0509q0.i()) {
                        t0 t0Var = interfaceC0491h0 instanceof t0 ? (t0) interfaceC0491h0 : null;
                        Throwable thC = t0Var != null ? t0Var.c() : null;
                        if (thC == null) {
                            zC = c0B.c(abstractC0509q0, 5);
                        } else if (z2) {
                            abstractC0509q0.j(thC);
                            return e02;
                        }
                    } else {
                        zC = c0B.c(abstractC0509q0, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                W w2 = (W) obj;
                if (w2.f3704a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0509q0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                R(w2);
            }
        }
        if (z10) {
            return abstractC0509q0;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0517x c0517x = obj2 instanceof C0517x ? (C0517x) obj2 : null;
            abstractC0509q0.j(c0517x != null ? c0517x.f3788a : null);
        }
        return e02;
    }

    public final boolean I() {
        return !(f3793a.get(this) instanceof InterfaceC0491h0);
    }

    public boolean J() {
        return this instanceof C0490h;
    }

    public final boolean K(Object obj) {
        Object objW;
        do {
            objW = W(f3793a.get(this), obj);
            if (objW == H.f3671d) {
                return false;
            }
            if (objW == H.f3672e) {
                return true;
            }
        } while (objW == H.f3673f);
        k(objW);
        return true;
    }

    public final Object L(Object obj) {
        Object objW;
        do {
            objW = W(f3793a.get(this), obj);
            if (objW == H.f3671d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0517x c0517x = obj instanceof C0517x ? (C0517x) obj : null;
                throw new IllegalStateException(str, c0517x != null ? c0517x.f3788a : null);
            }
        } while (objW == H.f3673f);
        return objW;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    public final void O(C0 c02, Throwable th) {
        c02.c(new Jf.h(4), 4);
        Object obj = Jf.j.f6120a.get(c02);
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        E5.Q q4 = null;
        for (Jf.j jVarF = (Jf.j) obj; !jVarF.equals(c02); jVarF = jVarF.f()) {
            if ((jVarF instanceof AbstractC0509q0) && ((AbstractC0509q0) jVarF).i()) {
                try {
                    ((AbstractC0509q0) jVarF).j(th);
                } catch (Throwable th2) {
                    if (q4 != null) {
                        Fe.b.d(q4, th2);
                    } else {
                        q4 = new E5.Q("Exception in completion handler " + jVarF + " for " + this, th2, 1);
                    }
                }
            }
        }
        if (q4 != null) {
            F(q4);
        }
        s(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Ef.g0] */
    public final void R(W w2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0 c02 = new C0();
        if (!w2.f3704a) {
            c02 = new C0489g0(c02);
        }
        do {
            atomicReferenceFieldUpdater = f3793a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w2, c02)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w2);
    }

    public final void S(AbstractC0509q0 abstractC0509q0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0 c02 = new C0();
        abstractC0509q0.getClass();
        Jf.j.f6121b.set(c02, abstractC0509q0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Jf.j.f6120a;
        atomicReferenceFieldUpdater2.set(c02, abstractC0509q0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC0509q0) == abstractC0509q0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0509q0, abstractC0509q0, c02)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0509q0) != abstractC0509q0) {
                        break;
                    }
                }
                c02.e(abstractC0509q0);
                break loop0;
            }
            break;
        }
        Jf.j jVarF = abstractC0509q0.f();
        do {
            atomicReferenceFieldUpdater = f3793a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0509q0, jVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0509q0);
    }

    public final int T(Object obj) {
        boolean z2 = obj instanceof W;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3793a;
        if (z2) {
            if (((W) obj).f3704a) {
                return 0;
            }
            W w2 = H.f3677j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Q();
            return 1;
        }
        if (!(obj instanceof C0489g0)) {
            return 0;
        }
        C0 c02 = ((C0489g0) obj).f3737a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c02)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Q();
        return 1;
    }

    public final Object W(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0491h0)) {
            return H.f3671d;
        }
        if (((obj instanceof W) || (obj instanceof AbstractC0509q0)) && !(obj instanceof r) && !(obj2 instanceof C0517x)) {
            InterfaceC0491h0 interfaceC0491h0 = (InterfaceC0491h0) obj;
            Object c0493i0 = obj2 instanceof InterfaceC0491h0 ? new C0493i0((InterfaceC0491h0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3793a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0491h0, c0493i0)) {
                    P(obj2);
                    v(interfaceC0491h0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0491h0);
            return H.f3673f;
        }
        InterfaceC0491h0 interfaceC0491h02 = (InterfaceC0491h0) obj;
        C0 c0D = D(interfaceC0491h02);
        if (c0D == null) {
            return H.f3673f;
        }
        t0 t0Var = interfaceC0491h02 instanceof t0 ? (t0) interfaceC0491h02 : null;
        if (t0Var == null) {
            t0Var = new t0(c0D, null);
        }
        synchronized (t0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t0.f3769b;
                if (atomicIntegerFieldUpdater.get(t0Var) == 1) {
                    return H.f3671d;
                }
                atomicIntegerFieldUpdater.set(t0Var, 1);
                if (t0Var != interfaceC0491h02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3793a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0491h02, t0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0491h02) {
                            return H.f3673f;
                        }
                    }
                }
                boolean zD = t0Var.d();
                C0517x c0517x = obj2 instanceof C0517x ? (C0517x) obj2 : null;
                if (c0517x != null) {
                    t0Var.a(c0517x.f3788a);
                }
                Throwable thC = zD ? null : t0Var.c();
                if (thC != null) {
                    O(c0D, thC);
                }
                r rVarN = N(c0D);
                if (rVarN != null && X(t0Var, rVarN, obj2)) {
                    return H.f3672e;
                }
                c0D.c(new Jf.h(2), 2);
                r rVarN2 = N(c0D);
                return (rVarN2 == null || !X(t0Var, rVarN2, obj2)) ? x(t0Var, obj2) : H.f3672e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean X(t0 t0Var, r rVar, Object obj) {
        while (H.x(rVar.f3763e, false, new C0512s0(this, t0Var, rVar, obj)) == E0.f3662a) {
            rVar = N(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // Ef.InterfaceC0501m0
    public final InterfaceC0508q attachChild(InterfaceC0511s interfaceC0511s) {
        r rVar = new r(interfaceC0511s);
        rVar.f3762d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3793a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                W w2 = (W) obj;
                if (w2.f3704a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                R(w2);
            } else {
                boolean z2 = obj instanceof InterfaceC0491h0;
                E0 e02 = E0.f3662a;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0517x c0517x = obj2 instanceof C0517x ? (C0517x) obj2 : null;
                    rVar.j(c0517x != null ? c0517x.f3788a : null);
                    return e02;
                }
                C0 c0B = ((InterfaceC0491h0) obj).b();
                if (c0B == null) {
                    AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S((AbstractC0509q0) obj);
                } else if (!c0B.c(rVar, 7)) {
                    boolean zC = c0B.c(rVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof t0) {
                        thC = ((t0) obj3).c();
                    } else {
                        C0517x c0517x2 = obj3 instanceof C0517x ? (C0517x) obj3 : null;
                        if (c0517x2 != null) {
                            thC = c0517x2.f3788a;
                        }
                    }
                    rVar.j(thC);
                    if (zC) {
                        break loop0;
                    }
                    return e02;
                }
            }
        }
        return rVar;
    }

    @Override // Ef.InterfaceC0501m0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0503n0(this, t(), null);
        }
        r(cancellationException);
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // Ef.InterfaceC0501m0
    public final CancellationException getCancellationException() {
        Object obj = f3793a.get(this);
        if (!(obj instanceof t0)) {
            if (!(obj instanceof InterfaceC0491h0)) {
                return obj instanceof C0517x ? V(this, ((C0517x) obj).f3788a) : new C0503n0(this, getClass().getSimpleName().concat(" has completed normally"), null);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((t0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException c0503n0 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (c0503n0 == null) {
            if (strConcat == null) {
                strConcat = t();
            }
            c0503n0 = new C0503n0(this, strConcat, thC);
        }
        return c0503n0;
    }

    @Override // Ef.InterfaceC0501m0
    public final Af.k getChildren() {
        return new Af.o(new v0(this, null));
    }

    public Object getCompleted() {
        return y();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f3793a.get(this);
        if (obj instanceof InterfaceC0491h0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0517x c0517x = obj instanceof C0517x ? (C0517x) obj : null;
        if (c0517x != null) {
            return c0517x.f3788a;
        }
        return null;
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return C0499l0.f3748a;
    }

    @Override // Ef.InterfaceC0501m0
    public final U invokeOnCompletion(tf.l lVar) {
        return H(true, new V(lVar, 1));
    }

    @Override // Ef.InterfaceC0501m0
    public boolean isActive() {
        Object obj = f3793a.get(this);
        return (obj instanceof InterfaceC0491h0) && ((InterfaceC0491h0) obj).isActive();
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean isCancelled() {
        Object obj = f3793a.get(this);
        if (obj instanceof C0517x) {
            return true;
        }
        return (obj instanceof t0) && ((t0) obj).d();
    }

    @Override // Ef.InterfaceC0501m0
    public final Object join(InterfaceC3103c interfaceC3103c) {
        boolean z2;
        while (true) {
            Object obj = f3793a.get(this);
            if (!(obj instanceof InterfaceC0491h0)) {
                z2 = false;
                break;
            }
            if (T(obj) >= 0) {
                z2 = true;
                break;
            }
        }
        C2515C c2515c = C2515C.f34653a;
        if (!z2) {
            H.p(interfaceC3103c.getContext());
            return c2515c;
        }
        C0502n c0502n = new C0502n(1, A6.h.A(interfaceC3103c));
        c0502n.t();
        c0502n.w(new C0494j(H.x(this, true, new C0506p(c0502n, 1)), 2));
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        if (objS != aVar) {
            objS = c2515c;
        }
        return objS == aVar ? objS : c2515c;
    }

    public void l(Object obj) {
        k(obj);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    public final Object p(InterfaceC3103c interfaceC3103c) {
        Object obj;
        int i5 = 2;
        do {
            obj = f3793a.get(this);
            if (!(obj instanceof InterfaceC0491h0)) {
                if (obj instanceof C0517x) {
                    throw ((C0517x) obj).f3788a;
                }
                return H.N(obj);
            }
        } while (T(obj) < 0);
        C0510r0 c0510r0 = new C0510r0(this, A6.h.A(interfaceC3103c));
        c0510r0.t();
        c0510r0.w(new C0494j(H.x(this, true, new V(c0510r0, i5)), i5));
        Object objS = c0510r0.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.z0.q(java.lang.Object):boolean");
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0508q interfaceC0508q = (InterfaceC0508q) f3794b.get(this);
        return (interfaceC0508q == null || interfaceC0508q == E0.f3662a) ? z2 : interfaceC0508q.a(th) || z2;
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean start() {
        int iT;
        do {
            iT = T(f3793a.get(this));
            if (iT == 0) {
                return false;
            }
        } while (iT != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M() + '{' + U(f3793a.get(this)) + '}');
        sb2.append('@');
        sb2.append(H.t(this));
        return sb2.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && A();
    }

    public final void v(InterfaceC0491h0 interfaceC0491h0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3794b;
        InterfaceC0508q interfaceC0508q = (InterfaceC0508q) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0508q != null) {
            interfaceC0508q.dispose();
            atomicReferenceFieldUpdater.set(this, E0.f3662a);
        }
        E5.Q q4 = null;
        C0517x c0517x = obj instanceof C0517x ? (C0517x) obj : null;
        Throwable th = c0517x != null ? c0517x.f3788a : null;
        if (interfaceC0491h0 instanceof AbstractC0509q0) {
            try {
                ((AbstractC0509q0) interfaceC0491h0).j(th);
                return;
            } catch (Throwable th2) {
                F(new E5.Q("Exception in completion handler " + interfaceC0491h0 + " for " + this, th2, 1));
                return;
            }
        }
        C0 c0B = interfaceC0491h0.b();
        if (c0B != null) {
            c0B.c(new Jf.h(1), 1);
            Object obj2 = Jf.j.f6120a.get(c0B);
            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (Jf.j jVarF = (Jf.j) obj2; !jVarF.equals(c0B); jVarF = jVarF.f()) {
                if (jVarF instanceof AbstractC0509q0) {
                    try {
                        ((AbstractC0509q0) jVarF).j(th);
                    } catch (Throwable th3) {
                        if (q4 != null) {
                            Fe.b.d(q4, th3);
                        } else {
                            q4 = new E5.Q("Exception in completion handler " + jVarF + " for " + this, th3, 1);
                        }
                    }
                }
            }
            if (q4 != null) {
                F(q4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        z0 z0Var = (z0) ((G0) obj);
        Object obj2 = f3793a.get(z0Var);
        if (obj2 instanceof t0) {
            cancellationExceptionC = ((t0) obj2).c();
        } else if (obj2 instanceof C0517x) {
            cancellationExceptionC = ((C0517x) obj2).f3788a;
        } else {
            if (obj2 instanceof InterfaceC0491h0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new C0503n0(z0Var, "Parent job is ".concat(U(obj2)), cancellationExceptionC) : cancellationException;
    }

    public final Object x(t0 t0Var, Object obj) {
        Throwable thZ;
        C0517x c0517x = obj instanceof C0517x ? (C0517x) obj : null;
        Throwable th = c0517x != null ? c0517x.f3788a : null;
        synchronized (t0Var) {
            t0Var.d();
            ArrayList<Throwable> arrayListE = t0Var.e(th);
            thZ = z(t0Var, arrayListE);
            if (thZ != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thZ && th2 != thZ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        Fe.b.d(thZ, th2);
                    }
                }
            }
        }
        if (thZ != null && thZ != th) {
            obj = new C0517x(false, thZ);
        }
        if (thZ != null && (s(thZ) || E(thZ))) {
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0517x.f3787b.compareAndSet((C0517x) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3793a;
        Object c0493i0 = obj instanceof InterfaceC0491h0 ? new C0493i0((InterfaceC0491h0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, t0Var, c0493i0) && atomicReferenceFieldUpdater.get(this) == t0Var) {
        }
        v(t0Var, obj);
        return obj;
    }

    public final Object y() throws Throwable {
        Object obj = f3793a.get(this);
        if (obj instanceof InterfaceC0491h0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0517x) {
            throw ((C0517x) obj).f3788a;
        }
        return H.N(obj);
    }

    public final Throwable z(t0 t0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (t0Var.d()) {
                return new C0503n0(this, t(), null);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof L0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof L0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // Ef.InterfaceC0501m0
    public final U invokeOnCompletion(boolean z2, boolean z10, tf.l lVar) {
        AbstractC0509q0 v2;
        if (z2) {
            v2 = new C0497k0(lVar);
        } else {
            v2 = new V(lVar, 1);
        }
        return H(z10, v2);
    }

    public void Q() {
    }

    public void F(E5.Q q4) {
        throw q4;
    }

    public void P(Object obj) {
    }

    public void k(Object obj) {
    }
}
