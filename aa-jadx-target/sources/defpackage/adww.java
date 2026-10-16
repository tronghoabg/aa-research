package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adww extends defpackage.admn implements adln {
    public static final defpackage.adrq T;
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adww.class.getName());
    static final defpackage.ador b;
    static final defpackage.ador c;
    public static final defpackage.adxh d;
    public static final defpackage.adll e;
    public static final admc f;
    public boolean A;
    public volatile boolean B;
    public final adsw C;
    public final defpackage.adsx D;
    public final defpackage.adsz E;
    public final defpackage.adjy F;
    public final defpackage.adlk G;
    public final defpackage.adwt H;
    public defpackage.adxh I;
    public final defpackage.adxh J;
    public boolean K;
    public final boolean L;
    public final long M;
    public final long N;
    public final boolean O;
    final defpackage.advk P;
    public final defpackage.adwh Q;
    public final adni R;
    public int S;
    public final defpackage.sr U;
    private final aebf V;
    private final defpackage.adnt W;
    private final defpackage.adnn X;
    private final defpackage.adml Y;
    private final defpackage.adyp Z;
    private final adxu aa;
    private final defpackage.adwl ab;
    private final defpackage.adwl ac;
    private final long ad;
    private final defpackage.adjx ae;
    private final java.util.concurrent.CountDownLatch af;
    private final adxi ag;
    private final defpackage.adyr ah;
    private final defpackage.aeao ai;
    public final defpackage.adlo g;
    public final java.lang.String h;
    public final adtn i;
    public final defpackage.adwu j;
    public final java.util.concurrent.Executor k;
    public final defpackage.aeba l;
    final defpackage.adox m;
    public final defpackage.adku n;
    public final defpackage.adtu o;
    public final java.util.List p;
    public defpackage.adns q;
    public boolean r;
    public defpackage.adwn s;
    public boolean t;
    public final java.util.Set u;
    public java.util.Collection v;
    public final java.lang.Object w;
    public final defpackage.aduf x;
    public final defpackage.adwv y;
    public final java.util.concurrent.atomic.AtomicBoolean z;

    static {
        defpackage.ador.m.e("Channel shutdownNow invoked");
        b = defpackage.ador.m.e("Channel shutdown invoked");
        c = defpackage.ador.m.e("Subchannel shutdown invoked");
        d = new defpackage.adxh(null, new java.util.HashMap(), new java.util.HashMap(), null, null, null);
        e = new adwd();
        f = new adxv();
        T = new defpackage.adwg();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public adww(defpackage.adxc adxcVar, adtn adtnVar, aebf aebfVar, defpackage.adnt adntVar, adxu adxuVar, defpackage.xzi xziVar, java.util.List list, defpackage.aeba aebaVar) {
        defpackage.adyp adypVar;
        defpackage.adox adoxVar = new defpackage.adox(new adwf(this, 0));
        this.m = adoxVar;
        this.o = new defpackage.adtu();
        this.u = new java.util.HashSet(16, 0.75f);
        this.w = new java.lang.Object();
        this.y = new defpackage.adwv(this);
        this.z = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.af = new java.util.concurrent.CountDownLatch(1);
        this.S = 1;
        this.I = d;
        this.K = false;
        this.U = new defpackage.sr((char[]) null, (char[]) null);
        defpackage.adrs adrsVar = defpackage.adks.b;
        this.ag = new defpackage.adwk(this);
        this.P = new defpackage.adwm(this);
        this.Q = new defpackage.adwh(this);
        defpackage.aeao aeaoVar = adxcVar.B;
        this.ai = aeaoVar;
        java.lang.String str = adxcVar.k;
        str.getClass();
        this.h = str;
        defpackage.adlo adloVarB = defpackage.adlo.b("Channel", str);
        this.g = adloVarB;
        aebaVar.getClass();
        this.l = aebaVar;
        adxu adxuVar2 = adxcVar.f;
        adxuVar2.getClass();
        this.aa = adxuVar2;
        ?? A = adxuVar2.a();
        A.getClass();
        this.k = A;
        if (adtnVar instanceof defpackage.adyp) {
            adypVar = (defpackage.adyp) adtnVar;
            this.Z = adypVar;
        } else {
            defpackage.adyp adypVar2 = new defpackage.adyp(adtnVar);
            this.Z = adypVar2;
            adypVar = adypVar2;
        }
        adxu adxuVar3 = adxcVar.g;
        adxuVar3.getClass();
        defpackage.adwl adwlVar = new defpackage.adwl(adxuVar3);
        this.ac = adwlVar;
        defpackage.adsv adsvVar = new defpackage.adsv(adypVar, adwlVar);
        this.i = adsvVar;
        defpackage.adwu adwuVar = new defpackage.adwu(adsvVar.c(), 0);
        this.j = adwuVar;
        defpackage.adsz adszVar = new defpackage.adsz(adloVarB, aebaVar.a(), "Channel for '" + str + "'");
        this.E = adszVar;
        defpackage.adsy adsyVar = new defpackage.adsy(adszVar, aebaVar);
        this.F = adsyVar;
        adoe adoeVar = defpackage.adve.m;
        boolean z = adxcVar.q;
        this.O = z;
        defpackage.adss adssVar = new defpackage.adss(defpackage.admm.b());
        this.Y = adssVar;
        this.V = aebfVar;
        this.W = adntVar;
        defpackage.adnr adnrVar = new defpackage.adnr(z, adssVar);
        defpackage.adxs adxsVar = new defpackage.adxs(adxcVar.y, defpackage.adnh.a());
        this.R = adxsVar;
        adnl adnlVar = new adnl();
        adnlVar.a = 443;
        adoeVar.getClass();
        adnlVar.b = adoeVar;
        adnlVar.c = adoxVar;
        adnlVar.e = adwuVar;
        adnlVar.d = adnrVar;
        adnlVar.f = adsyVar;
        adnlVar.g = adwlVar;
        adnlVar.h = adxsVar;
        adnlVar.i = adxcVar.i;
        aeaoVar.getClass();
        java.util.IdentityHashMap identityHashMap = adxcVar.l;
        if (identityHashMap != null) {
            for (java.util.Map.Entry entry : identityHashMap.entrySet()) {
                defpackage.adnm adnmVar = (defpackage.adnm) entry.getKey();
                java.lang.Object value = entry.getValue();
                adnmVar.getClass();
                value.getClass();
                if (adnlVar.j == null) {
                    adnlVar.j = new java.util.IdentityHashMap();
                }
                adnlVar.j.put(adnmVar, value);
            }
        }
        defpackage.adnn adnnVar = new defpackage.adnn(adnlVar);
        this.X = adnnVar;
        this.q = n(aebfVar, adntVar, adnnVar);
        this.ab = new defpackage.adwl(adxuVar);
        defpackage.aduf adufVar = new defpackage.aduf(this.k, this.m);
        this.x = adufVar;
        adxi adxiVar = this.ag;
        adufVar.f = adxiVar;
        adufVar.c = new defpackage.adkj(adxiVar, 15);
        adufVar.d = new defpackage.adkj(adxiVar, 16);
        adufVar.e = new defpackage.adkj(adxiVar, 17);
        java.util.Map map = adxcVar.s;
        if (map != null) {
            defpackage.adno adnoVarA = adnrVar.a(map);
            defpackage.ador adorVar = adnoVarA.a;
            defpackage.ysr.bn(adorVar == null, "Default config is invalid: %s", adorVar);
            defpackage.adxh adxhVar = (defpackage.adxh) adnoVarA.b;
            this.J = adxhVar;
            this.Q.a = adxhVar.a;
        } else {
            this.J = null;
        }
        this.L = true;
        defpackage.adwt adwtVar = new defpackage.adwt(this, this.q.a());
        this.H = adwtVar;
        this.ae = defpackage.adrq.u(adwtVar, list);
        this.p = new java.util.ArrayList(adxcVar.j);
        xziVar.getClass();
        long j = adxcVar.p;
        if (j == -1) {
            this.ad = -1L;
        } else {
            defpackage.ysr.bb(j >= defpackage.adxc.c, "invalid idleTimeoutMillis %s", j);
            this.ad = adxcVar.p;
        }
        this.ah = new defpackage.adyr(new defpackage.adug(this, 15), this.m, this.i.c(), new defpackage.xzg());
        defpackage.adku adkuVar = adxcVar.n;
        adkuVar.getClass();
        this.n = adkuVar;
        adxcVar.o.getClass();
        this.N = 16777216L;
        this.M = 1048576L;
        defpackage.adwe adweVar = new defpackage.adwe(aebaVar);
        this.C = adweVar;
        this.D = adweVar.a();
        defpackage.adlk adlkVar = adxcVar.r;
        adlkVar.getClass();
        this.G = adlkVar;
        defpackage.adlk.b(adlkVar.d, this);
    }

    static defpackage.adns n(aebf aebfVar, defpackage.adnt adntVar, defpackage.adnn adnnVar) {
        defpackage.adns adnsVarA = aebfVar.a(adntVar, adnnVar);
        if (adnsVarA == null) {
            throw new java.lang.IllegalArgumentException("cannot create a NameResolver for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aebfVar))));
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = adnnVar.e;
        if (scheduledExecutorService != null) {
            return new defpackage.adzm(adnsVarA, new defpackage.adst(scheduledExecutorService, adnnVar.c));
        }
        throw new java.lang.IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.adjx
    public final java.lang.String a() {
        return this.ae.a();
    }

    @Override // defpackage.admn
    public final void b() {
        this.m.execute(new defpackage.adug(this, 13));
    }

    @Override // defpackage.admn
    public final /* bridge */ /* synthetic */ void c() {
        throw null;
    }

    @Override // defpackage.adjx
    public final defpackage.adrq d(defpackage.adng adngVar, defpackage.adjw adjwVar) {
        return this.ae.d(adngVar, adjwVar);
    }

    public final defpackage.adlo e() {
        return this.g;
    }

    public final java.util.concurrent.Executor f(defpackage.adjw adjwVar) {
        java.util.concurrent.Executor executor = adjwVar.c;
        return executor == null ? this.k : executor;
    }

    public final void g(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        defpackage.adyr adyrVar = this.ah;
        adyrVar.e = false;
        if (!z || (scheduledFuture = adyrVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        adyrVar.f = null;
    }

    public final void h() {
        l(true);
        defpackage.aduf adufVar = this.x;
        adufVar.a(null);
        this.F.a(2, "Entering IDLE state");
        this.o.a(defpackage.adkh.d);
        java.lang.Object[] objArr = {this.w, adufVar};
        for (int i = 0; i < 2; i++) {
            if (this.P.a.contains(objArr[i])) {
                i();
                return;
            }
        }
    }

    final void i() {
        this.m.c();
        if (this.z.get() || this.t) {
            return;
        }
        if (this.P.a.isEmpty()) {
            k();
        } else {
            g(false);
        }
        if (this.s == null) {
            this.F.a(2, "Exiting idle mode");
            defpackage.adwn adwnVar = new defpackage.adwn(this);
            adwnVar.a = new defpackage.adsr((defpackage.adss) this.Y, adwnVar);
            this.s = adwnVar;
            this.o.a(defpackage.adkh.a);
            this.q.d(new defpackage.adwo(this, adwnVar, this.q));
            this.r = true;
        }
    }

    public final void j() {
        if (!this.B && this.z.get() && this.u.isEmpty()) {
            this.F.a(2, "Terminated");
            defpackage.adlk.c(this.G.d, this);
            this.aa.b(this.k);
            this.ab.b();
            this.ac.b();
            this.i.close();
            this.B = true;
            this.af.countDown();
        }
    }

    public final void k() {
        long j = this.ad;
        if (j == -1) {
            return;
        }
        defpackage.adyr adyrVar = this.ah;
        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
        long jA = adyrVar.a() + nanos;
        adyrVar.e = true;
        if (jA - adyrVar.d < 0 || adyrVar.f == null) {
            java.util.concurrent.ScheduledFuture scheduledFuture = adyrVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            adyrVar.f = adyrVar.a.schedule((java.lang.Runnable) new adxw(adyrVar, 5), nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        adyrVar.d = jA;
    }

    public final void l(boolean z) {
        this.m.c();
        if (z) {
            defpackage.ysr.bk(this.r, "nameResolver is not started");
            defpackage.ysr.bk(this.s != null, "lbHelper is null");
        }
        defpackage.adns adnsVar = this.q;
        if (adnsVar != null) {
            adnsVar.c();
            this.r = false;
            if (z) {
                this.q = n(this.V, this.W, this.X);
            } else {
                this.q = null;
            }
        }
        defpackage.adwn adwnVar = this.s;
        if (adwnVar != null) {
            adwnVar.a.d();
            this.s = null;
        }
    }

    public final void m(defpackage.admh admhVar) {
        this.x.a(admhVar);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.g("logId", this.g.a);
        xymVarBy.b("target", this.h);
        return xymVarBy.toString();
    }
}
