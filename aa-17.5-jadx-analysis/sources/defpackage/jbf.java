package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class jbf extends Thread implements jcg {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public static final ypf b = ols.R("CAR.GAL.AUDIO");
    private static final long p = 3000000000L;
    private static final long q = 10000000000L;
    public long c;
    public long d;
    public final boolean e;
    protected final jac f;
    public final BiFunction g;
    protected volatile boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    public final jbe[] l;
    public final AtomicLong m;
    public final boolean n;
    public final izj o;
    private long r;
    private final Map s;
    private final Object t;
    private final Context u;
    private final ArrayDeque v;
    private final jbc w;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[PHI: r7
  0x0094: PHI (r7v14 long) = (r7v11 long), (r7v22 long) binds: [B:22:0x0091, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected jbf(defpackage.jac r6, defpackage.izj r7, android.content.Context r8, defpackage.izz r9, java.util.function.BiFunction r10) {
        /*
            r5 = this;
            java.lang.String r0 = "PerChannelWriterThread"
            r5.<init>(r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.r = r0
            r5.c = r0
            r5.d = r0
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r5.t = r2
            r2 = 0
            r5.h = r2
            r5.i = r2
            r5.j = r2
            r5.k = r2
            r2 = 256(0x100, float:3.59E-43)
            jbe[] r2 = new defpackage.jbe[r2]
            r5.l = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r5.v = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r3 = 1
            r2.<init>(r3)
            r5.m = r2
            jbc r2 = new jbc
            r2.<init>(r5)
            r5.w = r2
            r5.f = r6
            r5.o = r7
            r5.u = r8
            r5.g = r10
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.s = r6
            jbu r6 = r9.d
            boolean r7 = r9.c
            if (r7 == 0) goto L97
            int r7 = r9.e
            r8 = 2
            r9 = 0
            r2 = 1000000(0xf4240, double:4.940656E-318)
            if (r7 != r8) goto L78
            long r7 = r6.e
            long r7 = r7 * r2
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L64
            r7 = r0
        L64:
            r5.r = r7
            long r7 = r6.g
            long r7 = r7 * r2
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L6e
            r7 = r0
        L6e:
            r5.c = r7
            long r7 = r6.i
            long r7 = r7 * r2
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L94
            goto L95
        L78:
            long r7 = r6.f
            long r7 = r7 * r2
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L80
            r7 = r0
        L80:
            r5.r = r7
            long r7 = r6.h
            long r7 = r7 * r2
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L8a
            r7 = r0
        L8a:
            r5.c = r7
            long r7 = r6.j
            long r7 = r7 * r2
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L94
            goto L95
        L94:
            r0 = r7
        L95:
            r5.d = r0
        L97:
            boolean r7 = r6.d
            r5.e = r7
            boolean r6 = r6.l
            r5.n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbf.<init>(jac, izj, android.content.Context, izz, java.util.function.BiFunction):void");
    }

    private final synchronized void l() {
        ArrayDeque arrayDeque = this.v;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((jbe) it.next()).k();
        }
        arrayDeque.clear();
    }

    protected final synchronized long a() {
        long j;
        Iterator it = this.v.iterator();
        j = 1000000;
        while (it.hasNext()) {
            long jB = ((jbe) it.next()).b();
            if (jB > 0 && jB < j) {
                j = jB;
            }
        }
        return j;
    }

    protected final synchronized jbe b() {
        int i;
        int i2;
        jbe jbeVar = null;
        if (this.i) {
            return null;
        }
        d();
        Iterator it = this.v.iterator();
        jeb jebVar = null;
        while (it.hasNext()) {
            jbe jbeVar2 = (jbe) it.next();
            if (jbeVar2.b() <= 0) {
                jeb jebVarD = jbeVar2.d();
                if (jebVar == null || jbeVar == null || (i = jebVarD.j) < (i2 = jebVar.j)) {
                    jbeVar = jbeVar2;
                    jebVar = jebVarD;
                } else if (this.e && i == i2 && jbeVar2.c().k < jbeVar.c().k) {
                    jbeVar = jbeVar2;
                }
            }
        }
        jbc jbcVar = this.w;
        if (jbeVar == null) {
            jbcVar.b = 0L;
            jbcVar.a = 0L;
        } else {
            jeb jebVar2 = jeb.FIRST;
            switch (jbeVar.d().ordinal()) {
                case 2:
                case 3:
                case 7:
                    jbf jbfVar = jbcVar.c;
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    if (jElapsedRealtimeNanos - jbcVar.b > 500000000) {
                        jbcVar.a = jElapsedRealtimeNanos;
                    }
                    jbcVar.b = jElapsedRealtimeNanos;
                    break;
                case 4:
                case 5:
                case 6:
                    jbcVar.b = 0L;
                    jbcVar.a = 0L;
                    return jbeVar;
            }
        }
        return jbeVar;
    }

    public final synchronized void c(jbe jbeVar) {
        this.v.add(jbeVar);
        notify();
    }

    protected final synchronized void d() {
        ArrayDeque arrayDeque = this.v;
        if (!arrayDeque.isEmpty()) {
            AtomicLong atomicLong = ((jbe) arrayDeque.getFirst()).g;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = atomicLong.get();
            long j2 = 0;
            long j3 = j == 0 ? 0L : jElapsedRealtimeNanos - j;
            if (j3 > this.r) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((jbe) it.next()).f();
                }
                f(yxi.FRAMER_WRITER_STALL);
                a.h().l(3, TimeUnit.SECONDS).ai(1768).u("Stall detected, evicting audio.");
            }
            jbc jbcVar = this.w;
            jbf jbfVar = jbcVar.c;
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos2 - jbcVar.b <= 500000000) {
                j2 = jElapsedRealtimeNanos2 - jbcVar.a;
            }
            long jMin = Math.min(j3, j2);
            if (jMin > p) {
                a.h().l(1, TimeUnit.SECONDS).ai(1767).x("Synchronous mode detected for %d milliseconds.", jMin / 1000000);
            }
            if (jMin > q) {
                f(yxi.FRAMER_WRITER_SYNCHRONOUS_MODE);
            }
        }
    }

    @Override // defpackage.jcg
    public final synchronized void e() {
        a.l().ai(1769).u("Shutting down PerChannelWriterThread after packets have been written.");
        this.j = true;
        this.h = false;
        notify();
    }

    protected final void f(yxi yxiVar) {
        boolean z;
        Context context;
        synchronized (this.t) {
            Map map = this.s;
            z = true;
            if (map.containsKey(yxiVar)) {
                if (SystemClock.elapsedRealtimeNanos() - ((Long) map.get(yxiVar)).longValue() <= 30000000000L) {
                    z = false;
                }
            }
            map.put(yxiVar, Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        }
        if (!z || (context = this.u) == null) {
            return;
        }
        ols.M(context, yxiVar);
    }

    public final synchronized void g(jbe jbeVar) {
        ArrayDeque arrayDeque = this.v;
        arrayDeque.remove(jbeVar);
        arrayDeque.add(jbeVar);
    }

    public final synchronized void h(jbe jbeVar) {
        this.v.remove(jbeVar);
    }

    @Override // defpackage.jcg
    public final synchronized void i() {
        if (this.h) {
            return;
        }
        this.h = true;
        start();
    }

    @Override // defpackage.jcg
    public final synchronized void j() {
        a.l().ai(1778).u("Shutting down PerChannelWriterThread immediately");
        this.i = true;
        this.h = false;
        notify();
    }

    @Override // defpackage.jcg
    public final synchronized boolean k() {
        return this.h;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IOException, IllegalArgumentException {
        Process.setThreadPriority(-19);
        while (true) {
            try {
                jbe jbeVarB = b();
                if (jbeVarB == null) {
                    if (this.k) {
                        jac jacVar = this.f;
                        if (jacVar.c) {
                            jacVar.d.flush();
                        }
                        this.k = false;
                    }
                    synchronized (this) {
                        while (true) {
                            jbeVarB = b();
                            if (jbeVarB != null || this.j || this.i) {
                                break;
                            }
                            jbc jbcVar = this.w;
                            jbcVar.b = 0L;
                            jbcVar.a = 0L;
                            wait(a());
                        }
                    }
                }
                if (jbeVarB == null) {
                    a.f().ai(1779).u("Draining all write queues since writer thread is finishing up.");
                    l();
                    return;
                }
                jbeVarB.i();
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ypf ypfVar = a;
                ypfVar.f().p(e).ai(1774).u("Exception received: ");
                synchronized (this) {
                    boolean z = this.h;
                    this.h = false;
                    yop yopVarG = ypfVar.g();
                    if (z) {
                        yopVarG.ai(1776).u("WriterThread: exiting due to IO error");
                        this.o.a(yzf.WRITER_IO_ERROR);
                        return;
                    } else {
                        yopVarG.p(e).ai(1775).u("WriterThread: crashing with exception");
                        this.o.a(yzf.WRITER_UNKNOWN_EXCEPTION);
                        return;
                    }
                }
            }
        }
    }
}
