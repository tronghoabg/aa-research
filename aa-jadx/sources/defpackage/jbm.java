package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jbm extends java.lang.Thread implements defpackage.jcn {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public static final defpackage.yqk b = defpackage.omv.n("CAR.GAL.AUDIO");
    private static final long q = 3000000000L;
    private static final long r = 10000000000L;
    public long c;
    public long d;
    public final boolean e;
    protected final defpackage.jaj f;
    public final java.util.function.BiFunction g;
    protected volatile boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    public final defpackage.jbl[] l;
    public final java.util.concurrent.atomic.AtomicLong m;
    public final boolean n;
    public final boolean o;
    public final defpackage.izq p;
    private long s;
    private final java.util.Map t;
    private final java.lang.Object u;
    private final android.content.Context v;
    private final java.util.ArrayDeque w;
    private final defpackage.jbj x;

    /* JADX WARN: Code duplicated, block: B:24:0x0094 A[PHI: r7
  0x0094: PHI (r7v15 long) = (r7v12 long), (r7v23 long) binds: [B:22:0x0091, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    protected jbm(defpackage.jaj jajVar, defpackage.izq izqVar, android.content.Context context, defpackage.jag jagVar, java.util.function.BiFunction biFunction) {
        long j;
        super("PerChannelWriterThread");
        long j2 = Long.MAX_VALUE;
        this.s = Long.MAX_VALUE;
        this.c = Long.MAX_VALUE;
        this.d = Long.MAX_VALUE;
        this.u = new java.lang.Object();
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new defpackage.jbl[256];
        this.w = new java.util.ArrayDeque();
        this.m = new java.util.concurrent.atomic.AtomicLong(1L);
        this.x = new defpackage.jbj(this);
        this.f = jajVar;
        this.p = izqVar;
        this.v = context;
        this.g = biFunction;
        this.t = new java.util.HashMap();
        defpackage.jcb jcbVar = jagVar.d;
        if (jagVar.c) {
            if (jagVar.e == 2) {
                long j3 = jcbVar.e * 1000000;
                this.s = j3 == 0 ? Long.MAX_VALUE : j3;
                long j4 = jcbVar.g * 1000000;
                this.c = j4 == 0 ? Long.MAX_VALUE : j4;
                j = jcbVar.i * 1000000;
                if (j != 0) {
                    j2 = j;
                }
            } else {
                long j5 = jcbVar.f * 1000000;
                this.s = j5 == 0 ? Long.MAX_VALUE : j5;
                long j6 = jcbVar.h * 1000000;
                this.c = j6 == 0 ? Long.MAX_VALUE : j6;
                j = jcbVar.j * 1000000;
                if (j != 0) {
                    j2 = j;
                }
            }
            this.d = j2;
        }
        this.e = jcbVar.d;
        this.n = jcbVar.l;
        this.o = jcbVar.q;
    }

    private final synchronized void l() {
        java.util.ArrayDeque arrayDeque = this.w;
        java.util.Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((defpackage.jbl) it.next()).k();
        }
        arrayDeque.clear();
    }

    protected final synchronized long a() {
        long j;
        java.util.Iterator it = this.w.iterator();
        j = 1000000;
        while (it.hasNext()) {
            long jB = ((defpackage.jbl) it.next()).b();
            if (jB > 0 && jB < j) {
                j = jB;
            }
        }
        return j;
    }

    protected final synchronized defpackage.jbl b() {
        int i;
        int i2;
        defpackage.jbl jblVar = null;
        if (this.i) {
            return null;
        }
        d();
        defpackage.jei jeiVar = null;
        for (defpackage.jbl jblVar2 : this.w) {
            if (jblVar2.b() <= 0) {
                defpackage.jei jeiVarD = jblVar2.d();
                if (jeiVar == null || jblVar == null || (i = jeiVarD.j) < (i2 = jeiVar.j)) {
                    jblVar = jblVar2;
                    jeiVar = jeiVarD;
                } else if (this.e && i == i2 && jblVar2.c().k < jblVar.c().k) {
                    jblVar = jblVar2;
                }
            }
        }
        defpackage.jbj jbjVar = this.x;
        if (jblVar == null) {
            jbjVar.b = 0L;
            jbjVar.a = 0L;
        } else {
            defpackage.jei jeiVar2 = defpackage.jei.FIRST;
            switch (jblVar.d().ordinal()) {
                case 2:
                case 3:
                case 7:
                    defpackage.jbm jbmVar = jbjVar.c;
                    long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    if (jElapsedRealtimeNanos - jbjVar.b > 500000000) {
                        jbjVar.a = jElapsedRealtimeNanos;
                    }
                    jbjVar.b = jElapsedRealtimeNanos;
                    break;
                case 4:
                case 5:
                case 6:
                    jbjVar.b = 0L;
                    jbjVar.a = 0L;
                    return jblVar;
            }
        }
        return jblVar;
    }

    public final synchronized void c(defpackage.jbl jblVar) {
        this.w.add(jblVar);
        notify();
    }

    protected final synchronized void d() {
        java.util.ArrayDeque arrayDeque = this.w;
        if (!arrayDeque.isEmpty()) {
            java.util.concurrent.atomic.AtomicLong atomicLong = ((defpackage.jbl) arrayDeque.getFirst()).g;
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            long j = atomicLong.get();
            long j2 = 0;
            long j3 = j == 0 ? 0L : jElapsedRealtimeNanos - j;
            if (j3 > this.s && !this.o) {
                java.util.Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((defpackage.jbl) it.next()).f();
                }
                a.h().l(3, java.util.concurrent.TimeUnit.SECONDS).ai(1768).u("Stall detected, evicting audio.");
                f(defpackage.yyn.FRAMER_WRITER_STALL);
            }
            defpackage.jbj jbjVar = this.x;
            defpackage.jbm jbmVar = jbjVar.c;
            long jElapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos2 - jbjVar.b <= 500000000) {
                j2 = jElapsedRealtimeNanos2 - jbjVar.a;
            }
            long jMin = java.lang.Math.min(j3, j2);
            if (jMin > q) {
                a.h().l(1, java.util.concurrent.TimeUnit.SECONDS).ai(1767).x("Synchronous mode detected for %d milliseconds.", jMin / 1000000);
            }
            if (jMin > r) {
                f(defpackage.yyn.FRAMER_WRITER_SYNCHRONOUS_MODE);
            }
        }
    }

    @Override // defpackage.jcn
    public final synchronized void e() {
        a.l().ai(1769).u("Shutting down PerChannelWriterThread after packets have been written.");
        this.j = true;
        this.h = false;
        notify();
    }

    protected final void f(defpackage.yyn yynVar) {
        boolean z;
        android.content.Context context;
        synchronized (this.u) {
            java.util.Map map = this.t;
            z = true;
            if (map.containsKey(yynVar)) {
                if (android.os.SystemClock.elapsedRealtimeNanos() - ((java.lang.Long) map.get(yynVar)).longValue() <= 30000000000L) {
                    z = false;
                }
            }
            map.put(yynVar, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtimeNanos()));
        }
        if (!z || (context = this.v) == null) {
            return;
        }
        defpackage.omv.i(context, yynVar);
    }

    public final synchronized void g(defpackage.jbl jblVar) {
        java.util.ArrayDeque arrayDeque = this.w;
        arrayDeque.remove(jblVar);
        arrayDeque.add(jblVar);
    }

    public final synchronized void h(defpackage.jbl jblVar) {
        this.w.remove(jblVar);
    }

    @Override // defpackage.jcn
    public final synchronized void i() {
        if (this.h) {
            return;
        }
        this.h = true;
        start();
    }

    @Override // defpackage.jcn
    public final synchronized void j() {
        a.l().ai(1778).u("Shutting down PerChannelWriterThread immediately");
        this.i = true;
        this.h = false;
        notify();
    }

    @Override // defpackage.jcn
    public final synchronized boolean k() {
        return this.h;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(-19);
        while (true) {
            try {
                defpackage.jbl jblVarB = b();
                if (jblVarB == null) {
                    if (this.k) {
                        defpackage.jaj jajVar = this.f;
                        if (jajVar.c) {
                            jajVar.d.flush();
                        }
                        this.k = false;
                    }
                    synchronized (this) {
                        while (true) {
                            jblVarB = b();
                            if (jblVarB != null || this.j || this.i) {
                                break;
                                break;
                                break;
                            } else {
                                defpackage.jbj jbjVar = this.x;
                                jbjVar.b = 0L;
                                jbjVar.a = 0L;
                                wait(a());
                            }
                        }
                    }
                }
                if (jblVarB == null) {
                    a.f().ai(1779).u("Draining all write queues since writer thread is finishing up.");
                    l();
                    return;
                }
                jblVarB.i();
            } catch (java.lang.Exception e) {
                if (e instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                defpackage.yqk yqkVar = a;
                yqkVar.f().p(e).ai(1774).u("Exception received: ");
                synchronized (this) {
                    boolean z = this.h;
                    this.h = false;
                    defpackage.ypu ypuVarG = yqkVar.g();
                    if (z) {
                        ypuVarG.ai(1776).u("WriterThread: exiting due to IO error");
                        this.p.a(defpackage.zak.WRITER_IO_ERROR);
                        return;
                    } else {
                        ypuVarG.p(e).ai(1775).u("WriterThread: crashing with exception");
                        this.p.a(defpackage.zak.WRITER_UNKNOWN_EXCEPTION);
                        return;
                    }
                }
            }
        }
    }
}
