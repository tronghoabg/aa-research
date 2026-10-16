package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adth extends defpackage.adrq {
    public static final double a;
    private static final java.util.logging.Logger k = java.util.logging.Logger.getLogger(defpackage.adth.class.getName());
    public final defpackage.adng b;
    public final java.util.concurrent.Executor c;
    public final defpackage.adsx d;
    public final defpackage.adkr e;
    public defpackage.adtb f;
    public defpackage.adjw g;
    public adti h;
    public final java.util.concurrent.ScheduledExecutorService i;
    public defpackage.adku j;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final defpackage.adwh p;

    static {
        "gzip".getBytes(java.nio.charset.Charset.forName("US-ASCII"));
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        a = 1.0E9d;
    }

    public adth(defpackage.adng adngVar, java.util.concurrent.Executor executor, defpackage.adjw adjwVar, defpackage.adwh adwhVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.adsx adsxVar) {
        super(null);
        this.j = defpackage.adku.b;
        defpackage.adkf adkfVar = defpackage.adkf.a;
        this.b = adngVar;
        java.lang.String str = adngVar.b;
        java.lang.System.identityHashCode(this);
        int i = defpackage.aefb.a;
        if (executor == defpackage.zgt.INSTANCE) {
            this.c = new adzn();
            this.l = true;
        } else {
            this.c = new defpackage.adzr(executor);
            this.l = false;
        }
        this.d = adsxVar;
        this.e = defpackage.adkr.k();
        defpackage.adnf adnfVar = adngVar.a;
        this.m = adnfVar == defpackage.adnf.a || adnfVar == defpackage.adnf.c;
        this.g = adjwVar;
        this.p = adwhVar;
        this.i = scheduledExecutorService;
    }

    public static final void l(defpackage.adrq adrqVar, defpackage.ador adorVar, defpackage.adnd adndVar) {
        try {
            adrqVar.a(adorVar, adndVar);
        } catch (java.lang.RuntimeException e) {
            k.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (java.lang.Throwable) e);
        }
    }

    private final void o(java.lang.Object obj) {
        defpackage.ysr.bk(this.h != null, "Not started");
        defpackage.ysr.bk(!this.n, "call was cancelled");
        defpackage.ysr.bk(!this.o, "call was half-closed");
        try {
            adti adtiVar = this.h;
            if (adtiVar instanceof defpackage.adzi) {
                defpackage.adzi adziVar = (defpackage.adzi) adtiVar;
                defpackage.adze adzeVar = adziVar.r;
                if (adzeVar.a) {
                    adzeVar.f.a.n(adziVar.f.a(obj));
                } else {
                    adziVar.s(new defpackage.adyx(adziVar, obj));
                }
            } else {
                adtiVar.n(this.b.a(obj));
            }
            if (this.m) {
                return;
            }
            this.h.d();
        } catch (java.lang.Error e) {
            this.h.c(defpackage.ador.c.e("Client sendMessage() failed with Error"));
            throw e;
        } catch (java.lang.RuntimeException e2) {
            this.h.c(defpackage.ador.c.d(e2).e("Failed to stream message"));
        }
    }

    @Override // defpackage.adrq
    public final void b(defpackage.adrq adrqVar, defpackage.adnd adndVar) {
        adti adziVar;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        defpackage.adjw adjwVar;
        int i = defpackage.aefb.a;
        defpackage.ysr.bk(this.h == null, "Already started");
        defpackage.ysr.bk(!this.n, "call was cancelled");
        adrqVar.getClass();
        adndVar.getClass();
        defpackage.adkr adkrVar = this.e;
        if (adkrVar.i()) {
            this.h = defpackage.adxt.a;
            this.c.execute(new adta(this, adrqVar));
            return;
        }
        defpackage.adxf adxfVar = (defpackage.adxf) this.g.g(defpackage.adxf.a);
        if (adxfVar != null) {
            java.lang.Long l = adxfVar.b;
            if (l != null) {
                defpackage.adks adksVarC = defpackage.adks.c(l.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS);
                defpackage.adks adksVar = this.g.b;
                if (adksVar == null || adksVarC.compareTo(adksVar) < 0) {
                    this.g = this.g.b(adksVarC);
                }
            }
            java.lang.Boolean bool = adxfVar.c;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                defpackage.adjw adjwVar2 = this.g;
                if (zBooleanValue) {
                    adju adjuVarA = defpackage.adjw.a(adjwVar2);
                    adjuVarA.e = java.lang.Boolean.TRUE;
                    adjwVar = new defpackage.adjw(adjuVarA);
                } else {
                    adju adjuVarA2 = defpackage.adjw.a(adjwVar2);
                    adjuVarA2.e = java.lang.Boolean.FALSE;
                    adjwVar = new defpackage.adjw(adjuVarA2);
                }
                this.g = adjwVar;
            }
            java.lang.Integer num = adxfVar.d;
            if (num != null) {
                defpackage.adjw adjwVar3 = this.g;
                java.lang.Integer num2 = adjwVar3.f;
                if (num2 != null) {
                    this.g = adjwVar3.d(java.lang.Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = adjwVar3.d(num.intValue());
                }
            }
            java.lang.Integer num3 = adxfVar.e;
            if (num3 != null) {
                defpackage.adjw adjwVar4 = this.g;
                java.lang.Integer num4 = adjwVar4.g;
                if (num4 != null) {
                    this.g = adjwVar4.e(java.lang.Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = adjwVar4.e(num3.intValue());
                }
            }
        }
        adkd adkdVar = defpackage.adkc.a;
        defpackage.adku adkuVar = this.j;
        adndVar.d(defpackage.adve.g);
        adndVar.d(defpackage.adve.c);
        defpackage.admy admyVar = defpackage.adve.d;
        adndVar.d(admyVar);
        byte[] bArr = adkuVar.c;
        if (bArr.length != 0) {
            adndVar.f(admyVar, bArr);
        }
        adndVar.d(defpackage.adve.e);
        adndVar.d(defpackage.adve.f);
        defpackage.adks adksVarK = k();
        boolean z = adksVarK != null && adksVarK.equals(adkrVar.b());
        defpackage.adtb adtbVar = new defpackage.adtb(this, adksVarK, z);
        this.f = adtbVar;
        if (adksVarK == null || adtbVar.c > 0) {
            defpackage.adwh adwhVar = this.p;
            defpackage.adng adngVar = this.b;
            defpackage.adjw adjwVar5 = this.g;
            defpackage.adww adwwVar = adwhVar.b;
            if (adwwVar.O) {
                defpackage.adxf adxfVar2 = (defpackage.adxf) adjwVar5.g(defpackage.adxf.a);
                adziVar = new defpackage.adzi(adwhVar, adngVar, adndVar, adjwVar5, adxfVar2 == null ? null : adxfVar2.f, adxfVar2 != null ? adxfVar2.g : null, adkrVar);
            } else {
                defpackage.adkb[] adkbVarArrK = defpackage.adve.k(adjwVar5);
                defpackage.adkr adkrVarA = adkrVar.a();
                try {
                    adziVar = adwwVar.x.b(adngVar, adndVar, adjwVar5, adkbVarArrK);
                    adkrVar.f(adkrVarA);
                } catch (java.lang.Throwable th) {
                    adkrVar.f(adkrVarA);
                    throw th;
                }
            }
            this.h = adziVar;
        } else {
            defpackage.adkb[] adkbVarArrK2 = defpackage.adve.k(this.g);
            java.lang.String str = true != z ? "CallOptions" : "Context";
            java.lang.Long l2 = (java.lang.Long) this.g.g(defpackage.adkb.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new defpackage.aduq(defpackage.ador.f.e(java.lang.String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, java.lang.Double.valueOf(d / d2), java.lang.Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), adkbVarArrK2);
        }
        if (this.l) {
            this.h.f();
        }
        defpackage.adjw adjwVar6 = this.g;
        java.lang.String str2 = adjwVar6.d;
        java.lang.Integer num5 = adjwVar6.f;
        if (num5 != null) {
            this.h.k(num5.intValue());
        }
        java.lang.Integer num6 = this.g.g;
        if (num6 != null) {
            this.h.l(num6.intValue());
        }
        if (adksVarK != null) {
            this.h.i(adksVarK);
        }
        this.h.h(adkdVar);
        this.h.j(this.j);
        this.d.b();
        this.h.m(new defpackage.adtg(this, adrqVar));
        defpackage.adtb adtbVar2 = this.f;
        if (adtbVar2.e) {
            return;
        }
        if (adtbVar2.b && !adtbVar2.a && (scheduledExecutorService = adtbVar2.f.i) != null) {
            adtbVar2.d = scheduledExecutorService.schedule(new defpackage.adwb(adtbVar2), adtbVar2.c, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        adtbVar2.f.e.d(adtbVar2, defpackage.zgt.INSTANCE);
        if (adtbVar2.e) {
            adtbVar2.c();
        }
    }

    @Override // defpackage.adrq
    public final void i(java.lang.String str, java.lang.Throwable th) {
        int i = defpackage.aefb.a;
        if (str == null && th == null) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Cancelled without a message or cause");
            k.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (java.lang.Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.h != null) {
                defpackage.ador adorVar = defpackage.ador.c;
                defpackage.ador adorVarE = str != null ? adorVar.e(str) : adorVar.e("Call cancelled without message");
                if (th != null) {
                    adorVarE = adorVarE.d(th);
                }
                this.h.c(adorVarE);
            }
            if (this.f != null) {
            }
        } finally {
            defpackage.adtb adtbVar = this.f;
            if (adtbVar != null) {
                adtbVar.c();
            }
        }
    }

    @Override // defpackage.adrq
    public final void j() {
        int i = defpackage.aefb.a;
        defpackage.ysr.bk(this.h != null, "Not started");
        defpackage.ysr.bk(!this.n, "call was cancelled");
        defpackage.ysr.bk(!this.o, "call already half-closed");
        this.o = true;
        this.h.e();
    }

    public final defpackage.adks k() {
        defpackage.adks adksVar = this.g.b;
        defpackage.adks adksVarB = this.e.b();
        if (adksVar != null) {
            if (adksVarB != null) {
                adksVar.d(adksVarB);
                if (true != adksVar.e(adksVarB)) {
                }
            }
            return adksVar;
        }
        return adksVarB;
    }

    @Override // defpackage.adrq
    public final void m(int i) {
        int i2 = defpackage.aefb.a;
        defpackage.ysr.bk(this.h != null, "Not started");
        this.h.g(i);
    }

    @Override // defpackage.adrq
    public final void n(java.lang.Object obj) {
        int i = defpackage.aefb.a;
        o(obj);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("method", this.b);
        return xymVarBy.toString();
    }
}
