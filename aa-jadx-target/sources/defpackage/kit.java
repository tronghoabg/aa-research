package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kit implements defpackage.lhn {
    public static final defpackage.yqm a;
    public static final defpackage.yhx b;
    private static final defpackage.tfe o;
    public final defpackage.tfh c;
    public rcn d;
    public rcp e;
    public boolean f;
    public final defpackage.kiq g;
    public final defpackage.qtv h;
    public final java.util.EnumSet i;
    public final java.util.EnumSet j;
    public final java.util.concurrent.CopyOnWriteArraySet k;
    public final defpackage.yfd l;
    public final defpackage.rco m;
    public final defpackage.qrb n;
    private boolean p;

    static {
        defpackage.yqm yqmVarC = defpackage.yqm.c("GH.CarClientManager");
        a = yqmVarC;
        b = defpackage.yhx.q(defpackage.kis.c, defpackage.kis.d, defpackage.kis.e);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        java.util.logging.Level.FINEST.getClass();
        defpackage.tfh.a.getClass();
        java.util.logging.Level level = java.util.logging.Level.INFO;
        level.getClass();
        yqmVarC.getClass();
        o = new defpackage.tfe(1, zgtVar, level, yqmVarC);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    protected kit(android.content.Context context) throws wfo {
        defpackage.kis kisVar = defpackage.kis.a;
        defpackage.tfd tfdVar = new defpackage.tfd(kisVar, o);
        tfdVar.c = new defpackage.tff(0);
        defpackage.kis kisVar2 = defpackage.kis.c;
        tfdVar.b(kisVar, kisVar2);
        defpackage.kis kisVar3 = defpackage.kis.b;
        tfdVar.b(kisVar, kisVar3);
        defpackage.kis kisVar4 = defpackage.kis.d;
        tfdVar.b(kisVar2, kisVar4);
        tfdVar.b(kisVar2, kisVar3);
        defpackage.kis kisVar5 = defpackage.kis.f;
        tfdVar.b(kisVar2, kisVar5);
        tfdVar.b(kisVar4, kisVar2);
        tfdVar.b(kisVar5, kisVar2);
        tfdVar.b(kisVar5, kisVar3);
        this.c = tfdVar.a();
        this.g = new defpackage.kiq();
        this.i = java.util.EnumSet.noneOf(defpackage.kir.class);
        this.j = java.util.EnumSet.noneOf(defpackage.kir.class);
        this.k = new java.util.concurrent.CopyOnWriteArraySet();
        this.l = new defpackage.yfd(100);
        this.m = new defpackage.wzp(this, 1);
        this.n = new defpackage.kio(this);
        defpackage.wfp.c();
        this.h = (defpackage.qtv) new defpackage.nub((java.lang.Object) null).h(new defpackage.jbr(this, context, 6));
    }

    public static defpackage.kit b() {
        return (defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class);
    }

    public final defpackage.kis a() {
        return (defpackage.kis) this.c.b();
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 3152)).u("stop");
        defpackage.wfp.c();
        java.util.EnumSet enumSet = this.i;
        if (enumSet.isEmpty()) {
            f();
        } else {
            this.j.addAll(enumSet);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.qsh e() {
        defpackage.kip kipVarA = this.g.a();
        try {
            if (!q()) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(new java.lang.RuntimeException("Current stack"))).ai(3123)).u("getToken() called while client was disconnected!");
            }
            n(this.p);
            defpackage.qtv qtvVar = this.h;
            kipVarA.close();
            return qtvVar;
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3150)).u("start");
        defpackage.wfp.c();
        defpackage.kip kipVarB = this.g.b();
        try {
            if (s()) {
                ((defpackage.yqj) yqmVar.l().ai(3151)).u("client already started");
            } else {
                this.h.e();
            }
            kipVarB.close();
        } catch (java.lang.Throwable th) {
            try {
                kipVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void f() throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3121)).u("Disconnecting CarClientToken and resetting state");
        defpackage.wfp.c();
        defpackage.kip kipVarB = this.g.b();
        try {
            if (s()) {
                this.h.g();
            }
            m(defpackage.kis.a);
            kipVarB.close();
        } catch (java.lang.Throwable th) {
            try {
                kipVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void g();

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    protected final void h() throws wfo {
        defpackage.wfp.c();
        if (a() != defpackage.kis.d) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3140)).y("Received car onDisconnected in state %s. Car is not currently expected to be connected.", new defpackage.zkf(defpackage.zke.a, a().name()));
        }
        defpackage.yqm yqmVar = a;
        defpackage.ypu ypuVarF = yqmVar.f();
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(defpackage.jrj.a());
        defpackage.zke zkeVar = defpackage.zke.a;
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 3139)).y("car disconnected. isProjected: %s", new defpackage.zkf(zkeVar, boolValueOf));
        m(defpackage.kis.e);
        defpackage.wfp.c();
        ((defpackage.yqj) yqmVar.l().ai((char) 3127)).u("notifyListenersOnCarDisconnected entered");
        java.util.concurrent.CopyOnWriteArraySet<defpackage.kfp> copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            for (defpackage.kfp kfpVar : copyOnWriteArraySet) {
                ((defpackage.yqj) yqmVar.l().ai(3128)).y("calling onCarDisconnected on %s", new defpackage.zkf(zkeVar, kfpVar));
                kfpVar.b();
            }
        }
        defpackage.kip kipVarA = this.g.a();
        try {
            this.p = false;
            kipVarA.close();
            i();
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected abstract void j();

    public abstract void k();

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void m(defpackage.kis kisVar) throws wfo {
        defpackage.wfp.c();
        this.c.c(kisVar);
        this.l.add(android.util.Pair.create(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), a().name()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean o() throws wfo {
        defpackage.wfp.c();
        return this.i.isEmpty();
    }

    public final boolean p() {
        return a() == defpackage.kis.d;
    }

    public final boolean q() {
        defpackage.kip kipVarA = this.g.a();
        try {
            boolean zB = this.h.b();
            kipVarA.close();
            return zB;
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean r() {
        try {
            defpackage.kip kipVarA = this.g.a();
            try {
                boolean z = q() && defpackage.ooa.h(this.h);
                kipVarA.close();
                return z;
            } catch (java.lang.Throwable th) {
                try {
                    kipVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 3124)).u("Car service not connected");
            return false;
        }
    }

    public final boolean s() {
        defpackage.kip kipVarA = this.g.a();
        try {
            boolean z = true;
            if (!q() && !this.h.c()) {
                z = false;
            }
            kipVarA.close();
            return z;
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void t() throws wfo {
        defpackage.kir kirVar;
        defpackage.wfp.c();
        if (!b.contains(a())) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3138)).y("Received car onConnected in state %s. Skipping callbacks as client is not connected.", new defpackage.zkf(defpackage.zke.a, a().name()));
            return;
        }
        defpackage.kis kisVarA = a();
        defpackage.kis kisVar = defpackage.kis.d;
        if (kisVarA == kisVar) {
            ((defpackage.yqj) a.l().ai((char) 3137)).u("Car already connected. Skipping redundant onCarConnected callbacks.");
            return;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3135)).u("car connected");
        m(kisVar);
        defpackage.kip kipVarA = this.g.a();
        try {
            ((defpackage.yqj) yqmVar.l().ai(3136)).u("notifyListenersOnCarConnected entered");
            this.p = true;
            defpackage.wfp.c();
            ((defpackage.yqj) yqmVar.l().ai(3125)).u("notifyListenersOnCarConnected entered");
            java.util.concurrent.CopyOnWriteArraySet<defpackage.kfp> copyOnWriteArraySet = this.k;
            synchronized (copyOnWriteArraySet) {
                java.util.EnumSet enumSet = this.i;
                kirVar = defpackage.kir.b;
                enumSet.add(kirVar);
                for (defpackage.kfp kfpVar : copyOnWriteArraySet) {
                    ((defpackage.yqj) yqmVar.l().ai(3126)).y("calling onCarConnected on %s", new defpackage.zkf(defpackage.zke.a, kfpVar));
                    kfpVar.a(this.h);
                }
                enumSet.remove(kirVar);
            }
            kipVarA.close();
            if (this.j.remove(kirVar) && o()) {
                f();
            }
        } catch (java.lang.Throwable th) {
            try {
                kipVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected abstract void u();

    public final void v(defpackage.kfp kfpVar) {
        defpackage.wfp.c();
        int iOrdinal = a().ordinal();
        if (iOrdinal == 1) {
            ((defpackage.yqj) a.l().ai((char) 3145)).y("notifying listener that connection had previously failed with result: %s", new defpackage.zkf(defpackage.zke.a, this.e));
            kfpVar.d(this.e);
        } else if (iOrdinal == 2) {
            ((defpackage.yqj) a.l().ai((char) 3146)).u("notifying listener that the client was already connected");
            defpackage.kip kipVarA = this.g.a();
            try {
                kfpVar.c(this.h);
                kipVarA.close();
            } catch (java.lang.Throwable th) {
                try {
                    kipVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else if (iOrdinal == 3) {
            ((defpackage.yqj) a.l().ai((char) 3147)).u("notifying listener that the car was already connected");
            defpackage.kip kipVarA2 = this.g.a();
            try {
                defpackage.qtv qtvVar = this.h;
                kfpVar.c(qtvVar);
                kfpVar.a(qtvVar);
                kipVarA2.close();
            } catch (java.lang.Throwable th3) {
                try {
                    kipVarA2.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } else if (iOrdinal == 4) {
            ((defpackage.yqj) a.l().ai((char) 3148)).u("notifying listener that the car was already disconnected");
            defpackage.kip kipVarA3 = this.g.a();
            try {
                if (q()) {
                    kfpVar.c(this.h);
                }
                kfpVar.b();
                kipVarA3.close();
            } catch (java.lang.Throwable th5) {
                try {
                    kipVarA3.close();
                } catch (java.lang.Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } else if (iOrdinal == 5) {
            ((defpackage.yqj) a.l().ai((char) 3149)).y("notifying listener that connection had previously been suspended for reason: %s", new defpackage.zkf(defpackage.zke.a, this.d));
            kfpVar.eH();
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            copyOnWriteArraySet.add(kfpVar);
            ((defpackage.yqj) a.l().ai(3144)).y("registered listener %s", new defpackage.zkf(defpackage.zke.a, kfpVar));
        }
    }

    public final void w(defpackage.kfp kfpVar) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            copyOnWriteArraySet.remove(kfpVar);
            ((defpackage.yqj) a.l().ai(3153)).y("unregistered listener %s", new defpackage.zkf(defpackage.zke.a, kfpVar));
        }
    }

    protected void i() {
    }

    public void l() {
    }

    protected void n(boolean z) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected kit() {
        defpackage.mkp mkpVar = defpackage.mkp.a;
        android.content.Context context = mkpVar.c;
        mkpVar.f();
        this(context);
    }
}
