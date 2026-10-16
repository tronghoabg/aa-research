package Gf;

import A7.AbstractC0279p0;
import Cd.s0;
import Ef.C0502n;
import Ef.H;
import Ef.InterfaceC0498l;
import Ef.R0;
import ef.C2515C;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;

/* loaded from: classes5.dex */
public class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4793b = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4794c = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4795d = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4796e = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4797f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4798g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4799h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4800i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4801j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f4802a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i5) {
        this.f4802a = i5;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f4804a;
        this.bufferEnd$volatile = i5 != 0 ? i5 != Integer.MAX_VALUE ? i5 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4795d.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (y()) {
            mVar2 = g.f4804a;
            AbstractC3340k.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f4821s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object B(Gf.e r13, lf.AbstractC3464c r14) {
        /*
            boolean r0 = r14 instanceof Gf.c
            if (r0 == 0) goto L14
            r0 = r14
            Gf.c r0 = (Gf.c) r0
            int r1 = r0.f4789c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4789c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Gf.c r0 = new Gf.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f4787a
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f4789c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            Fe.e.U(r14)
            Gf.l r14 = (Gf.l) r14
            java.lang.Object r13 = r14.f4827a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            Fe.e.U(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = Gf.e.f4798g
            java.lang.Object r14 = r14.get(r13)
            Gf.m r14 = (Gf.m) r14
        L40:
            boolean r1 = r13.v()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.p()
            Gf.j r14 = new Gf.j
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = Gf.e.f4794c
            long r4 = r1.getAndIncrement(r13)
            int r1 = Gf.g.f4805b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f6136c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            Gf.m r1 = r13.o(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.G(r8, r9, r10, r12)
            r1 = r7
            H6.g r14 = Gf.g.f4815m
            if (r13 == r14) goto La0
            H6.g r14 = Gf.g.f4817o
            if (r13 != r14) goto L8d
            long r13 = r1.s()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.b()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            H6.g r14 = Gf.g.f4816n
            if (r13 != r14) goto L9c
            r6.f4789c = r2
            r2 = r8
            java.lang.Object r13 = r1.C(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.b()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.B(Gf.e, lf.c):java.lang.Object");
    }

    public static final m a(e eVar, long j8, m mVar) {
        Object objB;
        e eVar2;
        eVar.getClass();
        m mVar2 = g.f4804a;
        f fVar = f.f4803a;
        loop0: while (true) {
            objB = Jf.b.b(mVar, j8, fVar);
            if (!Jf.b.e(objB)) {
                Jf.r rVarC = Jf.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4797f;
                    Jf.r rVar = (Jf.r) atomicReferenceFieldUpdater.get(eVar);
                    if (rVar.f6136c >= rVarC.f6136c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != rVar) {
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
        boolean zE = Jf.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4794c;
        if (zE) {
            eVar.w();
            if (mVar.f6136c * g.f4805b < atomicLongFieldUpdater.get(eVar)) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) Jf.b.c(objB);
            long j10 = mVar3.f6136c;
            if (j10 <= j8) {
                return mVar3;
            }
            long j11 = g.f4805b * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4793b;
                long j12 = atomicLongFieldUpdater2.get(eVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (atomicLongFieldUpdater2.compareAndSet(eVar2, j12, j13 + (((int) (j12 >> 60)) << 60))) {
                    break;
                }
                eVar = eVar2;
            }
            if (j10 * g.f4805b < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.b();
            }
        }
        return null;
    }

    public static final void b(e eVar, Object obj, C0502n c0502n) {
        eVar.getClass();
        c0502n.resumeWith(Fe.e.z(eVar.r()));
    }

    public static final int d(e eVar, m mVar, int i5, Object obj, long j8, Object obj2, boolean z2) {
        eVar.getClass();
        mVar.n(i5, obj);
        if (z2) {
            return eVar.H(mVar, i5, obj, j8, obj2, z2);
        }
        Object objL = mVar.l(i5);
        if (objL == null) {
            if (eVar.g(j8)) {
                if (mVar.k(i5, null, g.f4807d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.k(i5, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof R0) {
            mVar.n(i5, null);
            if (eVar.E(objL, obj)) {
                mVar.o(i5, g.f4812i);
                return 0;
            }
            H6.g gVar = g.k;
            if (mVar.f4829f.getAndSet((i5 * 2) + 1, gVar) == gVar) {
                return 5;
            }
            mVar.m(i5, true);
            return 5;
        }
        return eVar.H(mVar, i5, obj, j8, obj2, z2);
    }

    public static void t(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4796e;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(Object obj, InterfaceC3103c interfaceC3103c) {
        C0502n c0502n = new C0502n(1, A6.h.A(interfaceC3103c));
        c0502n.t();
        c0502n.resumeWith(Fe.e.z(r()));
        Object objS = c0502n.s();
        return objS == kf.a.f39711a ? objS : C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(Gf.m r15, int r16, long r17, lf.AbstractC3464c r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.C(Gf.m, int, long, lf.c):java.lang.Object");
    }

    public final void D(R0 r02, boolean z2) {
        if (r02 instanceof InterfaceC0498l) {
            ((InterfaceC3103c) r02).resumeWith(Fe.e.z(z2 ? q() : r()));
            return;
        }
        if (r02 instanceof u) {
            ((u) r02).f4840a.resumeWith(new l(new j(p())));
            return;
        }
        if (!(r02 instanceof b)) {
            if (r02 instanceof Mf.i) {
                ((Mf.h) ((Mf.i) r02)).g(this, g.f4814l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + r02).toString());
            }
        }
        b bVar = (b) r02;
        C0502n c0502n = bVar.f4785b;
        AbstractC3340k.b(c0502n);
        bVar.f4785b = null;
        bVar.f4784a = g.f4814l;
        Throwable thP = bVar.f4786c.p();
        if (thP == null) {
            c0502n.resumeWith(Boolean.FALSE);
        } else {
            c0502n.resumeWith(Fe.e.z(thP));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof Mf.i) {
            return ((Mf.h) ((Mf.i) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof u) {
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.a(((u) obj).f4840a, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof InterfaceC0498l) {
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return g.a((InterfaceC0498l) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0502n c0502n = bVar.f4785b;
        AbstractC3340k.b(c0502n);
        bVar.f4785b = null;
        bVar.f4784a = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f4786c.getClass();
        return g.a(c0502n, bool, null);
    }

    public final boolean F(Object obj, m mVar, int i5) {
        Mf.k kVar;
        boolean z2 = obj instanceof InterfaceC0498l;
        C2515C c2515c = C2515C.f34653a;
        if (z2) {
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0498l) obj, c2515c, null);
        }
        if (!(obj instanceof Mf.i)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iG = ((Mf.h) obj).g(this, c2515c);
        if (iG == 0) {
            kVar = Mf.k.f7660a;
        } else if (iG == 1) {
            kVar = Mf.k.f7661b;
        } else if (iG == 2) {
            kVar = Mf.k.f7662c;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            kVar = Mf.k.f7663d;
        }
        if (kVar == Mf.k.f7661b) {
            mVar.n(i5, null);
        }
        return kVar == Mf.k.f7660a;
    }

    public final Object G(m mVar, int i5, long j8, Object obj) {
        Object objL = mVar.l(i5);
        AtomicReferenceArray atomicReferenceArray = mVar.f4829f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4793b;
        if (objL == null) {
            if (j8 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f4816n;
                }
                if (mVar.k(i5, objL, obj)) {
                    n();
                    return g.f4815m;
                }
            }
        } else if (objL == g.f4807d && mVar.k(i5, objL, g.f4812i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i5 * 2);
            mVar.n(i5, null);
            return obj2;
        }
        while (true) {
            Object objL2 = mVar.l(i5);
            if (objL2 == null || objL2 == g.f4808e) {
                if (j8 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.k(i5, objL2, g.f4811h)) {
                        n();
                        return g.f4817o;
                    }
                } else {
                    if (obj == null) {
                        return g.f4816n;
                    }
                    if (mVar.k(i5, objL2, obj)) {
                        n();
                        return g.f4815m;
                    }
                }
            } else if (objL2 != g.f4807d) {
                H6.g gVar = g.f4813j;
                if (objL2 == gVar) {
                    return g.f4817o;
                }
                if (objL2 == g.f4811h) {
                    return g.f4817o;
                }
                if (objL2 == g.f4814l) {
                    n();
                    return g.f4817o;
                }
                if (objL2 != g.f4810g && mVar.k(i5, objL2, g.f4809f)) {
                    boolean z2 = objL2 instanceof x;
                    if (z2) {
                        objL2 = ((x) objL2).f4841a;
                    }
                    if (F(objL2, mVar, i5)) {
                        mVar.o(i5, g.f4812i);
                        n();
                        Object obj3 = atomicReferenceArray.get(i5 * 2);
                        mVar.n(i5, null);
                        return obj3;
                    }
                    mVar.o(i5, gVar);
                    mVar.i();
                    if (z2) {
                        n();
                    }
                    return g.f4817o;
                }
            } else if (mVar.k(i5, objL2, g.f4812i)) {
                n();
                Object obj4 = atomicReferenceArray.get(i5 * 2);
                mVar.n(i5, null);
                return obj4;
            }
        }
    }

    public final int H(m mVar, int i5, Object obj, long j8, Object obj2, boolean z2) {
        while (true) {
            Object objL = mVar.l(i5);
            if (objL == null) {
                if (!g(j8) || z2) {
                    if (z2) {
                        if (mVar.k(i5, null, g.f4813j)) {
                            mVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.k(i5, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.k(i5, null, g.f4807d)) {
                    break;
                }
            } else {
                if (objL != g.f4808e) {
                    H6.g gVar = g.k;
                    if (objL == gVar) {
                        mVar.n(i5, null);
                        return 5;
                    }
                    if (objL == g.f4811h) {
                        mVar.n(i5, null);
                        return 5;
                    }
                    if (objL == g.f4814l) {
                        mVar.n(i5, null);
                        w();
                        return 4;
                    }
                    mVar.n(i5, null);
                    if (objL instanceof x) {
                        objL = ((x) objL).f4841a;
                    }
                    if (E(objL, obj)) {
                        mVar.o(i5, g.f4812i);
                        return 0;
                    }
                    if (mVar.f4829f.getAndSet((i5 * 2) + 1, gVar) != gVar) {
                        mVar.m(i5, true);
                    }
                    return 5;
                }
                if (mVar.k(i5, objL, g.f4807d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f4795d;
            if (atomicLongFieldUpdater.get(eVar) > j8) {
                break;
            } else {
                eVar = this;
            }
        }
        int i5 = g.f4806c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4796e;
            if (i10 < i5) {
                long j10 = atomicLongFieldUpdater.get(eVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j10 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(eVar);
                    long j13 = atomicLongFieldUpdater2.get(eVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z2 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + j14);
                    }
                    eVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // Gf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = Gf.e.f4793b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.u(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.g(r1)
            r1 = r1 ^ r10
        L1b:
            Gf.k r13 = Gf.l.f4826b
            if (r1 == 0) goto L20
            return r13
        L20:
            H6.g r6 = Gf.g.f4813j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Gf.e.f4797f
            java.lang.Object r1 = r1.get(r15)
            Gf.m r1 = (Gf.m) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.u(r2, r9)
            int r14 = Gf.g.f4805b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f6136c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            Gf.m r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.r()
            Gf.j r2 = new Gf.j
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            ef.C r3 = ef.C2515C.f34653a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.b()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = Gf.e.f4794c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.b()
        L8a:
            java.lang.Throwable r1 = r15.r()
            Gf.j r2 = new Gf.j
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.r()
            Gf.j r2 = new Gf.j
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof Ef.R0
            if (r3 == 0) goto Lb2
            Ef.R0 r6 = (Ef.R0) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.b(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.c(java.lang.Object):java.lang.Object");
    }

    @Override // Gf.v
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(true, cancellationException);
    }

    @Override // Gf.v
    public final Object e(If.t tVar) {
        return B(this, tVar);
    }

    @Override // Gf.v
    public final Object f() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4794c;
        long j8 = atomicLongFieldUpdater.get(this);
        long j10 = f4793b.get(this);
        if (u(j10, true)) {
            return new j(p());
        }
        long j11 = j10 & 1152921504606846975L;
        k kVar = l.f4826b;
        if (j8 >= j11) {
            return kVar;
        }
        Object obj = g.k;
        m mVar2 = (m) f4798g.get(this);
        while (!v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = g.f4805b;
            long j13 = andIncrement / j12;
            int i5 = (int) (andIncrement % j12);
            if (mVar2.f6136c != j13) {
                m mVarO = o(j13, mVar2);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar2;
            }
            Object objG = G(mVar, i5, andIncrement, obj);
            m mVar3 = mVar;
            if (objG == g.f4815m) {
                R0 r02 = obj instanceof R0 ? (R0) obj : null;
                if (r02 != null) {
                    r02.b(mVar3, i5);
                }
                I(andIncrement);
                mVar3.i();
                return kVar;
            }
            if (objG != g.f4817o) {
                if (objG == g.f4816n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.b();
                return objG;
            }
            if (andIncrement < s()) {
                mVar3.b();
            }
            mVar2 = mVar3;
        }
        return new j(p());
    }

    public final boolean g(long j8) {
        return j8 < f4795d.get(this) || j8 < f4794c.get(this) + ((long) this.f4802a);
    }

    public final boolean h(Throwable th) {
        return k(false, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173 A[RETURN] */
    @Override // Gf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.Object r24, jf.InterfaceC3103c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.i(java.lang.Object, jf.c):java.lang.Object");
    }

    @Override // Gf.v
    public final Object j(InterfaceC3103c interfaceC3103c) throws Throwable {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4798g;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4794c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = g.f4805b;
            long j10 = andIncrement / j8;
            int i5 = (int) (andIncrement % j8);
            if (mVar3.f6136c != j10) {
                m mVarO = o(j10, mVar3);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar3;
            }
            Object objG = G(mVar, i5, andIncrement, null);
            H6.g gVar = g.f4815m;
            if (objG == gVar) {
                throw new IllegalStateException("unexpected");
            }
            H6.g gVar2 = g.f4817o;
            if (objG == gVar2) {
                if (andIncrement < s()) {
                    mVar.b();
                }
                mVar3 = mVar;
            } else {
                if (objG != g.f4816n) {
                    mVar.b();
                    return objG;
                }
                C0502n c0502nV = H.v(A6.h.A(interfaceC3103c));
                e eVar = this;
                try {
                    Object objG2 = eVar.G(mVar, i5, andIncrement, c0502nV);
                    if (objG2 == gVar) {
                        c0502nV.b(mVar, i5);
                    } else {
                        if (objG2 == gVar2) {
                            if (andIncrement < s()) {
                                mVar.b();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (v()) {
                                    c0502nV.resumeWith(Fe.e.z(q()));
                                    break;
                                }
                                C0502n c0502n = c0502nV;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = g.f4805b;
                                    long j12 = andIncrement2 / j11;
                                    int i10 = (int) (andIncrement2 % j11);
                                    if (mVar4.f6136c != j12) {
                                        try {
                                            m mVarO2 = o(j12, mVar4);
                                            if (mVarO2 == null) {
                                                c0502nV = c0502n;
                                            } else {
                                                mVar2 = mVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0502nV = c0502n;
                                            c0502nV.A();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objG2 = eVar.G(mVar2, i10, andIncrement2, c0502n);
                                    m mVar5 = mVar2;
                                    c0502nV = c0502n;
                                    if (objG2 == g.f4815m) {
                                        c0502nV.b(mVar5, i10);
                                        break;
                                    }
                                    if (objG2 == g.f4817o) {
                                        if (andIncrement2 < s()) {
                                            mVar5.b();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (objG2 == g.f4816n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0502nV = c0502n;
                                    th = th;
                                    c0502nV.A();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.b();
                        }
                        c0502nV.g(objG2, null);
                    }
                    Object objS = c0502nV.s();
                    kf.a aVar = kf.a.f39711a;
                    return objS;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thQ = q();
        int i11 = Jf.s.f6137a;
        throw thQ;
    }

    public final boolean k(boolean z2, Throwable th) {
        e eVar;
        boolean z10;
        long j8;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4793b;
        if (!z2) {
            eVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f4804a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j13, (j13 & 1152921504606846975L) + (1 << 60)));
        H6.g gVar = g.f4821s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4800i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, gVar, th)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != gVar) {
                z10 = false;
                break;
            }
        }
        if (z2) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j8 >> 60);
                if (i5 == 0) {
                    j10 = j8 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i5 != 1) {
                        break;
                    }
                    j10 = j8 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j8, (j11 << 60) + j10));
        }
        w();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4801j;
                obj = atomicReferenceFieldUpdater2.get(this);
                H6.g gVar2 = obj == null ? g.f4819q : g.f4820r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, gVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                K.e(1, obj);
                ((tf.l) obj).invoke(p());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (Gf.m) ((Jf.c) Jf.c.f6105b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Gf.m l(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.l(long):Gf.m");
    }

    public final void m(long j8) {
        m mVar = (m) f4798g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4794c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f4802a + j10, f4795d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = g.f4805b;
                long j12 = j10 / j11;
                int i5 = (int) (j10 % j11);
                if (mVar.f6136c != j12) {
                    m mVarO = o(j12, mVar);
                    if (mVarO != null) {
                        mVar = mVarO;
                    }
                }
                m mVar2 = mVar;
                if (G(mVar2, i5, j10, null) != g.f4817o || j10 < s()) {
                    mVar2.b();
                }
                mVar = mVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.n():void");
    }

    public final m o(long j8, m mVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        m mVar2 = g.f4804a;
        f fVar = f.f4803a;
        loop0: while (true) {
            objB = Jf.b.b(mVar, j8, fVar);
            if (!Jf.b.e(objB)) {
                Jf.r rVarC = Jf.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4798g;
                    Jf.r rVar = (Jf.r) atomicReferenceFieldUpdater.get(this);
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
        if (Jf.b.e(objB)) {
            w();
            if (mVar.f6136c * g.f4805b < s()) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) Jf.b.c(objB);
            boolean zY = y();
            long j11 = mVar3.f6136c;
            if (!zY && j8 <= f4795d.get(this) / g.f4805b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4799h;
                    Jf.r rVar2 = (Jf.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f6136c >= j11 || !mVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (mVar3.f()) {
                                mVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j11 <= j8) {
                return mVar3;
            }
            long j12 = j11 * g.f4805b;
            do {
                atomicLongFieldUpdater = f4794c;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * g.f4805b < s()) {
                mVar3.b();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) f4800i.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new o("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new s0("Channel was closed", 3) : thP;
    }

    public final long s() {
        return f4793b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        r16 = r7;
        r3 = (Gf.m) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c2, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (Gf.m) ((Jf.c) Jf.c.f6105b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.u(long, boolean):boolean");
    }

    public final boolean v() {
        return u(f4793b.get(this), true);
    }

    public final boolean w() {
        return u(f4793b.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j8 = f4795d.get(this);
        return j8 == 0 || j8 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r5, Gf.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f6136c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Jf.c r0 = r7.c()
            Gf.m r0 = (Gf.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            Jf.c r5 = r7.c()
            Gf.m r5 = (Gf.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Gf.e.f4799h
            java.lang.Object r6 = r5.get(r4)
            Jf.r r6 = (Jf.r) r6
            long r0 = r6.f6136c
            long r2 = r7.f6136c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Gf.e.z(long, Gf.m):void");
    }
}
