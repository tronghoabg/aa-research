package kotlinx.coroutines.f;

import h.g.b.x;
import h.k.n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.e.ag;
import kotlinx.coroutines.e.ak;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final ak f51947a = new ak("NOT_IN_STACK");

    /* renamed from: b, reason: collision with root package name */
    public final int f51948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51950d;

    /* renamed from: e, reason: collision with root package name */
    public final String f51951e;

    /* renamed from: f, reason: collision with root package name */
    public final ag f51952f;

    /* renamed from: g, reason: collision with root package name */
    public final com.waze.bl.b.c.a f51953g;

    /* renamed from: h, reason: collision with root package name */
    public final com.waze.bl.b.c.a f51954h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.a.c f51955i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.a.c f51956j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.a.a f51957k;

    public c(int i2, int i3, long j2, String str) {
        this.f51948b = i2;
        this.f51949c = i3;
        this.f51950d = j2;
        this.f51951e = str;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Core pool size " + i2 + " should be at least 1");
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2);
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150");
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j2 + " must be positive");
        }
        this.f51953g = new com.waze.bl.b.c.a(null, null);
        this.f51954h = new com.waze.bl.b.c.a(null, null);
        this.f51955i = h.e.b.g(0L);
        int i4 = i2 + 1;
        this.f51952f = new ag(i4 + i4);
        this.f51956j = h.e.b.g(i2 << 42);
        this.f51957k = h.e.b.e(false);
    }

    public static /* synthetic */ void f(c cVar, Runnable runnable, boolean z, int i2) {
        cVar.b(runnable, false, z & ((i2 & 4) == 0));
    }

    public static final void h(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int i() {
        ag agVar = this.f51952f;
        synchronized (agVar) {
            if (e()) {
                return -1;
            }
            kotlinx.a.c cVar = this.f51956j;
            long jD = cVar.d();
            int i2 = (int) (jD & 2097151);
            int iH = n.h(i2 - ((int) ((jD & 4398044413952L) >> 21)), 0);
            if (iH >= this.f51948b) {
                return 0;
            }
            if (i2 >= this.f51949c) {
                return 0;
            }
            int iD = ((int) (cVar.d() & 2097151)) + 1;
            if (agVar.b(iD) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            a aVar = new a(this, iD);
            agVar.c(iD, aVar);
            if (iD != ((int) (2097151 & cVar.e()))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iH + 1;
            aVar.start();
            return i3;
        }
    }

    private final a j() {
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !x.n(aVar.f51934c, this)) {
            return null;
        }
        return aVar;
    }

    private final boolean k(long j2) {
        int iH = n.h(((int) (j2 & 2097151)) - ((int) ((4398044413952L & j2) >> 21)), 0);
        int i2 = this.f51948b;
        if (iH < i2) {
            int i3 = i();
            if (i3 == 1) {
                if (i2 > 1) {
                    i();
                }
            } else if (i3 <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean l() {
        a aVar;
        do {
            kotlinx.a.c cVar = this.f51955i;
            while (true) {
                long jD = cVar.d();
                aVar = (a) this.f51952f.b((int) (2097151 & jD));
                if (aVar != null) {
                    long j2 = 2097152 + jD;
                    int iM = m(aVar);
                    if (iM >= 0 && cVar.g(jD, (j2 & (-2097152)) | iM)) {
                        aVar.g(f51947a);
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar == null) {
                return false;
            }
        } while (!aVar.d().g(-1, 0));
        LockSupport.unpark(aVar);
        return true;
    }

    private static final int m(a aVar) {
        Object objC = aVar.c();
        while (objC != f51947a) {
            if (objC == null) {
                return 0;
            }
            a aVar2 = (a) objC;
            int iA = aVar2.a();
            if (iA != 0) {
                return iA;
            }
            objC = aVar2.c();
        }
        return -1;
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        j jVar;
        long jA = k.f51972f.a();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f51964f = jA;
            jVar.f51965g = z;
        } else {
            jVar = new j(runnable, jA, z);
        }
        boolean z3 = jVar.f51965g;
        long jA2 = z3 ? this.f51956j.a(2097152L) : 0L;
        a aVarJ = j();
        if (aVarJ != null && aVarJ.f51932a != b.f51945e && (jVar.f51965g || aVarJ.f51932a != b.f51942b)) {
            aVarJ.f51933b = true;
            jVar = aVarJ.f51935d.e(jVar, z2);
        }
        if (jVar != null) {
            if (!(jVar.f51965g ? this.f51954h.h(jVar) : this.f51953g.h(jVar))) {
                throw new RejectedExecutionException(String.valueOf(this.f51951e).concat(" was terminated"));
            }
        }
        if (!z3) {
            d();
        } else {
            if (l() || k(jA2)) {
                return;
            }
            l();
        }
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            kotlinx.a.c cVar = this.f51955i;
            long jD = cVar.d();
            long j2 = 2097152 + jD;
            int iM = (int) (2097151 & jD);
            if (iM == i2) {
                iM = i3 == 0 ? m(aVar) : i3;
            }
            if (iM >= 0) {
                if (cVar.g(jD, iM | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r7 = this;
            kotlinx.a.a r0 = r7.f51957k
            r1 = 0
            r2 = 1
            boolean r0 = r0.b(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.f.a r0 = r7.j()
            kotlinx.coroutines.e.ag r1 = r7.f51952f
            monitor-enter(r1)
            kotlinx.a.c r3 = r7.f51956j     // Catch: java.lang.Throwable -> L8c
            long r3 = r3.d()     // Catch: java.lang.Throwable -> L8c
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            monitor-exit(r1)
            int r1 = (int) r3
            if (r1 <= 0) goto L50
            r3 = r2
        L21:
            kotlinx.coroutines.e.ag r4 = r7.f51952f
            java.lang.Object r4 = r4.b(r3)
            h.g.b.x.c(r4)
            kotlinx.coroutines.f.a r4 = (kotlinx.coroutines.f.a) r4
            if (r4 == r0) goto L4b
        L2e:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L42
            r5 = r4
            java.lang.Thread r5 = (java.lang.Thread) r5
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2e
        L42:
            int r5 = kotlinx.coroutines.ai.f51347a
            com.waze.push.j r4 = r4.f51935d
            com.waze.bl.b.c.a r5 = r7.f51954h
            r4.h(r5)
        L4b:
            if (r3 == r1) goto L50
            int r3 = r3 + 1
            goto L21
        L50:
            com.waze.bl.b.c.a r3 = r7.f51954h
            r3.g()
            com.waze.bl.b.c.a r4 = r7.f51953g
            r4.g()
        L5a:
            if (r0 == 0) goto L62
            kotlinx.coroutines.f.i r1 = r0.e(r2)
            if (r1 != 0) goto L88
        L62:
            java.lang.Object r1 = r4.f()
            kotlinx.coroutines.f.i r1 = (kotlinx.coroutines.f.i) r1
            if (r1 != 0) goto L88
            java.lang.Object r1 = r3.f()
            kotlinx.coroutines.f.i r1 = (kotlinx.coroutines.f.i) r1
            if (r1 != 0) goto L88
            if (r0 == 0) goto L79
            kotlinx.coroutines.f.b r1 = kotlinx.coroutines.f.b.f51945e
            r0.h(r1)
        L79:
            int r0 = kotlinx.coroutines.ai.f51347a
            kotlinx.a.c r0 = r7.f51955i
            r1 = 0
            r0.f(r1)
            kotlinx.a.c r7 = r7.f51956j
            r7.f(r1)
            return
        L88:
            h(r1)
            goto L5a
        L8c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.c.close():void");
    }

    public final void d() {
        if (l() || k(this.f51956j.d())) {
            return;
        }
        l();
    }

    public final boolean e() {
        return this.f51957k.c();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, false, 6);
    }

    public final void g(a aVar) {
        long jD;
        int iA;
        if (aVar.c() != f51947a) {
            return;
        }
        kotlinx.a.c cVar = this.f51955i;
        do {
            jD = cVar.d();
            iA = aVar.a();
            int i2 = ai.f51347a;
            aVar.g(this.f51952f.b((int) (2097151 & jD)));
        } while (!cVar.g(jD, ((-2097152) & (2097152 + jD)) | iA));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ag agVar = this.f51952f;
        int iA = agVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            a aVar = (a) agVar.b(i7);
            if (aVar != null) {
                int iC = aVar.f51935d.c();
                b bVar = aVar.f51932a;
                b bVar2 = b.f51941a;
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 0) {
                    arrayList.add(iC + "c");
                    i2++;
                } else if (iOrdinal == 1) {
                    arrayList.add(iC + "b");
                    i3++;
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (iC > 0) {
                        arrayList.add(iC + "d");
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new h.i();
                    }
                    i6++;
                }
            }
        }
        kotlinx.a.c cVar = this.f51956j;
        String str = this.f51951e;
        long jD = cVar.d();
        String strB = aj.b(this);
        int i8 = this.f51948b;
        int i9 = this.f51949c;
        com.waze.bl.b.c.a aVar2 = this.f51953g;
        com.waze.bl.b.c.a aVar3 = this.f51954h;
        long j2 = 2097151 & jD;
        long j3 = jD & 4398044413952L;
        long j4 = jD & 9223367638808264704L;
        return str + "@" + strB + "[Pool Size {core = " + i8 + ", max = " + i9 + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + aVar2.e() + ", global blocking queue size = " + aVar3.e() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i8 - ((int) (j4 >> 42))) + "}]";
    }
}
