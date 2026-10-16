package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jgj implements defpackage.jev {
    private final defpackage.ygw A;
    private defpackage.iup B;
    private defpackage.iup C;
    private defpackage.iup D;
    private final java.util.Queue E;
    private final long F;
    private java.util.concurrent.Future G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private long M;
    public final defpackage.jfo a;
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicLong e = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicLong g = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicLong h = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicLong i;
    public final java.util.concurrent.atomic.AtomicInteger j;
    public final java.util.concurrent.atomic.AtomicInteger k;
    public final java.util.concurrent.atomic.AtomicInteger l;
    public final int m;
    public final defpackage.xkd n;
    public final boolean o;
    public defpackage.iup p;
    public defpackage.iup q;
    public defpackage.iup r;
    public defpackage.iup s;
    public defpackage.iup t;
    public int u;
    public boolean v;
    public long w;
    private final defpackage.ygw x;
    private final defpackage.ygw y;
    private final defpackage.ygw z;

    static {
        defpackage.yqm.c("CAR.VIDEO");
    }

    public jgj(defpackage.jfo jfoVar, defpackage.xkd xkdVar, int i, boolean z) {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.i = atomicLong;
        this.j = new java.util.concurrent.atomic.AtomicInteger();
        this.k = new java.util.concurrent.atomic.AtomicInteger();
        this.l = new java.util.concurrent.atomic.AtomicInteger();
        defpackage.aczm aczmVar = defpackage.aczm.a;
        this.x = defpackage.ygw.o(aczmVar.fF().c().b);
        defpackage.acuc acucVar = defpackage.acuc.a;
        this.y = defpackage.ygw.o(acucVar.fF().d().b);
        this.z = defpackage.ygw.o(acucVar.fF().e().b);
        this.A = defpackage.ygw.o(acucVar.fF().f().b);
        this.v = false;
        this.w = 0L;
        this.F = aczmVar.fF().b();
        this.a = jfoVar;
        this.n = xkdVar;
        this.m = i;
        this.o = z;
        this.E = new defpackage.yfd((int) aczmVar.fF().a());
        if (!aczmVar.fF().d()) {
            this.v = true;
        }
        atomicLong.set(0L);
        z();
    }

    @Override // defpackage.jev
    public final synchronized void a(java.io.PrintWriter printWriter) {
        java.util.Queue queue = this.E;
        if (queue.isEmpty()) {
            printWriter.println("No MediaStats received for current video session.");
            return;
        }
        printWriter.println("Last " + queue.size() + " MediaStats:");
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            defpackage.jgi jgiVar = (defpackage.jgi) it.next();
            java.lang.String strValueOf = java.lang.String.valueOf(jgiVar.b.atZone(j$.time.ZoneId.systemDefault()).toLocalDateTime());
            defpackage.xlr xlrVar = jgiVar.a;
            int i = this.m;
            defpackage.xif xifVar = xlrVar.n;
            if (xifVar == null) {
                xifVar = defpackage.xif.a;
            }
            defpackage.xif xifVar2 = xlrVar.o;
            if (xifVar2 == null) {
                xifVar2 = defpackage.xif.a;
            }
            defpackage.xif xifVar3 = xlrVar.m;
            if (xifVar3 == null) {
                xifVar3 = defpackage.xif.a;
            }
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            defpackage.aboh abohVar = xlrVar.c;
            if (abohVar == null) {
                abohVar = defpackage.aboh.a;
            }
            java.util.Iterator it2 = it;
            printWriter.println("  " + strValueOf + " " + java.lang.String.format(locale, "Media stats for display %d in the last %d ms and %d frames:\n  Video frame jitter (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video frame pacing delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video frame too slow count: %d\n  Video frame too fast count: %d\n  Video overflow count: %d\n  Video overflow duration (us): {avg: %d, min: %d, max: %d, count: %d}", numValueOf, java.lang.Long.valueOf(defpackage.abrv.a(abohVar)), java.lang.Long.valueOf(xlrVar.d), java.lang.Long.valueOf(xifVar.b), java.lang.Long.valueOf(xifVar.c), java.lang.Long.valueOf(xifVar.d), java.lang.Long.valueOf(xifVar.e), java.lang.Long.valueOf(xifVar2.b), java.lang.Long.valueOf(xifVar2.c), java.lang.Long.valueOf(xifVar2.d), java.lang.Long.valueOf(xifVar2.e), java.lang.Long.valueOf(xlrVar.q), java.lang.Long.valueOf(xlrVar.p), java.lang.Long.valueOf(xlrVar.l), java.lang.Long.valueOf(xifVar3.b), java.lang.Long.valueOf(xifVar3.c), java.lang.Long.valueOf(xifVar3.d), java.lang.Long.valueOf(xifVar3.e)).replace("\n", "\n  "));
            it = it2;
        }
    }

    @Override // defpackage.jev
    public final synchronized void c() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.w -= android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jdy
    public final void f(long j, long j2) {
        if (this.o) {
            return;
        }
        this.e.addAndGet(j);
        this.d.incrementAndGet();
    }

    @Override // defpackage.jdy
    public final void g(int i) {
        this.g.addAndGet(i);
    }

    @Override // defpackage.jdy
    public final synchronized void h(long j) {
        this.p.c(j, 1);
    }

    @Override // defpackage.jdy
    public final void i() {
        this.j.incrementAndGet();
    }

    @Override // defpackage.jdy
    public final void j() {
        this.k.getAndIncrement();
    }

    @Override // defpackage.jdy
    public final void k(int i) {
        this.c.incrementAndGet();
        this.f.addAndGet(i);
    }

    @Override // defpackage.jdy
    public final void l() {
        this.l.getAndIncrement();
    }

    @Override // defpackage.jdy
    public final void m(int i) {
        if (this.o) {
            return;
        }
        this.b.set(i);
    }

    @Override // defpackage.jdy
    public final synchronized void n(defpackage.xlr xlrVar) {
        this.E.add(new defpackage.jgi(xlrVar, j$.time.Instant.now()));
        if (defpackage.acuc.c()) {
            if ((xlrVar.b & 2048) != 0) {
                defpackage.xif xifVar = xlrVar.n;
                if (xifVar == null) {
                    xifVar = defpackage.xif.a;
                }
                defpackage.iup iupVar = this.B;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar.c(xifVar.b / 1000, (int) xifVar.e);
            }
            if ((xlrVar.b & 4096) != 0) {
                defpackage.xif xifVar2 = xlrVar.o;
                if (xifVar2 == null) {
                    xifVar2 = defpackage.xif.a;
                }
                defpackage.iup iupVar2 = this.C;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar2.c(xifVar2.b / 1000, (int) xifVar2.e);
            }
            if ((xlrVar.b & 1024) != 0) {
                defpackage.xif xifVar3 = xlrVar.m;
                if (xifVar3 == null) {
                    xifVar3 = defpackage.xif.a;
                }
                defpackage.iup iupVar3 = this.D;
                java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar3.c(xifVar3.b / 1000, (int) xifVar3.e);
            }
            this.K += xlrVar.l;
            this.I += xlrVar.p;
            this.J += xlrVar.q;
            long j = this.L;
            defpackage.aboh abohVar = xlrVar.c;
            if (abohVar == null) {
                abohVar = defpackage.aboh.a;
            }
            this.L = j + defpackage.abrv.a(abohVar);
            this.M += xlrVar.d;
        }
    }

    @Override // defpackage.jev
    public final synchronized void o() {
        if (defpackage.aczm.f() && this.v) {
            this.v = false;
            this.w += android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.jdy
    public final synchronized void q(long j) {
        this.h.addAndGet(j);
        j$.util.concurrent.atomic.DesugarAtomicLong.accumulateAndGet(this.i, j, new defpackage.jgg());
        this.q.c(j, 1);
    }

    @Override // defpackage.jdy
    public final void r() {
        java.util.concurrent.Future future = this.G;
        if (future != null) {
            future.cancel(false);
            this.G = null;
        }
    }

    @Override // defpackage.jev
    public final synchronized void s(j$.time.Duration duration) {
        this.t.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jev
    public final synchronized void t(j$.time.Duration duration) {
        this.r.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jev
    public final synchronized void u(j$.time.Duration duration) {
        if (this.o) {
            return;
        }
        this.s.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jev
    public final void v(int i) {
        this.u = i;
    }

    @Override // defpackage.jev
    public final void w(int i) {
        this.H = i;
    }

    @Override // defpackage.jev
    public final void x(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        synchronized (this) {
            this.w = this.v ? -android.os.SystemClock.elapsedRealtime() : 0L;
        }
        this.c.set(0);
        this.d.set(0);
        this.e.set(0L);
        this.f.set(0);
        this.g.set(0L);
        this.h.set(0L);
        this.i.set(0L);
        this.j.set(0);
        this.l.set(0);
        this.k.set(0);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: jgf
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.jgj jgjVar = this.a;
                synchronized (jgjVar) {
                    if (jgjVar.v) {
                        long j = jgjVar.w + jElapsedRealtime;
                        jgjVar.w = -jElapsedRealtime;
                        i = (int) j;
                    } else {
                        i = (int) jgjVar.w;
                        jgjVar.w = 0L;
                    }
                }
                defpackage.abor aborVarN = zan.a.n();
                aborVarN.t();
                zan zanVar = aborVarN.b;
                zanVar.b |= 1;
                zanVar.c = i;
                int andSet = (int) jgjVar.g.getAndSet(0L);
                aborVarN.t();
                zan zanVar2 = aborVarN.b;
                zanVar2.b |= 4;
                zanVar2.e = andSet;
                int andSet2 = jgjVar.c.getAndSet(0);
                aborVarN.t();
                zan zanVar3 = aborVarN.b;
                zanVar3.b |= 8;
                zanVar3.f = andSet2;
                int andSet3 = jgjVar.f.getAndSet(0);
                aborVarN.t();
                zan zanVar4 = aborVarN.b;
                zanVar4.b |= 32;
                zanVar4.h = andSet3;
                int i2 = jgjVar.u;
                aborVarN.t();
                zan zanVar5 = aborVarN.b;
                zanVar5.b |= 128;
                zanVar5.j = i2;
                int andSet4 = (int) jgjVar.h.getAndSet(0L);
                aborVarN.t();
                zan zanVar6 = aborVarN.b;
                zanVar6.b |= 256;
                zanVar6.k = andSet4;
                int andSet5 = (int) jgjVar.i.getAndSet(0L);
                aborVarN.t();
                zan zanVar7 = aborVarN.b;
                zanVar7.b |= 512;
                zanVar7.l = andSet5;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = jgjVar.k;
                if (atomicInteger.get() > 0) {
                    int andSet6 = atomicInteger.getAndSet(0);
                    aborVarN.t();
                    zan zanVar8 = aborVarN.b;
                    zanVar8.b |= 2;
                    zanVar8.d = andSet6;
                    int andSet7 = jgjVar.l.getAndSet(0);
                    aborVarN.t();
                    zan zanVar9 = aborVarN.b;
                    zanVar9.b |= 524288;
                    zanVar9.v = andSet7;
                }
                if (!jgjVar.o) {
                    int andSet8 = jgjVar.b.getAndSet(0);
                    if (andSet8 > 0) {
                        aborVarN.t();
                        zan zanVar10 = aborVarN.b;
                        zanVar10.b |= 8192;
                        zanVar10.p = andSet8;
                    }
                    int andSet9 = jgjVar.d.getAndSet(0);
                    aborVarN.t();
                    zan zanVar11 = aborVarN.b;
                    zanVar11.b |= 16;
                    zanVar11.g = andSet9;
                    int andSet10 = (int) jgjVar.e.getAndSet(0L);
                    aborVarN.t();
                    zan zanVar12 = aborVarN.b;
                    zanVar12.b |= 64;
                    zanVar12.i = andSet10;
                }
                int andSet11 = jgjVar.j.getAndSet(0);
                if (andSet11 > 0) {
                    aborVarN.t();
                    zan zanVar13 = aborVarN.b;
                    zanVar13.b |= 4096;
                    zanVar13.o = andSet11;
                }
                int i3 = jgjVar.m;
                if (i3 != 0) {
                    aborVarN.t();
                    zan zanVar14 = aborVarN.b;
                    zanVar14.b |= 2048;
                    zanVar14.n = i3;
                    defpackage.xkd xkdVar = jgjVar.n;
                    aborVarN.t();
                    zan zanVar15 = aborVarN.b;
                    zanVar15.b |= 1024;
                    zanVar15.m = xkdVar.d;
                }
                j$.util.Optional optionalA = jgjVar.p.a();
                defpackage.ilx ilxVar = new defpackage.ilx(aborVarN, 19);
                if (true == optionalA.isPresent()) {
                    java.lang.Object obj = optionalA.get();
                    defpackage.abor aborVar = (defpackage.abor) ilxVar.a;
                    aborVar.t();
                    zan zanVar16 = aborVar.b;
                    zanVar16.q = (yzv) obj;
                    zanVar16.b |= 16384;
                }
                j$.util.Optional optionalA2 = jgjVar.q.a();
                defpackage.ilx ilxVar2 = new defpackage.ilx(aborVarN, 20);
                if (true == optionalA2.isPresent()) {
                    java.lang.Object obj2 = optionalA2.get();
                    defpackage.abor aborVar2 = (defpackage.abor) ilxVar2.a;
                    aborVar2.t();
                    zan zanVar17 = aborVar2.b;
                    zanVar17.r = (yzv) obj2;
                    zanVar17.b |= 32768;
                }
                j$.util.Optional optionalA3 = jgjVar.r.a();
                jgh jghVar = new jgh(aborVarN, 1);
                if (true == optionalA3.isPresent()) {
                    java.lang.Object obj3 = optionalA3.get();
                    defpackage.abor aborVar3 = (defpackage.abor) jghVar.a;
                    aborVar3.t();
                    zan zanVar18 = aborVar3.b;
                    zanVar18.s = (yzv) obj3;
                    zanVar18.b |= 65536;
                }
                j$.util.Optional optionalA4 = jgjVar.s.a();
                jgh jghVar2 = new jgh(aborVarN, 0);
                if (true == optionalA4.isPresent()) {
                    java.lang.Object obj4 = optionalA4.get();
                    defpackage.abor aborVar4 = (defpackage.abor) jghVar2.a;
                    aborVar4.t();
                    zan zanVar19 = aborVar4.b;
                    zanVar19.t = (yzv) obj4;
                    zanVar19.b |= 131072;
                }
                j$.util.Optional optionalA5 = jgjVar.t.a();
                jgh jghVar3 = new jgh(aborVarN, 2);
                if (true == optionalA5.isPresent()) {
                    java.lang.Object obj5 = optionalA5.get();
                    defpackage.abor aborVar5 = (defpackage.abor) jghVar3.a;
                    aborVar5.t();
                    zan zanVar20 = aborVar5.b;
                    zanVar20.u = (yzv) obj5;
                    zanVar20.b |= 262144;
                }
                jgjVar.y();
                jgjVar.z();
                defpackage.abor aborVarN2 = defpackage.zam.a.n();
                aborVarN2.t();
                defpackage.zam zamVar = (defpackage.zam) aborVarN2.b;
                zan zanVarQ = aborVarN.q();
                zanVarQ.getClass();
                zamVar.c = zanVarQ;
                zamVar.b |= 1;
                defpackage.zam zamVar2 = (defpackage.zam) aborVarN2.q();
                defpackage.jfo jfoVar = jgjVar.a;
                defpackage.abor aborVarN3 = defpackage.yyg.a.n();
                aborVarN3.t();
                defpackage.yyg yygVar = (defpackage.yyg) aborVarN3.b;
                zamVar2.getClass();
                yygVar.K = zamVar2;
                yygVar.c |= 2048;
                defpackage.yyh yyhVar = defpackage.yyh.PROJECTION_STATS;
                int i4 = defpackage.ygw.d;
                ((defpackage.jfp) jfoVar).m(aborVarN3, yyhVar, defpackage.ymx.a);
            }
        };
        long j = this.F;
        this.G = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0104 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0133 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0162 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    public final synchronized void y() {
        defpackage.xqd xqdVar;
        int i;
        j$.util.Optional optionalB;
        defpackage.ilx ilxVar;
        j$.util.Optional optionalB2;
        defpackage.ilx ilxVar2;
        j$.util.Optional optionalB3;
        defpackage.ilx ilxVar3;
        if (defpackage.acuc.c() && this.L > 0) {
            defpackage.abor aborVarN = defpackage.yzy.a.n();
            long j = this.L;
            aborVarN.t();
            defpackage.yzy yzyVar = (defpackage.yzy) aborVarN.b;
            yzyVar.b |= 1;
            yzyVar.c = j;
            long j2 = this.M;
            aborVarN.t();
            defpackage.yzy yzyVar2 = (defpackage.yzy) aborVarN.b;
            yzyVar2.b |= 2;
            yzyVar2.d = j2;
            long j3 = this.K;
            aborVarN.t();
            defpackage.yzy yzyVar3 = (defpackage.yzy) aborVarN.b;
            yzyVar3.b |= 512;
            yzyVar3.l = j3;
            long j4 = this.I;
            aborVarN.t();
            defpackage.yzy yzyVar4 = (defpackage.yzy) aborVarN.b;
            yzyVar4.b |= 8192;
            yzyVar4.p = j4;
            long j5 = this.J;
            aborVarN.t();
            defpackage.yzy yzyVar5 = (defpackage.yzy) aborVarN.b;
            yzyVar5.b |= 16384;
            yzyVar5.q = j5;
            defpackage.xkd xkdVar = this.n;
            aborVarN.t();
            defpackage.yzy yzyVar6 = (defpackage.yzy) aborVarN.b;
            yzyVar6.b |= 65536;
            yzyVar6.s = xkdVar.d;
            int i2 = this.u;
            if (i2 == 480) {
                xqdVar = defpackage.xqd.VIDEO_800x480;
            } else if (i2 == 720) {
                xqdVar = defpackage.xqd.VIDEO_1280x720;
            } else if (i2 == 1080) {
                xqdVar = defpackage.xqd.VIDEO_1920x1080;
            } else if (i2 == 1280) {
                xqdVar = defpackage.xqd.VIDEO_720x1280;
            } else if (i2 == 1440) {
                xqdVar = defpackage.xqd.VIDEO_2560x1440;
            } else if (i2 == 1920) {
                xqdVar = defpackage.xqd.VIDEO_1080x1920;
            } else if (i2 == 2160) {
                xqdVar = defpackage.xqd.VIDEO_3840x2160;
            } else {
                if (i2 != 2560) {
                    if (i2 != 3840) {
                        i = 0;
                    } else {
                        xqdVar = defpackage.xqd.VIDEO_2160x3840;
                    }
                    aborVarN.t();
                    defpackage.yzy yzyVar7 = (defpackage.yzy) aborVarN.b;
                    yzyVar7.b |= 131072;
                    yzyVar7.t = i;
                    int i3 = this.H;
                    aborVarN.t();
                    defpackage.yzy yzyVar8 = (defpackage.yzy) aborVarN.b;
                    yzyVar8.b |= 262144;
                    yzyVar8.u = i3;
                    this.L = 0L;
                    this.M = 0L;
                    this.K = 0L;
                    this.I = 0L;
                    this.J = 0L;
                    optionalB = this.B.b();
                    ilxVar = new defpackage.ilx(aborVarN, 16);
                    if (true == optionalB.isPresent()) {
                        java.lang.Object obj = optionalB.get();
                        java.lang.Object obj2 = ilxVar.a;
                        ((defpackage.abor) obj2).t();
                        defpackage.yzy yzyVar9 = (defpackage.yzy) ((defpackage.abor) obj2).b;
                        yzyVar9.n = (zat) obj;
                        yzyVar9.b |= 2048;
                    }
                    optionalB2 = this.C.b();
                    ilxVar2 = new defpackage.ilx(aborVarN, 17);
                    if (true == optionalB2.isPresent()) {
                        java.lang.Object obj3 = optionalB2.get();
                        java.lang.Object obj4 = ilxVar2.a;
                        ((defpackage.abor) obj4).t();
                        defpackage.yzy yzyVar10 = (defpackage.yzy) ((defpackage.abor) obj4).b;
                        yzyVar10.o = (zat) obj3;
                        yzyVar10.b |= 4096;
                    }
                    optionalB3 = this.D.b();
                    ilxVar3 = new defpackage.ilx(aborVarN, 18);
                    if (true == optionalB3.isPresent()) {
                        java.lang.Object obj5 = optionalB3.get();
                        java.lang.Object obj6 = ilxVar3.a;
                        ((defpackage.abor) obj6).t();
                        defpackage.yzy yzyVar11 = (defpackage.yzy) ((defpackage.abor) obj6).b;
                        yzyVar11.m = (zat) obj5;
                        yzyVar11.b |= 1024;
                    }
                    this.a.c((defpackage.yzy) aborVarN.q());
                }
                xqdVar = defpackage.xqd.VIDEO_1440x2560;
            }
            i = xqdVar.j;
            aborVarN.t();
            defpackage.yzy yzyVar12 = (defpackage.yzy) aborVarN.b;
            yzyVar12.b |= 131072;
            yzyVar12.t = i;
            int i4 = this.H;
            aborVarN.t();
            defpackage.yzy yzyVar13 = (defpackage.yzy) aborVarN.b;
            yzyVar13.b |= 262144;
            yzyVar13.u = i4;
            this.L = 0L;
            this.M = 0L;
            this.K = 0L;
            this.I = 0L;
            this.J = 0L;
            optionalB = this.B.b();
            ilxVar = new defpackage.ilx(aborVarN, 16);
            if (true == optionalB.isPresent()) {
                java.lang.Object obj7 = optionalB.get();
                java.lang.Object obj8 = ilxVar.a;
                ((defpackage.abor) obj8).t();
                defpackage.yzy yzyVar14 = (defpackage.yzy) ((defpackage.abor) obj8).b;
                yzyVar14.n = (zat) obj7;
                yzyVar14.b |= 2048;
            }
            optionalB2 = this.C.b();
            ilxVar2 = new defpackage.ilx(aborVarN, 17);
            if (true == optionalB2.isPresent()) {
                java.lang.Object obj9 = optionalB2.get();
                java.lang.Object obj10 = ilxVar2.a;
                ((defpackage.abor) obj10).t();
                defpackage.yzy yzyVar15 = (defpackage.yzy) ((defpackage.abor) obj10).b;
                yzyVar15.o = (zat) obj9;
                yzyVar15.b |= 4096;
            }
            optionalB3 = this.D.b();
            ilxVar3 = new defpackage.ilx(aborVarN, 18);
            if (true == optionalB3.isPresent()) {
                java.lang.Object obj11 = optionalB3.get();
                java.lang.Object obj12 = ilxVar3.a;
                ((defpackage.abor) obj12).t();
                defpackage.yzy yzyVar16 = (defpackage.yzy) ((defpackage.abor) obj12).b;
                yzyVar16.m = (zat) obj11;
                yzyVar16.b |= 1024;
            }
            this.a.c((defpackage.yzy) aborVarN.q());
        }
    }

    public final synchronized void z() {
        defpackage.ygw ygwVar = this.x;
        this.p = new defpackage.iup(ygwVar);
        this.q = new defpackage.iup(ygwVar);
        this.r = new defpackage.iup(ygwVar);
        this.s = new defpackage.iup(ygwVar);
        this.t = new defpackage.iup(ygwVar);
        this.B = new defpackage.iup(this.y);
        this.C = new defpackage.iup(this.z);
        this.D = new defpackage.iup(this.A);
    }

    @Override // defpackage.jdy
    public final void e() {
    }

    @Override // defpackage.jdy
    public final void p() {
    }

    @Override // defpackage.jdy
    public final void b(int i) {
    }

    @Override // defpackage.jdy
    public final void d(int i) {
    }
}
