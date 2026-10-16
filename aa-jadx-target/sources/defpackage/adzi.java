package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adzi implements adti {
    static final defpackage.admy a;
    static final defpackage.admy b;
    public static final defpackage.ador c;
    public static final java.util.Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ defpackage.adng B;
    final /* synthetic */ defpackage.adjw C;
    final /* synthetic */ defpackage.adkr D;
    final /* synthetic */ defpackage.adwh E;
    public defpackage.kez F;
    public final defpackage.sr G;
    private final defpackage.adnd H;
    private defpackage.ador I;
    public final defpackage.adng f;
    public final java.util.concurrent.Executor g;
    public final java.util.concurrent.Executor h;
    public final java.util.concurrent.ScheduledExecutorService i;
    public final defpackage.adzj j;
    public final advf k;
    public final boolean l;
    public final java.lang.Object m;
    public final long n;
    public final long o;
    public final adzh p;
    public final defpackage.advl q;
    public volatile defpackage.adze r;
    public final java.util.concurrent.atomic.AtomicBoolean s;
    public final java.util.concurrent.atomic.AtomicInteger t;
    public final java.util.concurrent.atomic.AtomicInteger u;
    public long v;
    public adtk w;
    public adzb x;
    public adzb y;
    public long z;

    static {
        admv admvVar = defpackage.adnd.b;
        int i = defpackage.admy.d;
        a = new defpackage.admu("grpc-previous-rpc-attempts", admvVar);
        b = new defpackage.admu("grpc-retry-pushback-ms", defpackage.adnd.b);
        c = defpackage.ador.c.e("Stream thrown away because RetriableStream committed");
        d = new java.util.Random();
        java.nio.charset.Charset charset = defpackage.adve.a;
        e = defpackage.adkx.a("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public adzi(defpackage.adwh adwhVar, defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adzj adzjVar, advf advfVar, defpackage.adkr adkrVar) {
        this.B = adngVar;
        this.C = adjwVar;
        this.D = adkrVar;
        this.E = adwhVar;
        defpackage.adww adwwVar = adwhVar.b;
        defpackage.sr srVar = adwwVar.U;
        long j = adwwVar.M;
        long j2 = adwwVar.N;
        java.util.concurrent.Executor executorF = adwwVar.f(adjwVar);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceC = adwwVar.i.c();
        adzh adzhVar = adwhVar.a;
        this.h = new defpackage.adox(new adys());
        this.m = new java.lang.Object();
        this.q = new defpackage.advl();
        this.r = new defpackage.adze(new java.util.ArrayList(8), java.util.Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new java.util.concurrent.atomic.AtomicBoolean();
        this.t = new java.util.concurrent.atomic.AtomicInteger();
        this.u = new java.util.concurrent.atomic.AtomicInteger();
        this.f = adngVar;
        this.G = srVar;
        this.n = j;
        this.o = j2;
        this.g = executorF;
        this.i = scheduledExecutorServiceC;
        this.H = adndVar;
        this.j = adzjVar;
        if (adzjVar != null) {
            this.z = adzjVar.b;
        }
        this.k = advfVar;
        defpackage.ysr.aY(adzjVar == null || advfVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = advfVar != null;
        this.p = adzhVar;
    }

    public final defpackage.adjs a() {
        throw null;
    }

    public final void b(defpackage.advl advlVar) {
        defpackage.adze adzeVar;
        synchronized (this.m) {
            advlVar.b("closed", this.q);
            adzeVar = this.r;
        }
        defpackage.adzg adzgVar = adzeVar.f;
        if (adzgVar != null) {
            defpackage.advl advlVar2 = new defpackage.advl();
            adzgVar.a.b(advlVar2);
            advlVar.b("committed", advlVar2);
            return;
        }
        defpackage.advl advlVar3 = new defpackage.advl();
        for (defpackage.adzg adzgVar2 : adzeVar.c) {
            defpackage.advl advlVar4 = new defpackage.advl();
            adzgVar2.a.b(advlVar4);
            advlVar3.a(advlVar4);
        }
        advlVar.b("open", advlVar3);
    }

    public final void c(defpackage.ador adorVar) {
        defpackage.adzg adzgVar;
        defpackage.adzg adzgVar2 = new defpackage.adzg(0);
        adzgVar2.a = new defpackage.adxt();
        java.lang.Runnable runnableQ = q(adzgVar2);
        java.lang.Object obj = this.m;
        if (runnableQ != null) {
            synchronized (obj) {
                this.r = this.r.c(adzgVar2);
            }
            runnableQ.run();
            v(adorVar, defpackage.adtj.a, new defpackage.adnd());
            return;
        }
        synchronized (obj) {
            if (this.r.c.contains(this.r.f)) {
                adzgVar = this.r.f;
            } else {
                this.I = adorVar;
                adzgVar = null;
            }
            defpackage.adze adzeVar = this.r;
            this.r = new defpackage.adze(adzeVar.b, adzeVar.c, adzeVar.d, adzeVar.f, true, adzeVar.a, adzeVar.h, adzeVar.e);
        }
        if (adzgVar != null) {
            adzgVar.a.c(adorVar);
        }
    }

    public final void d() {
        defpackage.adze adzeVar = this.r;
        if (adzeVar.a) {
            adzeVar.f.a.d();
        } else {
            s(new defpackage.adyv(1));
        }
    }

    public final void e() {
        s(new defpackage.adyv(0));
    }

    public final void f() {
        s(new defpackage.adyv(2));
    }

    public final void g(int i) {
        defpackage.adze adzeVar = this.r;
        if (adzeVar.a) {
            adzeVar.f.a.g(i);
        } else {
            s(new defpackage.adyw(i, 2));
        }
    }

    public final void h(adke adkeVar) {
        s(new defpackage.adyu(adkeVar, 1));
    }

    public final void i(defpackage.adks adksVar) {
        s(new defpackage.adyu(adksVar, 0));
    }

    public final void j(defpackage.adku adkuVar) {
        s(new defpackage.adyu(adkuVar, 2));
    }

    public final void k(int i) {
        s(new defpackage.adyw(i, 1));
    }

    public final void l(int i) {
        s(new defpackage.adyw(i, 0));
    }

    public final void m(adtk adtkVar) {
        defpackage.ador adorVar;
        adzb adzbVar;
        adzh adzhVar;
        this.w = adtkVar;
        defpackage.adwv adwvVar = this.E.b.y;
        synchronized (adwvVar.a) {
            adorVar = adwvVar.c;
            adzbVar = null;
            if (adorVar == null) {
                adwvVar.b.add(this);
                adorVar = null;
            }
        }
        if (adorVar != null) {
            c(adorVar);
            return;
        }
        synchronized (this.m) {
            this.r.b.add(new defpackage.adzd(this));
        }
        defpackage.adzg adzgVarP = p(0, false, false);
        if (adzgVarP == null) {
            return;
        }
        if (this.l) {
            java.lang.Object obj = this.m;
            synchronized (obj) {
                this.r = this.r.a(adzgVarP);
                if (w(this.r) && ((adzhVar = this.p) == null || adzhVar.a())) {
                    adzbVar = new adzb(obj);
                    this.y = adzbVar;
                }
            }
            if (adzbVar != null) {
                adzbVar.b(this.i.schedule((java.lang.Runnable) new adzc(this, adzbVar), this.k.b, java.util.concurrent.TimeUnit.NANOSECONDS));
            }
        }
        t(adzgVarP);
    }

    public final void n(java.io.InputStream inputStream) {
        throw new java.lang.IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final boolean o() {
        java.util.Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((defpackage.adzg) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.adzg p(int i, boolean z, boolean z2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        defpackage.adzg adzgVar = new defpackage.adzg(i);
        defpackage.adyy adyyVar = new defpackage.adyy(new defpackage.adza(this, adzgVar));
        defpackage.adnd adndVar = this.H;
        defpackage.adnd adndVar2 = new defpackage.adnd();
        adndVar2.e(adndVar);
        if (i > 0) {
            adndVar2.f(a, java.lang.String.valueOf(i));
        }
        defpackage.adjw adjwVarI = this.C.i(adyyVar);
        defpackage.adkb[] adkbVarArrK = defpackage.adve.k(adjwVarI);
        defpackage.adkr adkrVarA = this.D.a();
        try {
            adti adtiVarB = this.E.b.x.b(this.B, adndVar2, adjwVarI, adkbVarArrK);
            this.D.f(adkrVarA);
            adzgVar.a = adtiVarB;
            return adzgVar;
        } catch (java.lang.Throwable th) {
            this.D.f(adkrVarA);
            throw th;
        }
    }

    public final java.lang.Runnable q(defpackage.adzg adzgVar) {
        java.util.List list;
        boolean z;
        java.util.Collection collectionSingleton;
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            java.util.Collection collection = this.r.c;
            defpackage.adze adzeVar = this.r;
            defpackage.ysr.bk(adzeVar.f == null, "Already committed");
            java.util.List list2 = adzeVar.b;
            if (adzeVar.c.contains(adzgVar)) {
                list = null;
                collectionSingleton = java.util.Collections.singleton(adzgVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collectionSingleton = java.util.Collections.EMPTY_LIST;
            }
            this.r = new defpackage.adze(list, collectionSingleton, adzeVar.d, adzgVar, adzeVar.g, z, adzeVar.h, adzeVar.e);
            this.G.D(-this.v);
            adzb adzbVar = this.x;
            boolean z2 = adzbVar == null;
            boolean z3 = adzbVar != null ? adzbVar.c : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                java.util.concurrent.Future futureA = adzbVar.a();
                this.x = null;
                future = futureA;
            }
            adzb adzbVar2 = this.y;
            if (adzbVar2 != null) {
                java.util.concurrent.Future futureA2 = adzbVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new defpackage.adyt(this, collection, adzgVar, z4, future, z3, future2);
        }
    }

    public final void r(defpackage.adzg adzgVar) {
        java.lang.Runnable runnableQ = q(adzgVar);
        if (runnableQ != null) {
            this.g.execute(runnableQ);
        }
    }

    public final void s(adyz adyzVar) {
        java.util.Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(adyzVar);
            }
            collection = this.r.c;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            adyzVar.a((defpackage.adzg) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r7 = (adyz) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.adzd);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.adzg r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            adze r6 = r9.r     // Catch: java.lang.Throwable -> La5
            adzg r7 = r6.f     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            goto L35
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            goto L35
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La5
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La5
            if (r2 != r8) goto L5a
            adze r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La5
            r9.r = r0     // Catch: java.lang.Throwable -> La5
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            return
        L2e:
            adxw r1 = new adxw     // Catch: java.lang.Throwable -> La5
            r0 = 7
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
        L35:
            if (r1 == 0) goto L3d
            java.util.concurrent.Executor r9 = r9.h
            r9.execute(r1)
            return
        L3d:
            if (r4 != 0) goto L49
            adti r0 = r10.a
            adzf r1 = new adzf
            r1.<init>(r9, r10)
            r0.m(r1)
        L49:
            adti r0 = r10.a
            adze r1 = r9.r
            adzg r1 = r1.f
            if (r1 != r10) goto L54
            ador r9 = r9.I
            goto L56
        L54:
            ador r9 = defpackage.adzi.c
        L56:
            r0.c(r9)
            return
        L5a:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L60
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            return
        L60:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La5
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L76
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La5
            goto L80
        L76:
            r3.clear()     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La5
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            int r2 = r3.size()
            r5 = r0
        L86:
            if (r5 >= r2) goto La2
            java.lang.Object r7 = r3.get(r5)
            adyz r7 = (adyz) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.adzd
            r4 = r4 | r7
            adze r7 = r9.r
            adzg r8 = r7.f
            if (r8 == 0) goto L9c
            if (r8 != r10) goto La2
        L9c:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L86
        La2:
            r2 = r6
            goto L5
        La5:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adzi.t(adzg):void");
    }

    public final void u() {
        java.util.concurrent.Future future;
        synchronized (this.m) {
            adzb adzbVar = this.y;
            future = null;
            if (adzbVar != null) {
                java.util.concurrent.Future futureA = adzbVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar) {
        this.F = new defpackage.kez(adorVar, adtjVar, adndVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new defpackage.adsh(this, adorVar, adtjVar, adndVar, 3));
        }
    }

    public final boolean w(defpackage.adze adzeVar) {
        return adzeVar.f == null && adzeVar.e < this.k.a && !adzeVar.h;
    }
}
