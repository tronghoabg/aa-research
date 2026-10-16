package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtv extends defpackage.qsh {
    public final android.content.Context a;
    public final defpackage.rco b;
    public final defpackage.rcq c;
    public final defpackage.rda d;
    public final android.os.Looper e;
    public final java.lang.Object f;
    public final int g;
    private final defpackage.zhs h;
    private volatile defpackage.zhs i;
    private volatile int j;
    private volatile boolean k;
    private volatile boolean l;

    public qtv(android.content.Context context, defpackage.rco rcoVar, defpackage.rcq rcqVar, defpackage.rda rdaVar, android.os.Looper looper, int i) {
        this.g = i;
        defpackage.zif zifVar = new defpackage.zif(new defpackage.rdd("Token not connected."));
        this.h = zifVar;
        this.f = new java.lang.Object();
        this.i = zifVar;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.a = context;
        this.b = rcoVar;
        this.c = rcqVar;
        this.d = rdaVar;
        this.e = looper;
    }

    @Override // defpackage.qsh
    public final defpackage.rcz a() {
        return d();
    }

    @Override // defpackage.qsh
    public final boolean b() {
        boolean zL;
        synchronized (this.f) {
            zL = defpackage.oml.L(this.i);
        }
        return zL;
    }

    @Override // defpackage.qsh
    public final boolean c() {
        boolean z;
        synchronized (this.f) {
            z = !this.i.isDone();
        }
        return z;
    }

    public final defpackage.rei d() {
        defpackage.rei reiVar;
        synchronized (this.f) {
            if (!b()) {
                throw new java.lang.IllegalStateException();
            }
            reiVar = (defpackage.rei) defpackage.ysr.cx(this.i);
        }
        return reiVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.zhs e() {
        defpackage.zhs zhsVar;
        synchronized (this.f) {
            defpackage.zhs zhsVar2 = this.i;
            if (zhsVar2.isDone() && !defpackage.oml.L(zhsVar2)) {
                defpackage.rem remVar = new defpackage.rem(this.a, new defpackage.ren(this), new defpackage.wyz(this));
                android.os.Looper.getMainLooper();
                defpackage.rei reiVar = new defpackage.rei(remVar, this.e);
                int i = this.j + 1;
                this.j = i;
                int i2 = 3;
                if (defpackage.rrx.e("CAR.TOKEN", 4)) {
                    defpackage.zke zkeVar = defpackage.zke.a;
                    defpackage.rrx.d(4, "CAR.TOKEN", null, "Connecting %s using %s (cx attempt %s)", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, reiVar), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
                }
                defpackage.zhm zhmVarV = defpackage.zhm.v(reiVar.m);
                defpackage.kpl kplVar = new defpackage.kpl(reiVar, i2);
                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                this.i = zhmVarV.w(kplVar, zgtVar);
                defpackage.zhm zhmVarV2 = defpackage.zhm.v(this.i);
                zhmVarV2.c(new defpackage.zhi(zhmVarV2, new defpackage.reo(this, reiVar, i)), zgtVar);
            } else if (this.l) {
                new defpackage.stq(this.e).post(new defpackage.qth(this, 10));
            }
            this.l = false;
            zhsVar = this.i;
        }
        return zhsVar;
    }

    public final void f() {
        synchronized (this.f) {
            if (b()) {
                this.k = true;
                try {
                    this.b.a();
                    synchronized (this.f) {
                        this.k = false;
                        if (this.l) {
                            this.l = false;
                            g();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    synchronized (this.f) {
                        this.k = false;
                        if (this.l) {
                            this.l = false;
                            g();
                        }
                        throw th;
                    }
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f) {
            if (this.k) {
                if (defpackage.rrx.e("CAR.TOKEN", 4)) {
                    defpackage.rrx.d(4, "CAR.TOKEN", null, "Will disconnect after connection callbacks finish running.", new java.lang.Object[0]);
                }
                this.l = true;
                return;
            }
            int i = this.j;
            if (defpackage.rrx.e("CAR.TOKEN", 4)) {
                defpackage.zke zkeVar = defpackage.zke.a;
                defpackage.rrx.d(4, "CAR.TOKEN", null, "Disconnecting %s (cx attempt: %s).", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
            }
            defpackage.zhs zhsVar = this.i;
            zhsVar.c(new defpackage.zhi(zhsVar, new defpackage.rep(this, i)), defpackage.zgt.INSTANCE);
            if (!this.i.isDone()) {
                defpackage.rrx.d(5, "CAR.TOKEN", null, "Client connection future not done, canceling.", new java.lang.Object[0]);
                this.i.cancel(false);
            }
            this.i = this.h;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean h() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("blockingConnect() cannot be called on the main thread.");
        }
        try {
            e().get();
            return true;
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            return b();
        }
    }
}
