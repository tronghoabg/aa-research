package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class adud extends defpackage.adrq {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adud.class.getName());
    private static final defpackage.adrq l = new defpackage.adua();
    public final java.lang.String b;
    public final defpackage.adkr c;
    public volatile boolean d;
    public java.util.List e;
    public defpackage.aduc f;
    public defpackage.adrq g;
    private final java.util.concurrent.ScheduledFuture h;
    private final java.util.concurrent.Executor i;
    private defpackage.adnd j;
    private defpackage.ador k;
    private defpackage.adrq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected adud(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.adks adksVar) {
        defpackage.adud adudVar;
        long jB;
        java.lang.String str;
        super(null);
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = null;
        this.e = new java.util.ArrayList();
        this.b = "name_resolver";
        executor.getClass();
        this.i = executor;
        scheduledExecutorService.getClass();
        defpackage.adkr adkrVarK = defpackage.adkr.k();
        this.c = adkrVarK;
        defpackage.adks adksVarB = adkrVarK.b();
        if (adksVar == null || !(adksVarB == null || adksVar.e(adksVarB))) {
            if (adksVarB != null) {
                jB = adksVarB.b(java.util.concurrent.TimeUnit.NANOSECONDS);
                java.util.logging.Logger logger = a;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "Call timeout set to '%d' ns, due to context deadline.", java.lang.Long.valueOf(jB)));
                    if (adksVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(java.lang.String.format(java.util.Locale.US, " Explicit call timeout was '%d' ns.", java.lang.Long.valueOf(adksVar.b(java.util.concurrent.TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(java.util.logging.Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
                str = "Context";
            } else {
                adudVar = this;
            }
            adudVar.h = scheduledFutureSchedule;
        }
        jB = adksVar.b(java.util.concurrent.TimeUnit.NANOSECONDS);
        str = "CallOptions";
        long j = jB;
        adudVar = this;
        scheduledFutureSchedule = scheduledExecutorService.schedule(new defpackage.joy(adudVar, j, str, 7), j, java.util.concurrent.TimeUnit.NANOSECONDS);
        adudVar.h = scheduledFutureSchedule;
    }

    private final void aT(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    public final void aR(defpackage.adrq adrqVar) {
        defpackage.adrq adrqVar2 = this.g;
        defpackage.ysr.bn(adrqVar2 == null, "realCall already set to %s", adrqVar2);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = adrqVar;
    }

    public final void aS(defpackage.adrq adrqVar) {
        defpackage.adnd adndVar = this.j;
        this.j = null;
        defpackage.unw unwVar = new defpackage.unw((java.lang.Object) this, (java.lang.Object) adrqVar, (java.lang.Object) adndVar, 15, (short[]) null);
        defpackage.adkr adkrVar = this.c;
        defpackage.adkr adkrVarA = adkrVar.a();
        try {
            unwVar.run();
        } finally {
            adkrVar.f(adkrVarA);
        }
    }

    @Override // defpackage.adrq
    public final void b(defpackage.adrq adrqVar, defpackage.adnd adndVar) {
        defpackage.ador adorVar;
        boolean z;
        adndVar.getClass();
        defpackage.ysr.bk(this.m == null, "already started");
        synchronized (this) {
            adrqVar.getClass();
            this.m = adrqVar;
            adorVar = this.k;
            z = this.d;
            if (!z) {
                defpackage.aduc aducVar = new defpackage.aduc(this, adrqVar);
                this.f = aducVar;
                this.j = adndVar;
                adrqVar = aducVar;
            }
        }
        if (adorVar != null) {
            this.i.execute(new defpackage.adub(this, adrqVar, adorVar));
        } else if (z) {
            this.g.b(adrqVar, adndVar);
        }
    }

    @Override // defpackage.adrq
    public final void i(java.lang.String str, java.lang.Throwable th) {
        defpackage.ador adorVar = defpackage.ador.c;
        defpackage.ador adorVarE = str != null ? adorVar.e(str) : adorVar.e("Call cancelled without message");
        if (th != null) {
            adorVarE = adorVarE.d(th);
        }
        l(adorVarE, false);
    }

    @Override // defpackage.adrq
    public final void j() {
        aT(new defpackage.adkj(this, 13));
    }

    public final void l(defpackage.ador adorVar, boolean z) {
        boolean z2;
        defpackage.adrq adrqVar;
        synchronized (this) {
            if (this.g == null) {
                aR(l);
                adrqVar = this.m;
                this.k = adorVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                z2 = true;
                adrqVar = null;
            }
            if (z2) {
                aT(new defpackage.aafx(this, adorVar, 6, (byte[]) null));
            } else {
                if (adrqVar != null) {
                    this.i.execute(new defpackage.adub(this, adrqVar, adorVar));
                }
                aS(adrqVar);
                o();
            }
            k();
        }
    }

    @Override // defpackage.adrq
    public final void m(int i) {
        if (this.d) {
            this.g.m(i);
        } else {
            aT(new defpackage.adtz(this, i, 0));
        }
    }

    @Override // defpackage.adrq
    public final void n(java.lang.Object obj) {
        if (this.d) {
            this.g.n(obj);
        } else {
            aT(new defpackage.aafx(this, obj, 7, (char[]) null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.e = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L42
            aduc r0 = r3.f     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.i
            adty r2 = new adty
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L42
            r3.e = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adud.o():void");
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("realCall", this.g);
        return xymVarBy.toString();
    }

    protected void k() {
    }
}
