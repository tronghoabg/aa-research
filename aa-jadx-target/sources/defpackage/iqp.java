package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqp implements defpackage.jcp {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.STATS");
    public long A;
    public final boolean B;
    public final int C;
    private final defpackage.jfo D;
    private long E;
    private long F;
    private int G;
    private java.util.concurrent.Future H;
    private final long I;
    private final java.util.concurrent.ScheduledExecutorService J;
    private final defpackage.isd K;
    public final defpackage.xlk b;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicLong g = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicLong h = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicLong i = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger k = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger l = new java.util.concurrent.atomic.AtomicInteger(-99999);
    public final java.util.concurrent.atomic.AtomicInteger m = new java.util.concurrent.atomic.AtomicInteger(-99999);
    public final java.util.concurrent.atomic.AtomicInteger n = new java.util.concurrent.atomic.AtomicInteger(-99999);
    public final java.util.concurrent.atomic.AtomicInteger o = new java.util.concurrent.atomic.AtomicInteger(-99999);
    public final java.util.concurrent.atomic.AtomicInteger p = new java.util.concurrent.atomic.AtomicInteger(-99999);
    public final java.lang.Object q;
    public long r;
    public long s;
    public final java.util.ArrayList t;
    public final java.util.ArrayList u;
    public boolean v;
    public java.util.concurrent.Future w;
    public final java.util.List x;
    public java.util.concurrent.Future y;
    public final java.util.List z;

    public iqp(defpackage.xlk xlkVar, int i, defpackage.jfo jfoVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j, defpackage.isd isdVar, boolean z) {
        java.lang.Object obj = new java.lang.Object();
        this.q = obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.t = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.u = arrayList2;
        this.x = new java.util.ArrayList(10);
        this.z = new java.util.ArrayList(10);
        this.b = xlkVar;
        this.C = i;
        this.D = jfoVar;
        this.J = scheduledExecutorService;
        this.I = j;
        this.K = isdVar;
        synchronized (obj) {
            this.r = 0L;
        }
        synchronized (this) {
            arrayList.clear();
            arrayList2.clear();
        }
        this.B = z;
    }

    private final synchronized void w() {
        if (this.y == null) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                this.y = scheduledExecutorService.scheduleAtFixedRate(new defpackage.iqv(this, 1), 1000L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void x() {
        if (this.H == null) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                this.H = scheduledExecutorService.scheduleAtFixedRate(new defpackage.iks(this, 20), 1000L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void y() {
        this.v = true;
        if (this.w == null) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: iql
                    /* JADX WARN: Code duplicated, block: B:34:0x01ae A[Catch: all -> 0x0273, TryCatch #1 {, blocks: (B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:70:0x0123, outer: #2 }] */
                    /* JADX WARN: Code duplicated, block: B:37:0x01ce A[Catch: all -> 0x0273, TryCatch #1 {, blocks: (B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:70:0x0123, outer: #2 }] */
                    /* JADX WARN: Code duplicated, block: B:40:0x01ec  */
                    /* JADX WARN: Code duplicated, block: B:41:0x01ee  */
                    /* JADX WARN: Code duplicated, block: B:44:0x01f4 A[Catch: all -> 0x0276, TryCatch #2 {, blocks: (B:4:0x000f, B:10:0x001f, B:45:0x0203, B:47:0x020b, B:48:0x021a, B:50:0x0222, B:51:0x0233, B:52:0x0237, B:13:0x0122, B:44:0x01f4, B:42:0x01f0, B:64:0x0275, B:7:0x0015, B:9:0x0019, B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:72:0x000f, inners: #1 }] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.concurrent.Future future;
                        boolean z;
                        long jAbs;
                        int i;
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        defpackage.abor aborVarN = defpackage.yxu.a.n();
                        defpackage.iqp iqpVar = this.a;
                        synchronized (iqpVar) {
                            if (!iqpVar.v && (future = iqpVar.w) != null) {
                                future.cancel(false);
                                iqpVar.w = null;
                            }
                            long j = jElapsedRealtime - iqpVar.A;
                            aborVarN.t();
                            defpackage.yxu yxuVar = (defpackage.yxu) aborVarN.b;
                            yxuVar.b |= 1;
                            yxuVar.c = (int) j;
                            int andSet = iqpVar.c.getAndSet(0);
                            aborVarN.t();
                            defpackage.yxu yxuVar2 = (defpackage.yxu) aborVarN.b;
                            yxuVar2.b |= 4;
                            yxuVar2.e = andSet;
                            int andSet2 = iqpVar.f.getAndSet(0);
                            aborVarN.t();
                            defpackage.yxu yxuVar3 = (defpackage.yxu) aborVarN.b;
                            yxuVar3.b |= 8;
                            yxuVar3.f = andSet2;
                            int andSet3 = iqpVar.d.getAndSet(0);
                            aborVarN.t();
                            defpackage.yxu yxuVar4 = (defpackage.yxu) aborVarN.b;
                            yxuVar4.b |= 16;
                            yxuVar4.g = andSet3;
                            long j2 = 0;
                            int andSet4 = (int) iqpVar.h.getAndSet(0L);
                            aborVarN.t();
                            defpackage.yxu yxuVar5 = (defpackage.yxu) aborVarN.b;
                            yxuVar5.b |= 32;
                            yxuVar5.h = andSet4;
                            int i2 = iqpVar.b.h;
                            aborVarN.t();
                            defpackage.yxu yxuVar6 = (defpackage.yxu) aborVarN.b;
                            yxuVar6.b |= 64;
                            yxuVar6.i = i2;
                            int i3 = iqpVar.C;
                            aborVarN.t();
                            defpackage.yxu yxuVar7 = (defpackage.yxu) aborVarN.b;
                            yxuVar7.b |= 128;
                            yxuVar7.j = i3;
                            int i4 = iqpVar.l.get();
                            aborVarN.t();
                            defpackage.yxu yxuVar8 = (defpackage.yxu) aborVarN.b;
                            yxuVar8.b |= 512;
                            yxuVar8.l = i4;
                            int andSet5 = iqpVar.m.getAndSet(-99999);
                            aborVarN.t();
                            defpackage.yxu yxuVar9 = (defpackage.yxu) aborVarN.b;
                            yxuVar9.b |= 1024;
                            yxuVar9.m = andSet5;
                            int andSet6 = iqpVar.n.getAndSet(-99999);
                            aborVarN.t();
                            defpackage.yxu yxuVar10 = (defpackage.yxu) aborVarN.b;
                            yxuVar10.b |= 2048;
                            yxuVar10.n = andSet6;
                            int andSet7 = iqpVar.p.getAndSet(-99999);
                            aborVarN.t();
                            defpackage.yxu yxuVar11 = (defpackage.yxu) aborVarN.b;
                            yxuVar11.b |= 131072;
                            yxuVar11.t = andSet7;
                            int andSet8 = iqpVar.o.getAndSet(-99999);
                            aborVarN.t();
                            defpackage.yxu yxuVar12 = (defpackage.yxu) aborVarN.b;
                            yxuVar12.b |= 65536;
                            yxuVar12.s = andSet8;
                            if (!iqpVar.B) {
                                synchronized (iqpVar) {
                                    java.util.ArrayList arrayList = iqpVar.u;
                                    int size = arrayList.size();
                                    java.util.ArrayList arrayList2 = iqpVar.t;
                                    if (size > arrayList2.size()) {
                                        size = arrayList2.size();
                                    }
                                    if (size > 2) {
                                        double dLongValue = 0.0d;
                                        int i5 = 0;
                                        z = false;
                                        while (i5 < size) {
                                            z |= !(((java.lang.Long) arrayList.get(i5)).longValue() == j2);
                                            dLongValue += ((java.lang.Long) arrayList.get(i5)).longValue() - ((java.lang.Long) arrayList2.get(i5)).longValue();
                                            i5++;
                                            j2 = 0;
                                        }
                                        if (z) {
                                            long j3 = (long) (dLongValue / ((double) size));
                                            jAbs = 0;
                                            for (int i6 = 0; i6 < size; i6++) {
                                                jAbs += java.lang.Math.abs((((java.lang.Long) arrayList2.get(i6)).longValue() + j3) - ((java.lang.Long) arrayList.get(i6)).longValue());
                                            }
                                        }
                                        arrayList2.subList(0, size).clear();
                                        arrayList.subList(0, size).clear();
                                        if (!arrayList.isEmpty()) {
                                            ((defpackage.yqj) ((defpackage.yqj) defpackage.iqp.a.h()).ai(1098)).u("receiveTimes is not empty, more acks then sent?");
                                            arrayList.clear();
                                        }
                                        if (arrayList2.size() > 500) {
                                            ((defpackage.yqj) ((defpackage.yqj) defpackage.iqp.a.h()).ai(1097)).u("Too many sentTimes, acks are leaking!");
                                            arrayList2.clear();
                                            arrayList.clear();
                                        }
                                        if (z) {
                                            i = (int) (jAbs / 1000);
                                        } else {
                                            i = -1;
                                        }
                                        if (i >= 0) {
                                            aborVarN.t();
                                            defpackage.yxu yxuVar13 = (defpackage.yxu) aborVarN.b;
                                            yxuVar13.b |= 16384;
                                            yxuVar13.q = i;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    jAbs = 0;
                                    arrayList2.subList(0, size).clear();
                                    arrayList.subList(0, size).clear();
                                    if (!arrayList.isEmpty()) {
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iqp.a.h()).ai(1098)).u("receiveTimes is not empty, more acks then sent?");
                                        arrayList.clear();
                                    }
                                    if (arrayList2.size() > 500) {
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iqp.a.h()).ai(1097)).u("Too many sentTimes, acks are leaking!");
                                        arrayList2.clear();
                                        arrayList.clear();
                                    }
                                    if (z) {
                                        i = -1;
                                    } else {
                                        i = (int) (jAbs / 1000);
                                    }
                                    if (i >= 0) {
                                        aborVarN.t();
                                        defpackage.yxu yxuVar14 = (defpackage.yxu) aborVarN.b;
                                        yxuVar14.b |= 16384;
                                        yxuVar14.q = i;
                                    }
                                }
                            }
                            int andSet9 = iqpVar.j.getAndSet(0);
                            if (andSet9 > 0) {
                                aborVarN.t();
                                defpackage.yxu yxuVar15 = (defpackage.yxu) aborVarN.b;
                                yxuVar15.b |= 256;
                                yxuVar15.k = andSet9;
                            }
                            int andSet10 = iqpVar.k.getAndSet(0);
                            if (andSet10 > 0) {
                                aborVarN.t();
                                defpackage.yxu yxuVar16 = (defpackage.yxu) aborVarN.b;
                                yxuVar16.b |= 32768;
                                yxuVar16.r = andSet10;
                            }
                            iqpVar.v = false;
                            iqpVar.A = jElapsedRealtime;
                        }
                        synchronized (iqpVar.q) {
                            int i7 = (int) iqpVar.s;
                            aborVarN.t();
                            defpackage.yxu yxuVar17 = (defpackage.yxu) aborVarN.b;
                            yxuVar17.b |= 4096;
                            yxuVar17.o = i7;
                            int i8 = (int) iqpVar.r;
                            aborVarN.t();
                            defpackage.yxu yxuVar18 = (defpackage.yxu) aborVarN.b;
                            yxuVar18.b |= 8192;
                            yxuVar18.p = i8;
                            iqpVar.r = 0L;
                            iqpVar.s = 0L;
                        }
                        iqpVar.c((defpackage.yxu) aborVarN.q());
                    }
                };
                long j = this.I;
                this.w = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                this.A = android.os.SystemClock.elapsedRealtime();
            }
        }
    }

    private static void z(java.util.concurrent.atomic.AtomicInteger atomicInteger, defpackage.iqo iqoVar) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, iqoVar.a(i)));
    }

    @Override // defpackage.jcp
    public final synchronized void a() {
        this.K.c();
    }

    @Override // defpackage.jdy
    public final void b(int i) {
        z(this.p, new iqm(i, 1));
        z(this.o, new iqm(i, 0));
        y();
    }

    @Override // defpackage.jcp
    public final void c(defpackage.yxu yxuVar) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yxuVar.getClass();
        yygVar.L = yxuVar;
        yygVar.c |= 4096;
        defpackage.yyh yyhVar = defpackage.yyh.AUDIO_STATS;
        int i = defpackage.ygw.d;
        ((defpackage.jfp) this.D).m(aborVarN, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.jdy
    public final void d(final int i) {
        final int i2 = 1;
        z(this.m, new defpackage.iqo() { // from class: iqk
            @Override // defpackage.iqo
            public final int a(int i3) {
                if (i2 != 0) {
                    defpackage.yqm yqmVar = defpackage.iqp.a;
                    int i4 = i;
                    if (i3 == -99999 || i4 < i3) {
                        return i4;
                    }
                } else {
                    defpackage.yqm yqmVar2 = defpackage.iqp.a;
                    int i5 = i;
                    if (i3 == -99999 || i5 > i3) {
                        return i5;
                    }
                }
                return i3;
            }
        });
        final int i3 = 0;
        z(this.n, new defpackage.iqo() { // from class: iqk
            @Override // defpackage.iqo
            public final int a(int i4) {
                if (i3 != 0) {
                    defpackage.yqm yqmVar = defpackage.iqp.a;
                    int i5 = i;
                    if (i4 == -99999 || i5 < i4) {
                        return i5;
                    }
                } else {
                    defpackage.yqm yqmVar2 = defpackage.iqp.a;
                    int i6 = i;
                    if (i4 == -99999 || i6 > i4) {
                        return i6;
                    }
                }
                return i4;
            }
        });
        y();
    }

    @Override // defpackage.jdy
    public final void e() {
        this.j.incrementAndGet();
        y();
    }

    @Override // defpackage.jdy
    public final void f(long j, long j2) {
        this.h.addAndGet(j);
        this.f.incrementAndGet();
        this.g.incrementAndGet();
        this.i.addAndGet(j);
        if (!this.B) {
            synchronized (this) {
                java.util.ArrayList arrayList = this.u;
                if (arrayList.size() < 2000) {
                    arrayList.add(java.lang.Long.valueOf(j2));
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(2, java.util.concurrent.TimeUnit.SECONDS)).ai(1102)).u("receiveTimes list is too big, discarding");
                }
            }
        }
        y();
        w();
    }

    @Override // defpackage.jdy
    public final void k(int i) {
        boolean z = this.B;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        if (!z) {
            synchronized (this) {
                java.util.ArrayList arrayList = this.t;
                if (arrayList.size() < 2000) {
                    arrayList.add(java.lang.Long.valueOf(jElapsedRealtimeNanos));
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(2, java.util.concurrent.TimeUnit.SECONDS)).ai(1103)).u("mediaSendTimes list is too big, discarding");
                }
            }
        }
        this.c.incrementAndGet();
        this.d.addAndGet(i);
        this.e.addAndGet(i);
        y();
        x();
        defpackage.isd isdVar = this.K;
        if (isdVar.e()) {
            isdVar.a();
        }
    }

    @Override // defpackage.jdy
    public final void m(int i) {
        this.l.getAndSet(i);
    }

    @Override // defpackage.jcp
    public final void o(defpackage.yzy yzyVar) {
        this.D.c(yzyVar);
    }

    @Override // defpackage.jdy
    public final void p() {
        this.k.incrementAndGet();
        y();
    }

    @Override // defpackage.jdy
    public final void q(long j) {
        synchronized (this.q) {
            this.G++;
            this.E += j;
            this.F = java.lang.Math.max(j, this.F);
            if (this.G >= 234) {
                t();
            }
            this.r = java.lang.Math.max(j, this.r);
            this.s += j;
        }
        y();
    }

    @Override // defpackage.jdy
    public final synchronized void r() {
        this.J.shutdownNow();
        this.K.d();
    }

    public final void s(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1099);
        int i = this.C;
        yqjVar.R("Acks from %s received in the last %d seconds with avg latency: [%s]", defpackage.dmh.M(i), java.lang.Integer.valueOf(list.size()), android.text.TextUtils.join(",", list));
    }

    public final void t() {
        synchronized (this.q) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1100)).S("Time spent in sender lib for stream %s in the last %d frames: avg: %.2f ms, max: %s ms", defpackage.dmh.M(this.C), java.lang.Integer.valueOf(this.G), java.lang.Double.valueOf(this.E / ((double) this.G)), java.lang.Long.valueOf(this.F));
            this.G = 0;
            this.E = 0L;
            this.F = 0L;
        }
    }

    public final void u(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1101);
        int i = this.C;
        yqjVar.R("%s bitrate in the last %d seconds: [%s] kbps", defpackage.dmh.M(i), java.lang.Integer.valueOf(list.size()), android.text.TextUtils.join(",", list));
    }

    public final synchronized void v() {
        java.util.concurrent.Future future = this.H;
        if (future != null) {
            future.cancel(false);
            this.H = null;
            java.util.List list = this.x;
            if (!list.isEmpty()) {
                u(defpackage.ygw.o(list));
                list.clear();
            }
        }
    }

    @Override // defpackage.jdy
    public final void i() {
    }

    @Override // defpackage.jdy
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.jdy
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.jdy
    public final void g(int i) {
    }

    @Override // defpackage.jdy
    public final void h(long j) {
    }

    @Override // defpackage.jdy
    public final /* synthetic */ void n(defpackage.xlr xlrVar) {
    }
}
