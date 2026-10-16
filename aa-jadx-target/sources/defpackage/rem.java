package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rem implements defpackage.reh {
    public final android.content.Context a;
    public final defpackage.rel b;
    public final defpackage.reg d;
    public final defpackage.wyz e;
    private defpackage.zhs f;
    public final android.os.Handler c = new defpackage.stq(android.os.Looper.getMainLooper());
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:17:0x008c A[Catch: SecurityException -> 0x009a, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x009a, blocks: (B:3:0x003e, B:5:0x0048, B:7:0x0052, B:9:0x005c, B:15:0x0080, B:17:0x008c, B:13:0x0069), top: B:23:0x003e }] */
    public rem(android.content.Context context, defpackage.reg regVar, defpackage.wyz wyzVar) {
        android.content.Context context2;
        android.content.Intent component = new android.content.Intent().setComponent(defpackage.qtu.a);
        this.a = context;
        this.d = regVar;
        this.e = wyzVar;
        defpackage.rel relVar = new defpackage.rel(this);
        this.b = relVar;
        this.f = defpackage.dlv.n(new defpackage.rek(this, 0));
        defpackage.doe doeVar = relVar.a;
        doeVar.getClass();
        try {
            if (android.os.Build.HARDWARE.equals("goldfish") || android.os.Build.HARDWARE.equals("ranchu") || android.os.Build.HARDWARE.equals("cutf_cvm") || android.os.Build.HARDWARE.equals("starfish")) {
                context2 = context;
                if (!defpackage.sqf.a().e(context2, context.getClass().getName(), component, relVar, 129, false, null)) {
                    h();
                    g(new rdc("Gearhead Car Startup Service not found, or process cannot bind."), doeVar);
                }
                doeVar.a(new defpackage.qtk(this, 6), defpackage.zgt.INSTANCE);
            }
            context2 = context;
            if (!defpackage.sqf.a().d(context2, component, relVar, 129)) {
                h();
                g(new rdc("Gearhead Car Startup Service not found, or process cannot bind."), doeVar);
            }
        } catch (java.lang.SecurityException e) {
            g(new rdc(e), doeVar);
        }
        doeVar.a(new defpackage.qtk(this, 6), defpackage.zgt.INSTANCE);
    }

    public static void e(android.os.Handler handler, java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final synchronized defpackage.zhs i() {
        return this.f;
    }

    @Override // defpackage.reh
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized defpackage.qvl a() {
        defpackage.zhs zhsVar;
        defpackage.zhs zhsVar2 = this.f;
        if (zhsVar2 == null || !zhsVar2.isDone()) {
            throw new java.lang.IllegalStateException("Client is not connected yet.");
        }
        try {
            zhsVar = this.f;
            defpackage.ysr.bn(zhsVar.isDone(), "Future was expected to be done: %s", zhsVar);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.lang.IllegalStateException) {
                throw new java.lang.IllegalStateException("Client is not connected.", cause);
            }
            if (cause instanceof defpackage.rdd) {
                throw new java.lang.IllegalStateException("Client connection failed.", cause);
            }
            throw new java.lang.IllegalStateException("Client not connected.", cause);
        }
        return (defpackage.qvl) defpackage.a.K(zhsVar);
    }

    @Override // defpackage.reh
    public final defpackage.zhs b() {
        defpackage.zhs zhsVarI = i();
        defpackage.kpo kpoVar = new defpackage.kpo(2);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        int i = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(zhsVarI, kpoVar);
        zhsVarI.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
        return zggVar;
    }

    @Override // defpackage.reh
    public final synchronized void c() {
        if (!this.g.compareAndSet(false, true)) {
            if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
                defpackage.rrx.d(4, "GH.GhCarClientCtor", null, "GearheadCarClientConnector has already been disconnected.", new java.lang.Object[0]);
            }
        } else {
            if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
                defpackage.rrx.d(4, "GH.GhCarClientCtor", null, "Disconnecting GearheadCarClientConnector.", new java.lang.Object[0]);
            }
            if (!this.f.isDone()) {
                this.f.cancel(true);
            }
            h();
            this.f = new defpackage.zif(new java.lang.IllegalStateException("Client has been disconnected and cannot be used."));
        }
    }

    @Override // defpackage.reh
    public final synchronized boolean d() {
        throw null;
    }

    public final synchronized void f(defpackage.rdd rddVar, defpackage.doe doeVar) {
        defpackage.zhs zhsVar = this.f;
        if (zhsVar == null) {
            this.f = new defpackage.zif(rddVar);
            return;
        }
        if (!zhsVar.isDone() && doeVar != null) {
            doeVar.d(rddVar);
            return;
        }
        if (defpackage.oml.L(this.f)) {
            this.f = new defpackage.zif(rddVar);
        }
    }

    public final void g(defpackage.rdd rddVar, defpackage.doe doeVar) {
        if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
            java.lang.Throwable cause = rddVar.getCause();
            if (cause == null) {
                defpackage.rrx.d(4, "GH.GhCarClientCtor", rddVar, "onConnectionFailure: %s", new defpackage.zkf(defpackage.zke.a, rddVar.getMessage()));
            } else {
                java.lang.String message = rddVar.getMessage();
                defpackage.zke zkeVar = defpackage.zke.a;
                defpackage.rrx.d(4, "GH.GhCarClientCtor", rddVar, "onConnectionFailure: %s, caused by %s: %s", new defpackage.zkf(zkeVar, message), new defpackage.zkf(zkeVar, cause.getClass().getName()), new defpackage.zkf(zkeVar, cause.getMessage()));
            }
        }
        f(rddVar, doeVar);
        e(this.c, new defpackage.qnf(this, rddVar, 10, (short[]) null));
    }

    public final void h() {
        if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
            defpackage.rrx.d(4, "GH.GhCarClientCtor", null, "Unbinding service connection.", new java.lang.Object[0]);
        }
        defpackage.sqf.a().c(this.a, this.b);
    }
}
