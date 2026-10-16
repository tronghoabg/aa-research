package Ef;

import ef.C2515C;
import ef.C2530n;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jf.C3104d;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3465d;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class H {

    /* renamed from: b, reason: collision with root package name */
    public static final H6.g f3669b;

    /* renamed from: c, reason: collision with root package name */
    public static final H6.g f3670c;

    /* renamed from: d, reason: collision with root package name */
    public static final H6.g f3671d;

    /* renamed from: e, reason: collision with root package name */
    public static final H6.g f3672e;

    /* renamed from: f, reason: collision with root package name */
    public static final H6.g f3673f;

    /* renamed from: g, reason: collision with root package name */
    public static final H6.g f3674g;

    /* renamed from: h, reason: collision with root package name */
    public static final H6.g f3675h;

    /* renamed from: a, reason: collision with root package name */
    public static final H6.g f3668a = new H6.g("RESUME_TOKEN", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final W f3676i = new W(false);

    /* renamed from: j, reason: collision with root package name */
    public static final W f3677j = new W(true);

    static {
        int i5 = 1;
        f3669b = new H6.g("REMOVED_TASK", i5);
        f3670c = new H6.g("CLOSED_EMPTY", i5);
        int i10 = 1;
        f3671d = new H6.g("COMPLETING_ALREADY", i10);
        f3672e = new H6.g("COMPLETING_WAITING_CHILDREN", i10);
        f3673f = new H6.g("COMPLETING_RETRY", i10);
        f3674g = new H6.g("TOO_LATE_TO_CANCEL", i10);
        f3675h = new H6.g("SEALED", i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(java.util.List r4, lf.AbstractC3464c r5) {
        /*
            boolean r0 = r5 instanceof Ef.C0488g
            if (r0 == 0) goto L13
            r0 = r5
            Ef.g r0 = (Ef.C0488g) r0
            int r1 = r0.f3736c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3736c = r1
            goto L18
        L13:
            Ef.g r0 = new Ef.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3735b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f3736c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r4 = r0.f3734a
            java.util.Iterator r4 = (java.util.Iterator) r4
            Fe.e.U(r5)
            goto L3c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            Fe.e.U(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            Ef.m0 r5 = (Ef.InterfaceC0501m0) r5
            r2 = r4
            java.util.Iterator r2 = (java.util.Iterator) r2
            r0.f3734a = r2
            r0.f3736c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3c
            return r1
        L56:
            ef.C r4 = ef.C2515C.f34653a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.H.A(java.util.List, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(Ef.InterfaceC0501m0[] r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Ef.C0486f
            if (r0 == 0) goto L13
            r0 = r7
            Ef.f r0 = (Ef.C0486f) r0
            int r1 = r0.f3732e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3732e = r1
            goto L18
        L13:
            Ef.f r0 = new Ef.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3731d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f3732e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f3730c
            int r2 = r0.f3729b
            java.lang.Object[] r4 = r0.f3728a
            Ef.m0[] r4 = (Ef.InterfaceC0501m0[]) r4
            Fe.e.U(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            Fe.e.U(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f3728a = r7
            r0.f3729b = r2
            r0.f3730c = r6
            r0.f3732e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.H.B(Ef.m0[], lf.c):java.lang.Object");
    }

    public static final H0 C(E e7, InterfaceC3108h interfaceC3108h, F f10, tf.p pVar) {
        InterfaceC3108h interfaceC3108hE = E(e7, interfaceC3108h);
        f10.getClass();
        H0 b02 = f10 == F.f3664b ? new B0(interfaceC3108hE, pVar) : new H0(interfaceC3108hE, true);
        b02.a0(f10, b02, pVar);
        return b02;
    }

    public static /* synthetic */ H0 D(E e7, InterfaceC3108h interfaceC3108h, tf.p pVar, int i5) {
        F f10 = F.f3666d;
        if ((i5 & 1) != 0) {
            interfaceC3108h = C3109i.f38759a;
        }
        if ((i5 & 2) != 0) {
            f10 = F.f3663a;
        }
        return C(e7, interfaceC3108h, f10, pVar);
    }

    public static final InterfaceC3108h E(E e7, InterfaceC3108h interfaceC3108h) {
        InterfaceC3108h interfaceC3108hQ = q(e7.getCoroutineContext(), interfaceC3108h, true);
        Lf.e eVar = S.f3698a;
        return (interfaceC3108hQ == eVar || interfaceC3108hQ.get(C3104d.f38758a) != null) ? interfaceC3108hQ : interfaceC3108hQ.plus(eVar);
    }

    public static final Kd.a F(E e7, InterfaceC3106f interfaceC3106f) {
        return new Kd.a(e7.getCoroutineContext().plus(interfaceC3106f));
    }

    public static final Object G(Object obj) {
        return obj instanceof C0517x ? Fe.e.z(((C0517x) obj).f3788a) : obj;
    }

    public static final void H(C0502n c0502n, InterfaceC3103c interfaceC3103c, boolean z2) {
        Object obj = C0502n.f3752g.get(c0502n);
        Throwable thE = c0502n.e(obj);
        Object objZ = thE != null ? Fe.e.z(thE) : c0502n.f(obj);
        if (!z2) {
            interfaceC3103c.resumeWith(objZ);
            return;
        }
        AbstractC3340k.c(interfaceC3103c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Jf.f fVar = (Jf.f) interfaceC3103c;
        AbstractC3464c abstractC3464c = fVar.f6110e;
        InterfaceC3108h context = abstractC3464c.getContext();
        Object objN = Jf.b.n(context, fVar.f6112g);
        P0 p0O = objN != Jf.b.f6100d ? O(abstractC3464c, context, objN) : null;
        try {
            abstractC3464c.resumeWith(objZ);
            if (p0O == null || p0O.c0()) {
                Jf.b.g(context, objN);
            }
        } catch (Throwable th) {
            if (p0O == null || p0O.c0()) {
                Jf.b.g(context, objN);
            }
            throw th;
        }
    }

    public static final Object I(InterfaceC3108h interfaceC3108h, tf.p pVar) throws Throwable {
        AbstractC0481c0 abstractC0481c0A;
        InterfaceC3108h interfaceC3108hQ;
        long jP;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC3107g interfaceC3107g = C3104d.f38758a;
        InterfaceC3105e interfaceC3105e = (InterfaceC3105e) interfaceC3108h.get(interfaceC3107g);
        C3109i c3109i = C3109i.f38759a;
        if (interfaceC3105e == null) {
            abstractC0481c0A = J0.a();
            interfaceC3108hQ = q(c3109i, interfaceC3108h.plus(abstractC0481c0A), true);
            Lf.e eVar = S.f3698a;
            if (interfaceC3108hQ != eVar && interfaceC3108hQ.get(interfaceC3107g) == null) {
                interfaceC3108hQ = interfaceC3108hQ.plus(eVar);
            }
        } else {
            if (interfaceC3105e instanceof AbstractC0481c0) {
            }
            abstractC0481c0A = (AbstractC0481c0) J0.f3681a.get();
            interfaceC3108hQ = q(c3109i, interfaceC3108h, true);
            Lf.e eVar2 = S.f3698a;
            if (interfaceC3108hQ != eVar2 && interfaceC3108hQ.get(interfaceC3107g) == null) {
                interfaceC3108hQ = interfaceC3108hQ.plus(eVar2);
            }
        }
        C0490h c0490h = new C0490h(interfaceC3108hQ, threadCurrentThread, abstractC0481c0A);
        c0490h.a0(F.f3663a, c0490h, pVar);
        AbstractC0481c0 abstractC0481c0 = c0490h.f3739e;
        if (abstractC0481c0 != null) {
            int i5 = AbstractC0481c0.f3720e;
            abstractC0481c0.J(false);
        }
        while (true) {
            if (abstractC0481c0 != null) {
                try {
                    jP = abstractC0481c0.P();
                } catch (Throwable th) {
                    if (abstractC0481c0 != null) {
                        int i10 = AbstractC0481c0.f3720e;
                        abstractC0481c0.z(false);
                    }
                    throw th;
                }
            } else {
                jP = Long.MAX_VALUE;
            }
            if (c0490h.I()) {
                break;
            }
            LockSupport.parkNanos(c0490h, jP);
            if (Thread.interrupted()) {
                c0490h.q(new InterruptedException());
            }
        }
        if (abstractC0481c0 != null) {
            int i11 = AbstractC0481c0.f3720e;
            abstractC0481c0.z(false);
        }
        Object objN = N(z0.f3793a.get(c0490h));
        C0517x c0517x = objN instanceof C0517x ? (C0517x) objN : null;
        if (c0517x == null) {
            return objN;
        }
        throw c0517x.f3788a;
    }

    public static final Object K(M0 m02, tf.p pVar) {
        x(m02, true, new V(s(m02.f6134d.getContext()).b(m02.f3686e, m02, m02.f3710c), 0));
        return AbstractC2641B.L(m02, false, m02, pVar);
    }

    public static final String L(InterfaceC3103c interfaceC3103c) {
        Object objZ;
        if (interfaceC3103c instanceof Jf.f) {
            return ((Jf.f) interfaceC3103c).toString();
        }
        try {
            objZ = interfaceC3103c + '@' + t(interfaceC3103c);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (C2530n.a(objZ) != null) {
            objZ = interfaceC3103c.getClass().getName() + '@' + t(interfaceC3103c);
        }
        return (String) objZ;
    }

    public static final long M(long j8) {
        byte b5 = 0;
        Cf.h hVar = Cf.a.f2200b;
        boolean z2 = j8 > 0;
        if (z2) {
            return Cf.a.d(Cf.a.g(j8, Fe.b.T(999999L, Cf.c.f2206b)));
        }
        if (z2) {
            throw new E5.Q(b5, 9);
        }
        return 0L;
    }

    public static final Object N(Object obj) {
        InterfaceC0491h0 interfaceC0491h0;
        C0493i0 c0493i0 = obj instanceof C0493i0 ? (C0493i0) obj : null;
        return (c0493i0 == null || (interfaceC0491h0 = c0493i0.f3741a) == null) ? obj : interfaceC0491h0;
    }

    public static final P0 O(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h, Object obj) {
        P0 p02 = null;
        if ((interfaceC3103c instanceof InterfaceC3465d) && interfaceC3108h.get(Q0.f3697a) != null) {
            InterfaceC3465d callerFrame = (InterfaceC3465d) interfaceC3103c;
            while (true) {
                if ((callerFrame instanceof O) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof P0) {
                    p02 = (P0) callerFrame;
                    break;
                }
            }
            if (p02 != null) {
                p02.e0(interfaceC3108h, obj);
            }
        }
        return p02;
    }

    public static final Object P(InterfaceC3108h interfaceC3108h, tf.p pVar, InterfaceC3103c interfaceC3103c) throws Throwable {
        Object objN;
        InterfaceC3108h context = interfaceC3103c.getContext();
        InterfaceC3108h interfaceC3108hPlus = !((Boolean) interfaceC3108h.fold(Boolean.FALSE, new Cd.U(1))).booleanValue() ? context.plus(interfaceC3108h) : q(context, interfaceC3108h, false);
        p(interfaceC3108hPlus);
        if (interfaceC3108hPlus == context) {
            Jf.q qVar = new Jf.q(interfaceC3103c, interfaceC3108hPlus);
            objN = AbstractC2641B.L(qVar, true, qVar, pVar);
        } else {
            C3104d c3104d = C3104d.f38758a;
            if (AbstractC3340k.a(interfaceC3108hPlus.get(c3104d), context.get(c3104d))) {
                P0 p02 = new P0(interfaceC3103c, interfaceC3108hPlus);
                InterfaceC3108h interfaceC3108h2 = p02.f3710c;
                Object objN2 = Jf.b.n(interfaceC3108h2, null);
                try {
                    Object objL = AbstractC2641B.L(p02, true, p02, pVar);
                    Jf.b.g(interfaceC3108h2, objN2);
                    objN = objL;
                } catch (Throwable th) {
                    Jf.b.g(interfaceC3108h2, objN2);
                    throw th;
                }
            } else {
                O o7 = new O(interfaceC3103c, interfaceC3108hPlus);
                try {
                    Jf.b.h(C2515C.f34653a, A6.h.A(A6.h.q(o7, o7, pVar)));
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = O.f3692e;
                        int i5 = atomicIntegerFieldUpdater.get(o7);
                        if (i5 != 0) {
                            if (i5 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objN = N(z0.f3793a.get(o7));
                            if (objN instanceof C0517x) {
                                throw ((C0517x) objN).f3788a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(o7, 0, 1)) {
                            objN = kf.a.f39711a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC3935e.v(o7, th2);
                    throw null;
                }
            }
        }
        kf.a aVar = kf.a.f39711a;
        return objN;
    }

    public static final Object Q(long j8, tf.p pVar, AbstractC3464c abstractC3464c) {
        if (j8 <= 0) {
            throw new L0("Timed out immediately", null);
        }
        Object objK = K(new M0(j8, abstractC3464c), pVar);
        kf.a aVar = kf.a.f39711a;
        return objK;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(long r6, tf.p r8, jf.InterfaceC3103c r9) {
        /*
            boolean r0 = r9 instanceof Ef.N0
            if (r0 == 0) goto L13
            r0 = r9
            Ef.N0 r0 = (Ef.N0) r0
            int r1 = r0.f3691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3691d = r1
            goto L18
        L13:
            Ef.N0 r0 = new Ef.N0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3690c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f3691d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.G r6 = r0.f3689b
            Fe.e.U(r9)     // Catch: Ef.L0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            Fe.e.U(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5f
        L3d:
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            r0.f3688a = r8     // Catch: Ef.L0 -> L57
            r0.f3689b = r9     // Catch: Ef.L0 -> L57
            r0.f3691d = r3     // Catch: Ef.L0 -> L57
            Ef.M0 r2 = new Ef.M0     // Catch: Ef.L0 -> L57
            r2.<init>(r6, r0)     // Catch: Ef.L0 -> L57
            r9.f39740a = r2     // Catch: Ef.L0 -> L57
            java.lang.Object r6 = K(r2, r8)     // Catch: Ef.L0 -> L57
            if (r6 != r1) goto L56
            return r1
        L56:
            return r6
        L57:
            r7 = move-exception
            r6 = r9
        L59:
            Ef.M0 r8 = r7.f3685a
            java.lang.Object r6 = r6.f39740a
            if (r8 != r6) goto L61
        L5f:
            r6 = 0
            return r6
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.H.R(long, tf.p, jf.c):java.lang.Object");
    }

    public static final Object S(long j8, tf.p pVar, AbstractC3464c abstractC3464c) {
        return R(M(j8), pVar, abstractC3464c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(lf.AbstractC3464c r7) {
        /*
            jf.h r0 = r7.getContext()
            p(r0)
            jf.c r7 = A6.h.A(r7)
            boolean r1 = r7 instanceof Jf.f
            if (r1 == 0) goto L12
            Jf.f r7 = (Jf.f) r7
            goto L13
        L12:
            r7 = 0
        L13:
            ef.C r1 = ef.C2515C.f34653a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            Ef.A r2 = r7.f6109d
            boolean r3 = Jf.b.j(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f6111f = r1
            r7.f3694c = r4
            r2.o(r0, r7)
            goto L86
        L2b:
            Ef.S0 r3 = new Ef.S0
            Ef.l0 r5 = Ef.S0.f3699b
            r3.<init>(r5)
            jf.h r0 = r0.plus(r3)
            r7.f6111f = r1
            r7.f3694c = r4
            r2.o(r0, r7)
            boolean r0 = r3.f3700a
            if (r0 == 0) goto L86
            Ef.c0 r0 = Ef.J0.a()
            ff.l r2 = r0.f3723d
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f3721b
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f6111f = r1
            r7.f3694c = r4
            r0.B(r7)
            kf.a r7 = kf.a.f39711a
            goto L88
        L6c:
            r0.J(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.Q()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.z(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.h(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.z(r4)
            throw r7
        L86:
            kf.a r7 = kf.a.f39711a
        L88:
            kf.a r0 = kf.a.f39711a
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.H.T(lf.c):java.lang.Object");
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static C0514u b() {
        C0514u c0514u = new C0514u(true);
        c0514u.G(null);
        return c0514u;
    }

    public static final Kd.a c(InterfaceC3108h interfaceC3108h) {
        if (interfaceC3108h.get(C0499l0.f3748a) == null) {
            interfaceC3108h = interfaceC3108h.plus(d());
        }
        return new Kd.a(interfaceC3108h);
    }

    public static C0505o0 d() {
        return new C0505o0(null);
    }

    public static final Kd.a e() {
        I0 i0F = f();
        Lf.e eVar = S.f3698a;
        return new Kd.a(Fe.e.O(i0F, Jf.n.f6132a));
    }

    public static I0 f() {
        return new I0(null);
    }

    public static final Executor g(A a5) {
        Executor executorZ;
        AbstractC0483d0 abstractC0483d0 = a5 instanceof AbstractC0483d0 ? (AbstractC0483d0) a5 : null;
        return (abstractC0483d0 == null || (executorZ = abstractC0483d0.z()) == null) ? new Q(a5) : executorZ;
    }

    public static L h(E e7, InterfaceC3108h interfaceC3108h, tf.p pVar, int i5) {
        F f10 = F.f3666d;
        if ((i5 & 1) != 0) {
            interfaceC3108h = C3109i.f38759a;
        }
        if ((i5 & 2) != 0) {
            f10 = F.f3663a;
        }
        InterfaceC3108h interfaceC3108hE = E(e7, interfaceC3108h);
        L a02 = f10 == F.f3664b ? new A0(interfaceC3108hE, pVar) : new L(interfaceC3108hE, true);
        a02.a0(f10, a02, pVar);
        return a02;
    }

    public static final Object i(ArrayList arrayList, AbstractC3464c abstractC3464c) {
        return arrayList.isEmpty() ? ff.v.f35432a : new C0484e((K[]) arrayList.toArray(new K[0])).a(abstractC3464c);
    }

    public static final void j(E e7, CancellationException cancellationException) {
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) e7.getCoroutineContext().get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            interfaceC0501m0.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e7).toString());
        }
    }

    public static final void k(InterfaceC0501m0 interfaceC0501m0, String str, Throwable th) {
        interfaceC0501m0.cancel(a(str, th));
    }

    public static final Object l(tf.p pVar, InterfaceC3103c interfaceC3103c) {
        Jf.q qVar = new Jf.q(interfaceC3103c, interfaceC3103c.getContext());
        Object objL = AbstractC2641B.L(qVar, true, qVar, pVar);
        kf.a aVar = kf.a.f39711a;
        return objL;
    }

    public static final Object m(long j8, InterfaceC3103c interfaceC3103c) {
        C2515C c2515c = C2515C.f34653a;
        if (j8 > 0) {
            C0502n c0502n = new C0502n(1, A6.h.A(interfaceC3103c));
            c0502n.t();
            if (j8 < Long.MAX_VALUE) {
                s(c0502n.f3755e).h(j8, c0502n);
            }
            Object objS = c0502n.s();
            if (objS == kf.a.f39711a) {
                return objS;
            }
        }
        return c2515c;
    }

    public static final Object n(long j8, AbstractC3464c abstractC3464c) {
        Object objM = m(M(j8), abstractC3464c);
        return objM == kf.a.f39711a ? objM : C2515C.f34653a;
    }

    public static final void o(E e7) {
        p(e7.getCoroutineContext());
    }

    public static final void p(InterfaceC3108h interfaceC3108h) {
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
        if (interfaceC0501m0 != null && !interfaceC0501m0.isActive()) {
            throw interfaceC0501m0.getCancellationException();
        }
    }

    public static final InterfaceC3108h q(InterfaceC3108h interfaceC3108h, InterfaceC3108h interfaceC3108h2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC3108h.fold(bool, new Cd.U(1))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC3108h2.fold(bool, new Cd.U(1))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC3108h.plus(interfaceC3108h2);
        }
        C3109i c3109i = C3109i.f38759a;
        InterfaceC3108h interfaceC3108h3 = (InterfaceC3108h) interfaceC3108h.fold(c3109i, new Cd.U(2));
        Object objFold = interfaceC3108h2;
        if (zBooleanValue2) {
            objFold = interfaceC3108h2.fold(c3109i, new Cd.U(3));
        }
        return interfaceC3108h3.plus((InterfaceC3108h) objFold);
    }

    public static final A r(Executor executor) {
        A a5;
        Q q4 = executor instanceof Q ? (Q) executor : null;
        return (q4 == null || (a5 = q4.f3696a) == null) ? new C0485e0(executor) : a5;
    }

    public static final M s(InterfaceC3108h interfaceC3108h) {
        InterfaceC3106f interfaceC3106f = interfaceC3108h.get(C3104d.f38758a);
        M m10 = interfaceC3106f instanceof M ? (M) interfaceC3106f : null;
        return m10 == null ? J.f3680a : m10;
    }

    public static final String t(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0501m0 u(InterfaceC3108h interfaceC3108h) {
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            return interfaceC0501m0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC3108h).toString());
    }

    public static final C0502n v(InterfaceC3103c interfaceC3103c) {
        C0502n c0502n;
        C0502n c0502n2;
        if (!(interfaceC3103c instanceof Jf.f)) {
            return new C0502n(1, interfaceC3103c);
        }
        Jf.f fVar = (Jf.f) interfaceC3103c;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Jf.f.f6108h;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            H6.g gVar = Jf.b.f6099c;
            c0502n = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, gVar);
                c0502n2 = null;
                break;
            }
            if (obj instanceof C0502n) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0502n2 = (C0502n) obj;
                break loop0;
            }
            if (obj != gVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0502n2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0502n.f3752g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0502n2);
            if (!(obj2 instanceof C0516w) || ((C0516w) obj2).f3784d == null) {
                C0502n.f3751f.set(c0502n2, 536870911);
                atomicReferenceFieldUpdater2.set(c0502n2, C0478b.f3712a);
                c0502n = c0502n2;
            } else {
                c0502n2.p();
            }
            if (c0502n != null) {
                return c0502n;
            }
        }
        return new C0502n(2, interfaceC3103c);
    }

    public static final void w(InterfaceC3108h interfaceC3108h, Throwable th) {
        if (th instanceof N) {
            th = ((N) th).f3687a;
        }
        try {
            C c10 = (C) interfaceC3108h.get(B.f3657a);
            if (c10 != null) {
                c10.handleException(interfaceC3108h, th);
            } else {
                Jf.b.d(interfaceC3108h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Fe.b.d(runtimeException, th);
                th = runtimeException;
            }
            Jf.b.d(interfaceC3108h, th);
        }
    }

    public static final U x(InterfaceC0501m0 interfaceC0501m0, boolean z2, AbstractC0509q0 abstractC0509q0) {
        if (interfaceC0501m0 instanceof z0) {
            return ((z0) interfaceC0501m0).H(z2, abstractC0509q0);
        }
        return interfaceC0501m0.invokeOnCompletion(abstractC0509q0.i(), z2, new C0507p0(1, abstractC0509q0, AbstractC0509q0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean y(E e7) {
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) e7.getCoroutineContext().get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            return interfaceC0501m0.isActive();
        }
        return true;
    }

    public static final boolean z(InterfaceC3108h interfaceC3108h) {
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            return interfaceC0501m0.isActive();
        }
        return true;
    }
}
