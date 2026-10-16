package Lf;

import A7.AbstractC0279p0;
import E5.Q;
import Ef.H;
import Jf.p;
import R8.v;
import cb.AbstractC1593a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7110h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7111i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7112j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final H6.g k = new H6.g("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f7113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7114b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7115c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f7116d;

    /* renamed from: e, reason: collision with root package name */
    public final f f7117e;

    /* renamed from: f, reason: collision with root package name */
    public final f f7118f;

    /* renamed from: g, reason: collision with root package name */
    public final p f7119g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i5, long j8, int i10, String str) {
        this.f7113a = i5;
        this.f7114b = i10;
        this.f7115c = j8;
        this.f7116d = str;
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(v.e(i10, i5, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(AbstractC1593a.h(j8, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f7117e = new f();
        this.f7118f = new f();
        this.f7119g = new p((i5 + 1) * 2);
        this.controlState$volatile = i5 << 42;
    }

    public static /* synthetic */ void h(c cVar, Runnable runnable, int i5) {
        cVar.d(runnable, false, (i5 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f7119g) {
            try {
                if (f7112j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7111i;
                long j8 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j8 & 2097151);
                int i10 = i5 - ((int) ((j8 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f7113a) {
                    return 0;
                }
                if (i5 >= this.f7114b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f7119g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f7119g.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Lf.c.f7112j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof Lf.a
            r3 = 0
            if (r1 == 0) goto L17
            Lf.a r0 = (Lf.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            Lf.c r1 = r0.f7103h
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            Jf.p r1 = r8.f7119g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = Lf.c.f7111i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            Jf.p r5 = r8.f7119g
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            Lf.a r5 = (Lf.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            Lf.m r5 = r5.f7096a
            Lf.f r6 = r8.f7118f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Lf.m.f7135b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            Lf.i r7 = (Lf.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            Lf.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            Lf.f r1 = r8.f7118f
            r1.b()
            Lf.f r1 = r8.f7117e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            Lf.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            Lf.f r1 = r8.f7117e
            java.lang.Object r1 = r1.d()
            Lf.i r1 = (Lf.i) r1
            if (r1 != 0) goto Lb2
            Lf.f r1 = r8.f7118f
            java.lang.Object r1 = r1.d()
            Lf.i r1 = (Lf.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            Lf.b r1 = Lf.b.f7108e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Lf.c.f7110h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Lf.c.f7111i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.c.close():void");
    }

    public final void d(Runnable runnable, boolean z2, boolean z10) {
        i jVar;
        b bVar;
        k.f7133f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7125a = jNanoTime;
            jVar.f7126b = z2;
        } else {
            jVar = new j(runnable, jNanoTime, z2);
        }
        boolean z11 = jVar.f7126b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7111i;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !AbstractC3340k.a(aVar.f7103h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7098c) != b.f7108e && (jVar.f7126b || bVar != b.f7105b)) {
            aVar.f7102g = true;
            m mVar = aVar.f7096a;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7135b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7126b ? this.f7118f.a(jVar) : this.f7117e.a(jVar))) {
                throw new RejectedExecutionException(wg.b.c(new StringBuilder(), this.f7116d, " was terminated"));
            }
        }
        if (z11) {
            if (w() || o(jAddAndGet)) {
                return;
            }
            w();
            return;
        }
        if (w() || o(atomicLongFieldUpdater.get(this))) {
            return;
        }
        w();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, 6);
    }

    public final void i(a aVar, int i5, int i10) {
        while (true) {
            long j8 = f7110h.get(this);
            int i11 = (int) (2097151 & j8);
            long j10 = (2097152 + j8) & (-2097152);
            if (i11 == i5) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == k) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f7110h.compareAndSet(this, j8, i11 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean o(long j8) {
        int i5 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i5 < 0) {
            i5 = 0;
        }
        int i10 = this.f7113a;
        if (i5 < i10) {
            int iB = b();
            if (iB == 1 && i10 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f7119g;
        int iA = pVar.a();
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) pVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f7096a;
                mVar.getClass();
                int i15 = m.f7135b.get(mVar) != null ? (m.f7136c.get(mVar) - m.f7137d.get(mVar)) + 1 : m.f7136c.get(mVar) - m.f7137d.get(mVar);
                int iOrdinal = aVar.f7098c.ordinal();
                if (iOrdinal == 0) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new Q((byte) 0, 9);
                    }
                    i13++;
                }
            }
        }
        long j8 = f7111i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7116d);
        sb5.append('@');
        sb5.append(H.t(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f7113a;
        sb5.append(i16);
        sb5.append(", max = ");
        v.i(this.f7114b, i5, "}, Worker States {CPU = ", ", blocking = ", sb5);
        v.i(i10, i11, ", parked = ", ", dormant = ", sb5);
        v.i(i12, i13, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f7117e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f7118f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j8));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j8) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean w() {
        H6.g gVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7110h;
            long j8 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f7119g.b((int) (2097151 & j8));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j8) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    gVar = k;
                    if (objC == gVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j8, j10 | iB)) {
                    aVar.g(gVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7095i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
