package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0479b0 extends AbstractC0481c0 implements M {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3713f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0479b0.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3714g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0479b0.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3715h = AtomicIntegerFieldUpdater.newUpdater(AbstractC0479b0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // Ef.AbstractC0481c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long P() {
        /*
            r10 = this;
            boolean r0 = r10.Q()
            r1 = 0
            if (r0 == 0) goto La
            goto Lb1
        La:
            r10.X()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Ef.AbstractC0479b0.f3713f
            java.lang.Object r3 = r0.get(r10)
            H6.g r4 = Ef.H.f3670c
            r5 = 0
            if (r3 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r3 instanceof Jf.m
            if (r6 == 0) goto L3e
            r6 = r3
            Jf.m r6 = (Jf.m) r6
            java.lang.Object r7 = r6.d()
            H6.g r8 = Jf.m.f6127g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            Jf.m r6 = r6.c()
        L30:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L37
            goto Ld
        L37:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L30
            goto Ld
        L3e:
            if (r3 != r4) goto L41
            goto L18
        L41:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r1
        L50:
            ff.l r3 = r10.f3723d
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L62
            goto L59
        L62:
            r8 = r1
        L63:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L68
            goto Lb1
        L68:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L90
            boolean r3 = r0 instanceof Jf.m
            if (r3 == 0) goto L8d
            Jf.m r0 = (Jf.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = Jf.m.f6126f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto L8c
            goto L90
        L8c:
            return r1
        L8d:
            if (r0 != r4) goto Lb1
            goto Lb6
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Ef.AbstractC0479b0.f3714g
            java.lang.Object r0 = r0.get(r10)
            Ef.a0 r0 = (Ef.C0477a0) r0
            if (r0 == 0) goto Lb6
            monitor-enter(r0)
            Ef.Z[] r3 = r0.f6144a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La2
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La2:
            monitor-exit(r0)
            if (r5 != 0) goto La6
            goto Lb6
        La6:
            long r3 = r5.f3708a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r6
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L41
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.AbstractC0479b0.P():long");
    }

    public void W(Runnable runnable) {
        X();
        if (!Y(runnable)) {
            I.f3678i.W(runnable);
            return;
        }
        Thread threadD = D();
        if (Thread.currentThread() != threadD) {
            LockSupport.unpark(threadD);
        }
    }

    public final void X() {
        Z zC;
        C0477a0 c0477a0 = (C0477a0) f3714g.get(this);
        if (c0477a0 == null || Jf.w.f6143b.get(c0477a0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0477a0) {
                try {
                    Z[] zArr = c0477a0.f6144a;
                    Z z2 = zArr != null ? zArr[0] : null;
                    if (z2 != null) {
                        zC = ((jNanoTime - z2.f3708a) > 0L ? 1 : ((jNanoTime - z2.f3708a) == 0L ? 0 : -1)) >= 0 ? Y(z2) : false ? c0477a0.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (zC != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Ef.AbstractC0479b0.f3713f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Ef.AbstractC0479b0.f3715h
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof Jf.m
            if (r2 == 0) goto L4c
            r2 = r1
            Jf.m r2 = (Jf.m) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            Jf.m r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            H6.g r2 = Ef.H.f3670c
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            Jf.m r2 = new Jf.m
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.AbstractC0479b0.Y(java.lang.Runnable):boolean");
    }

    public final boolean Z() {
        C0477a0 c0477a0;
        ff.l lVar = this.f3723d;
        if (!(lVar != null ? lVar.isEmpty() : true) || ((c0477a0 = (C0477a0) f3714g.get(this)) != null && Jf.w.f6143b.get(c0477a0) != 0)) {
            return false;
        }
        Object obj = f3713f.get(this);
        if (obj != null) {
            if (obj instanceof Jf.m) {
                long j8 = Jf.m.f6126f.get((Jf.m) obj);
                return ((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30));
            }
            if (obj != H.f3670c) {
                return false;
            }
        }
        return true;
    }

    public final void a0(long j8, Z z2) {
        int iC;
        Thread threadD;
        boolean z10 = f3715h.get(this) == 1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3714g;
        if (z10) {
            iC = 1;
        } else {
            C0477a0 c0477a0 = (C0477a0) atomicReferenceFieldUpdater.get(this);
            if (c0477a0 == null) {
                C0477a0 c0477a02 = new C0477a0();
                c0477a02.f3711c = j8;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0477a02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC3340k.b(obj);
                c0477a0 = (C0477a0) obj;
            }
            iC = z2.c(j8, c0477a0, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                V(j8, z2);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0477a0 c0477a03 = (C0477a0) atomicReferenceFieldUpdater.get(this);
        if (c0477a03 != null) {
            synchronized (c0477a03) {
                Z[] zArr = c0477a03.f6144a;
                z = zArr != null ? zArr[0] : null;
            }
        }
        if (z != z2 || Thread.currentThread() == (threadD = D())) {
            return;
        }
        LockSupport.unpark(threadD);
    }

    public U b(long j8, M0 m02, InterfaceC3108h interfaceC3108h) {
        return J.f3680a.b(j8, m02, interfaceC3108h);
    }

    @Override // Ef.M
    public final void h(long j8, C0502n c0502n) {
        long j10 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            X x5 = new X(this, j10 + jNanoTime, c0502n);
            a0(jNanoTime, x5);
            c0502n.w(new C0494j(x5, 2));
        }
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        W(runnable);
    }

    @Override // Ef.AbstractC0481c0
    public void shutdown() {
        Z zC;
        J0.f3681a.set(null);
        f3715h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3713f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            H6.g gVar = H.f3670c;
            if (obj != null) {
                if (!(obj instanceof Jf.m)) {
                    if (obj != gVar) {
                        Jf.m mVar = new Jf.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Jf.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (P() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0477a0 c0477a0 = (C0477a0) f3714g.get(this);
            if (c0477a0 == null) {
                return;
            }
            synchronized (c0477a0) {
                zC = Jf.w.f6143b.get(c0477a0) > 0 ? c0477a0.c(0) : null;
            }
            if (zC == null) {
                return;
            } else {
                V(jNanoTime, zC);
            }
        }
    }
}
